package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is thrown in order to transport an error to Basic.
  * @since OOo 2.0
  */
@js.native
trait BasicErrorException extends Exception {
  /** The error code. */
  var ErrorCode: Double = js.native
  /** Specifies the argument which is used in the localized error message for the placeholder. */
  var ErrorMessageArgument: String = js.native
}

object BasicErrorException {
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, ErrorMessageArgument: String, Message: String): BasicErrorException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessageArgument = ErrorMessageArgument.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicErrorException]
  }
  @scala.inline
  implicit class BasicErrorExceptionOps[Self <: BasicErrorException] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessageArgument(value: String): Self = this.set("ErrorMessageArgument", value.asInstanceOf[js.Any])
  }
  
}

