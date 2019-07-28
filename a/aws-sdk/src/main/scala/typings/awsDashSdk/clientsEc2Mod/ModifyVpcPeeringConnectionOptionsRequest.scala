package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcPeeringConnectionOptionsRequest extends js.Object {
  /**
    * The VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: String
}

object ModifyVpcPeeringConnectionOptionsRequest {
  @scala.inline
  def apply(
    VpcPeeringConnectionId: String,
    AccepterPeeringConnectionOptions: PeeringConnectionOptionsRequest = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    RequesterPeeringConnectionOptions: PeeringConnectionOptionsRequest = null
  ): ModifyVpcPeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId)
    if (AccepterPeeringConnectionOptions != null) __obj.updateDynamic("AccepterPeeringConnectionOptions")(AccepterPeeringConnectionOptions)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (RequesterPeeringConnectionOptions != null) __obj.updateDynamic("RequesterPeeringConnectionOptions")(RequesterPeeringConnectionOptions)
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
  }
}

