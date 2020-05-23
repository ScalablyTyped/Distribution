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
trait BasicErrorException extends Exception {
  /** The error code. */
  var ErrorCode: Double
  /** Specifies the argument which is used in the localized error message for the placeholder. */
  var ErrorMessageArgument: String
}

object BasicErrorException {
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, ErrorMessageArgument: String, Message: String): BasicErrorException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessageArgument = ErrorMessageArgument.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicErrorException]
  }
}

