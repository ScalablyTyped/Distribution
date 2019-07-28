package typings.activexDashLibreoffice.comNs.sunNs.starNs.javaNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * indicates that the Java runtime library could not be found.
  *
  * This happens when a user moves or deletes a Java installation after the office has been configured to use that Java installation.
  * @since OOo 1.1.2
  */
trait MissingJavaRuntimeException extends Exception {
  /** contains the path to the runtime lib as file URL. */
  var URLRuntimeLib: String
}

object MissingJavaRuntimeException {
  @scala.inline
  def apply(Context: XInterface, Message: String, URLRuntimeLib: String): MissingJavaRuntimeException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, URLRuntimeLib = URLRuntimeLib)
  
    __obj.asInstanceOf[MissingJavaRuntimeException]
  }
}

