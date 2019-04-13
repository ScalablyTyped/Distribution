package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRouteTableAssociationRequest extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the new route table to associate with the subnet.
    */
  var RouteTableId: String
}

object ReplaceRouteTableAssociationRequest {
  @scala.inline
  def apply(AssociationId: String, RouteTableId: String, DryRun: js.UndefOr[Boolean] = js.undefined): ReplaceRouteTableAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId, RouteTableId = RouteTableId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ReplaceRouteTableAssociationRequest]
  }
}

