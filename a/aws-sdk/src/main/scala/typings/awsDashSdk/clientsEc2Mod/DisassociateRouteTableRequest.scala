package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateRouteTableRequest extends js.Object {
  /**
    * The association ID representing the current association between the route table and subnet.
    */
  var AssociationId: RouteTableAssociationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DisassociateRouteTableRequest {
  @scala.inline
  def apply(AssociationId: RouteTableAssociationId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DisassociateRouteTableRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRouteTableRequest]
  }
}

