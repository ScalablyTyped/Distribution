package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedScheduledUpdateGroupActionRequest extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.undefined
  /**
    * The error message accompanying the error code.
    */
  var ErrorMessage: js.UndefOr[XmlString] = js.undefined
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: XmlStringMaxLen255
}

object FailedScheduledUpdateGroupActionRequest {
  @scala.inline
  def apply(
    ScheduledActionName: XmlStringMaxLen255,
    ErrorCode: XmlStringMaxLen64 = null,
    ErrorMessage: XmlString = null
  ): FailedScheduledUpdateGroupActionRequest = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.asInstanceOf[FailedScheduledUpdateGroupActionRequest]
  }
}

