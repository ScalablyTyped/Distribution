package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The time the error occurred.
    */
  var ErrorTimestamp: js.UndefOr[Timestamp] = js.undefined
}

object ResourceError {
  @scala.inline
  def apply(ErrorCode: FleetErrorCode = null, ErrorMessage: String = null, ErrorTimestamp: Timestamp = null): ResourceError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (ErrorTimestamp != null) __obj.updateDynamic("ErrorTimestamp")(ErrorTimestamp)
    __obj.asInstanceOf[ResourceError]
  }
}

