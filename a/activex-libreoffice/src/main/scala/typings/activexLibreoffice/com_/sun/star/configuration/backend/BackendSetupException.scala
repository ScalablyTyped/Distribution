package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic exception thrown when setting up a connection to an underlying backend fails.
  *
  * Indicates an error that originates in the underlying access layer.
  * @since OOo 1.1.2
  */
@js.native
trait BackendSetupException extends Exception {
  /**
    * The exception that is raised by the underlying backend implementation.
    *
    * May be a numeric error code, a message `string` or `VOID` , if the original exception is not represented as a {@link com.sun.star.uno.Exception} .
    */
  var BackendException: js.Any = js.native
}

object BackendSetupException {
  @scala.inline
  def apply(BackendException: js.Any, Context: XInterface, Message: String): BackendSetupException = {
    val __obj = js.Dynamic.literal(BackendException = BackendException.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendSetupException]
  }
  @scala.inline
  implicit class BackendSetupExceptionOps[Self <: BackendSetupException] (val x: Self) extends AnyVal {
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
    def setBackendException(value: js.Any): Self = this.set("BackendException", value.asInstanceOf[js.Any])
  }
  
}

