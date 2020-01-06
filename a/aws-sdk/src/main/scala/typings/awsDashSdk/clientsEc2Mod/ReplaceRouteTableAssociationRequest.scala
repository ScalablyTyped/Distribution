package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceRouteTableAssociationRequest extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: RouteTableAssociationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the new route table to associate with the subnet.
    */
  var RouteTableId: typings.awsDashSdk.clientsEc2Mod.RouteTableId = js.native
}

object ReplaceRouteTableAssociationRequest {
  @scala.inline
  def apply(
    AssociationId: RouteTableAssociationId,
    RouteTableId: RouteTableId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ReplaceRouteTableAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRouteTableAssociationRequest]
  }
}

