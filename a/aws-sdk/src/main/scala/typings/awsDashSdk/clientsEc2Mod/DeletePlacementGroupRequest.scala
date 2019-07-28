package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePlacementGroupRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the placement group.
    */
  var GroupName: String
}

object DeletePlacementGroupRequest {
  @scala.inline
  def apply(GroupName: String, DryRun: js.UndefOr[Boolean] = js.undefined): DeletePlacementGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeletePlacementGroupRequest]
  }
}

