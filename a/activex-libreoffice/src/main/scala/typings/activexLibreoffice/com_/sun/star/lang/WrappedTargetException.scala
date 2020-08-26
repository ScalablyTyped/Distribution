package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a checked exception that wraps an exception thrown by the original target.
  *
  * Normally this exception is declared for generic methods.
  * @see com.sun.star.container.XIndexAccess
  * @see com.sun.star.container.XNameAccess
  * @see com.sun.star.beans.XPropertySet
  */
@js.native
trait WrappedTargetException extends Exception {
  /** The exception is thrown by the target. */
  var TargetException: js.Any = js.native
}

object WrappedTargetException {
  @scala.inline
  def apply(Context: XInterface, Message: String, TargetException: js.Any): WrappedTargetException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TargetException = TargetException.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedTargetException]
  }
  @scala.inline
  implicit class WrappedTargetExceptionOps[Self <: WrappedTargetException] (val x: Self) extends AnyVal {
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

