package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the structure of an Uniform Resource Locator.
  *
  * If the structure represents a valid {@link URL} or not depends on prior usage of the functions of {@link XURLTransformer} . Only after one of the
  * functions returned `TRUE` this can be assumed. ;  It is not necessary to set all of the fields; either {@link URL.Complete} or (some of) the others
  * are set. Additionally, most of the other fields, like URL::Host, {@link URL.Port} , {@link URL.User} , {@link URL.Password} , or {@link URL.Mark} ,
  * are optional.
  * @see XURLTransformer
  */
trait URL extends js.Object {
  /** contains the arguments part of the {@link URL} , for example, "a=b" */
  var Arguments: java.lang.String
  /**
    * contains the string representation of the complete {@link URL} , for example, [http://www.sun.de:8080/pub/test/foo.txt?a=b#xyz]{@link
    * url="http://www.sun.de:8080/pub/test/foo.txt?a=b#xyz"}
    *
    * It is used as a central input/output or input parameter for the interfaces of {@link XURLTransformer} . The usage of one of the {@link
    * XURLTransformer} function is mandatory to validate the {@link URL} . It cannot be assumed that {@link URL.Complete} represents always a valid URL!
    */
  var Complete: java.lang.String
  /**
    * contains the {@link URL} without a mark and without arguments, for example, [http://www.sun.de:8080/pub/test/foo.txt]{@link
    * url="http://www.sun.de:8080/pub/test/foo.txt"}
    */
  var Main: java.lang.String
  /** contains the mark part of the {@link URL} , for example, "xyz" */
  var Mark: java.lang.String
  /**
    * contains the last segment of the hierarchical path of the {@link URL} , for the above example, "foo.txt"
    *
    * **Attention:** A service implementing the {@link XURLTransformer} interface will normally not detect if the last segment is a folder or a file. So it
    * is possible that the last segment describes a folder. If you want to be sure that a file {@link URL} that references a folder will be correctly put
    * into the {@link URL} fields you should append a "/" at the end of the hierarchical path.
    */
  var Name: java.lang.String
  /** contains the users password of the {@link URL} , for example, "pass" */
  var Password: java.lang.String
  /** contains all segments but the last one of the hierarchical path of the {@link URL} , for example, "/pub/test/" */
  var Path: java.lang.String
  /** contains the port at the server of the {@link URL} , for example, "8080" */
  var Port: scala.Double
  /** contains the protocol (scheme) of the {@link URL} , for example, "http" */
  var Protocol: java.lang.String
  /** contains the server part of the {@link URL} , for example, "www.sun.de" */
  var Server: java.lang.String
  /** contains the user-identifier of the {@link URL} , for example, "me" */
  var User: java.lang.String
}

object URL {
  @scala.inline
  def apply(
    Arguments: java.lang.String,
    Complete: java.lang.String,
    Main: java.lang.String,
    Mark: java.lang.String,
    Name: java.lang.String,
    Password: java.lang.String,
    Path: java.lang.String,
    Port: scala.Double,
    Protocol: java.lang.String,
    Server: java.lang.String,
    User: java.lang.String
  ): URL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Arguments")(Arguments)
    __obj.updateDynamic("Complete")(Complete)
    __obj.updateDynamic("Main")(Main)
    __obj.updateDynamic("Mark")(Mark)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Password")(Password)
    __obj.updateDynamic("Path")(Path)
    __obj.updateDynamic("Port")(Port)
    __obj.updateDynamic("Protocol")(Protocol)
    __obj.updateDynamic("Server")(Server)
    __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[URL]
  }
}

