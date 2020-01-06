package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConsoleOutputRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsDashSdk.clientsEc2Mod.InstanceId = js.native
  /**
    * When enabled, retrieves the latest console output for the instance. Default: disabled (false)
    */
  var Latest: js.UndefOr[Boolean] = js.native
}

object GetConsoleOutputRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Latest: js.UndefOr[scala.Boolean] = js.undefined
  ): GetConsoleOutputRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(Latest)) __obj.updateDynamic("Latest")(Latest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsoleOutputRequest]
  }
}

