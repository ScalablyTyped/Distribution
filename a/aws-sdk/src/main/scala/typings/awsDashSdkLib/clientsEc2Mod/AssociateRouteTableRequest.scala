package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateRouteTableRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the route table.
    */
  var RouteTableId: String
  /**
    * The ID of the subnet.
    */
  var SubnetId: String
}

object AssociateRouteTableRequest {
  @scala.inline
  def apply(RouteTableId: String, SubnetId: String, DryRun: js.UndefOr[Boolean] = js.undefined): AssociateRouteTableRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId, SubnetId = SubnetId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AssociateRouteTableRequest]
  }
}

