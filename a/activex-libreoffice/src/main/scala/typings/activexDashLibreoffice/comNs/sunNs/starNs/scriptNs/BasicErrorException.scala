package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context, ErrorCode = ErrorCode, ErrorMessageArgument = ErrorMessageArgument, Message = Message)
  
    __obj.asInstanceOf[BasicErrorException]
  }
}

