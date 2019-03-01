package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is thrown in order to transport an error to Basic.
  * @since OOo 2.0
  */
trait BasicErrorException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The error code. */
  var ErrorCode: scala.Double
  /** Specifies the argument which is used in the localized error message for the placeholder. */
  var ErrorMessageArgument: java.lang.String
}

object BasicErrorException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrorCode: scala.Double,
    ErrorMessageArgument: java.lang.String,
    Message: java.lang.String
  ): BasicErrorException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("ErrorCode")(ErrorCode)
    __obj.updateDynamic("ErrorMessageArgument")(ErrorMessageArgument)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[BasicErrorException]
  }
}

