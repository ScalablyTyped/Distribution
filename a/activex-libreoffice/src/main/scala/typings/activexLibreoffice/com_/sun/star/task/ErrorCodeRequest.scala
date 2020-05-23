package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a general error exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 1.1.2
  */
trait ErrorCodeRequest extends Exception {
  /** specifies the error code. */
  var ErrCode: Double
}

object ErrorCodeRequest {
  @scala.inline
  def apply(Context: XInterface, ErrCode: Double, Message: String): ErrorCodeRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrCode = ErrCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeRequest]
  }
}

