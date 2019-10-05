package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFlowLogsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more flow log IDs. Constraint: Maximum of 1000 flow log IDs.
    */
  var FlowLogIds: ValueStringList
}

object DeleteFlowLogsRequest {
  @scala.inline
  def apply(FlowLogIds: ValueStringList, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteFlowLogsRequest = {
    val __obj = js.Dynamic.literal(FlowLogIds = FlowLogIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteFlowLogsRequest]
  }
}

