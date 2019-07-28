package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConsoleScreenshotRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * When set to true, acts as keystroke input and wakes up an instance that's in standby or "sleep" mode.
    */
  var WakeUp: js.UndefOr[Boolean] = js.undefined
}

object GetConsoleScreenshotRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    WakeUp: js.UndefOr[Boolean] = js.undefined
  ): GetConsoleScreenshotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(WakeUp)) __obj.updateDynamic("WakeUp")(WakeUp)
    __obj.asInstanceOf[GetConsoleScreenshotRequest]
  }
}

