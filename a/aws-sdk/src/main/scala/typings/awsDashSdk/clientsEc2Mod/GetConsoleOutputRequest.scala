package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConsoleOutputRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * When enabled, retrieves the latest console output for the instance. Default: disabled (false)
    */
  var Latest: js.UndefOr[Boolean] = js.undefined
}

object GetConsoleOutputRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Latest: js.UndefOr[scala.Boolean] = js.undefined
  ): GetConsoleOutputRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Latest)) __obj.updateDynamic("Latest")(Latest)
    __obj.asInstanceOf[GetConsoleOutputRequest]
  }
}

