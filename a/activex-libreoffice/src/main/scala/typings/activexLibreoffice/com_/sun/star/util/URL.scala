package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the structure of an Uniform Resource Locator.
  *
  * If the structure represents a valid {@link URL} or not depends on prior usage of the functions of {@link XURLTransformer} . Only after one of the
  * functions returned `TRUE` this can be assumed. ;  It is not necessary to set all of the fields; either {@link URL.Complete} or (some of) the others
  * are set. Additionally, most of the other fields, like URL::Host, {@link URL.Port} , {@link URL.User} , {@link URL.Password} , or {@link URL.Mark} ,
  * are optional.
  * @see XURLTransformer
  */
trait URL extends StObject {
  
  /** contains the arguments part of the {@link URL} , for example, "a=b" */
  var Arguments: String
  
  /**
    * contains the string representation of the complete {@link URL} , for example, [http://www.sun.de:8080/pub/test/foo.txt?a=b#xyz]{@link
    * url="http://www.sun.de:8080/pub/test/foo.txt?a=b#xyz"}
    *
    * It is used as a central input/output or input parameter for the interfaces of {@link XURLTransformer} . The usage of one of the {@link
    * XURLTransformer} function is mandatory to validate the {@link URL} . It cannot be assumed that {@link URL.Complete} represents always a valid URL!
    */
  var Complete: String
  
  /**
    * contains the {@link URL} without a mark and without arguments, for example, [http://www.sun.de:8080/pub/test/foo.txt]{@link
    * url="http://www.sun.de:8080/pub/test/foo.txt"}
    */
  var Main: String
  
  /** contains the mark part of the {@link URL} , for example, "xyz" */
  var Mark: String
  
  /**
    * contains the last segment of the hierarchical path of the {@link URL} , for the above example, "foo.txt"
    *
    * **Attention:** A service implementing the {@link XURLTransformer} interface will normally not detect if the last segment is a folder or a file. So it
    * is possible that the last segment describes a folder. If you want to be sure that a file {@link URL} that references a folder will be correctly put
    * into the {@link URL} fields you should append a "/" at the end of the hierarchical path.
    */
  var Name: String
  
  /** contains the users password of the {@link URL} , for example, "pass" */
  var Password: String
  
  /** contains all segments but the last one of the hierarchical path of the {@link URL} , for example, "/pub/test/" */
  var Path: String
  
  /** contains the port at the server of the {@link URL} , for example, "8080" */
  var Port: Double
  
  /** contains the protocol (scheme) of the {@link URL} , for example, "http" */
  var Protocol: String
  
  /** contains the server part of the {@link URL} , for example, "www.sun.de" */
  var Server: String
  
  /** contains the user-identifier of the {@link URL} , for example, "me" */
  var User: String
}
object URL {
  
  @scala.inline
  def apply(
    Arguments: String,
    Complete: String,
    Main: String,
    Mark: String,
    Name: String,
    Password: String,
    Path: String,
    Port: Double,
    Protocol: String,
    Server: String,
    User: String
  ): URL = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Complete = Complete.asInstanceOf[js.Any], Main = Main.asInstanceOf[js.Any], Mark = Mark.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[URL]
  }
  
  @scala.inline
  implicit class URLMutableBuilder[Self <: URL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: String): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: String): Self = StObject.set(x, "Complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: String): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMark(value: String): Self = StObject.set(x, "Mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
