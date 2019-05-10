package b;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class jun extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public jun() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		 session.setAttribute("account", "wangwu");//session�������
	        session.setAttribute("password", "123456");
        String sessionId = session.getId();// ��ȡsession��Id
        if (session.isNew()) {// �ж�session�ǲ����´�����
            out.println("session�����ɹ���session��id�ǣ�" + sessionId);
        } else {
            out.println("�������Ѿ����ڸ�session�ˣ�session��id�ǣ�" + sessionId);
        }
           Cookie[] cookies = request.getCookies();//��ȡ���������е�Cookie
        if(cookies!=null){
            for(int i=0;i<cookies.length;i++){
                out.println("Cookie Name:"+cookies[i].getName());//���Cookie������
                out.println("Cookie Value:"+cookies[i].getValue());//���Cookie��ֵ
            }
        }else{
            out.println("No Cookies");
        }
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		 session.setAttribute("account", "wangwu");//session�������
	        session.setAttribute("password", "123456");
        String sessionId = session.getId();// ��ȡsession��Id
        if (session.isNew()) {// �ж�session�ǲ����´�����
            out.println("session�����ɹ���session��id�ǣ�" + sessionId);
        } else {
            out.println("�������Ѿ����ڸ�session�ˣ�session��id�ǣ�" + sessionId);
        }
           Cookie[] cookies = request.getCookies();//��ȡ���������е�Cookie
        if(cookies!=null){
            for(int i=0;i<cookies.length;i++){
                out.println("Cookie Name:"+cookies[i].getName());//���Cookie������
                out.println("Cookie Value:"+cookies[i].getValue());//���Cookie��ֵ
            }
        }else{
            out.println("No Cookies");
        }
    }
	

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
