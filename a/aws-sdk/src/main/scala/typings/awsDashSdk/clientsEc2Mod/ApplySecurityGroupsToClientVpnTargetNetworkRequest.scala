package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplySecurityGroupsToClientVpnTargetNetworkRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied to an associated target network.
    */
  var SecurityGroupIds: ClientVpnSecurityGroupIdSet
  /**
    * The ID of the VPC in which the associated target network is located.
    */
  var VpcId: String
}

object ApplySecurityGroupsToClientVpnTargetNetworkRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    SecurityGroupIds: ClientVpnSecurityGroupIdSet,
    VpcId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId, SecurityGroupIds = SecurityGroupIds, VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkRequest]
  }
}

