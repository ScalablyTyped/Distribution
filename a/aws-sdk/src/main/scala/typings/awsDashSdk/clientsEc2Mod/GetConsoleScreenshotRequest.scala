package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConsoleScreenshotRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsDashSdk.clientsEc2Mod.InstanceId = js.native
  /**
    * When set to true, acts as keystroke input and wakes up an instance that's in standby or "sleep" mode.
    */
  var WakeUp: js.UndefOr[Boolean] = js.native
}

object GetConsoleScreenshotRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    WakeUp: js.UndefOr[scala.Boolean] = js.undefined
  ): GetConsoleScreenshotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(WakeUp)) __obj.updateDynamic("WakeUp")(WakeUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsoleScreenshotRequest]
  }
}

