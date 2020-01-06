package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcPeeringConnectionOptionsRequest extends js.Object {
  /**
    * The VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: typings.awsDashSdk.clientsEc2Mod.VpcPeeringConnectionId = js.native
}

object ModifyVpcPeeringConnectionOptionsRequest {
  @scala.inline
  def apply(
    VpcPeeringConnectionId: VpcPeeringConnectionId,
    AccepterPeeringConnectionOptions: PeeringConnectionOptionsRequest = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RequesterPeeringConnectionOptions: PeeringConnectionOptionsRequest = null
  ): ModifyVpcPeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    if (AccepterPeeringConnectionOptions != null) __obj.updateDynamic("AccepterPeeringConnectionOptions")(AccepterPeeringConnectionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (RequesterPeeringConnectionOptions != null) __obj.updateDynamic("RequesterPeeringConnectionOptions")(RequesterPeeringConnectionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
  }
}

