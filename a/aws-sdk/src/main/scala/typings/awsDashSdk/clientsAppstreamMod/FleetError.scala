package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
}

object FleetError {
  @scala.inline
  def apply(ErrorCode: FleetErrorCode = null, ErrorMessage: String = null): FleetError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.asInstanceOf[FleetError]
  }
}

