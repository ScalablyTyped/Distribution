package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC peering connection. You must specify this parameter in the request.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}

object AcceptVpcPeeringConnectionRequest {
  @scala.inline
  def apply(DryRun: js.UndefOr[Boolean] = js.undefined, VpcPeeringConnectionId: String = null): AcceptVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId)
    __obj.asInstanceOf[AcceptVpcPeeringConnectionRequest]
  }
}

