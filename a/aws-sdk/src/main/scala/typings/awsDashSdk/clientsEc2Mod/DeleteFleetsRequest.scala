package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the EC2 Fleets.
    */
  var FleetIds: FleetIdSet
  /**
    * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
    */
  var TerminateInstances: Boolean
}

object DeleteFleetsRequest {
  @scala.inline
  def apply(
    FleetIds: FleetIdSet,
    TerminateInstances: Boolean,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteFleetsRequest = {
    val __obj = js.Dynamic.literal(FleetIds = FleetIds, TerminateInstances = TerminateInstances)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteFleetsRequest]
  }
}

