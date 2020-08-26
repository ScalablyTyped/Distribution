package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a runtime exception that wraps any other exception thrown by the original target.
  *
  * This exception should not be declared at interfaces, use {@link WrappedTargetException} instead. It was defined to transport an exception via
  * interface-methods, that do not specify the appropriate exceptions (so using this exception should in general be avoided).
  */
@js.native
trait WrappedTargetRuntimeException extends Exception {
  /** The exception is thrown by the target. */
  var TargetException: js.Any = js.native
}

object WrappedTargetRuntimeException {
  @scala.inline
  def apply(Context: XInterface, Message: String, TargetException: js.Any): WrappedTargetRuntimeException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TargetException = TargetException.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedTargetRuntimeException]
  }
  @scala.inline
  implicit class WrappedTargetRuntimeExceptionOps[Self <: WrappedTargetRuntimeException] (val x: Self) extends AnyVal {
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
    def setTargetException(value: js.Any): Self = this.set("TargetException", value.asInstanceOf[js.Any])
  }
  
}

