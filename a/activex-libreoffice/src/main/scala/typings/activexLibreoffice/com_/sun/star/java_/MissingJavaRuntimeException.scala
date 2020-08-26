package typings.activexLibreoffice.com_.sun.star.java_

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * indicates that the Java runtime library could not be found.
  *
  * This happens when a user moves or deletes a Java installation after the office has been configured to use that Java installation.
  * @since OOo 1.1.2
  */
@js.native
trait MissingJavaRuntimeException extends Exception {
  /** contains the path to the runtime lib as file URL. */
  var URLRuntimeLib: String = js.native
}

object MissingJavaRuntimeException {
  @scala.inline
  def apply(Context: XInterface, Message: String, URLRuntimeLib: String): MissingJavaRuntimeException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], URLRuntimeLib = URLRuntimeLib.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingJavaRuntimeException]
  }
  @scala.inline
  implicit class MissingJavaRuntimeExceptionOps[Self <: MissingJavaRuntimeException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setURLRuntimeLib(value: String): Self = this.set("URLRuntimeLib", value.asInstanceOf[js.Any])
  }
  
}

