package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedScheduledUpdateGroupActionRequest extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The error message accompanying the error code.
    */
  var ErrorMessage: js.UndefOr[XmlString] = js.native
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: XmlStringMaxLen255 = js.native
}

object FailedScheduledUpdateGroupActionRequest {
  @scala.inline
  def apply(
    ScheduledActionName: XmlStringMaxLen255,
    ErrorCode: XmlStringMaxLen64 = null,
    ErrorMessage: XmlString = null
  ): FailedScheduledUpdateGroupActionRequest = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedScheduledUpdateGroupActionRequest]
  }
}

