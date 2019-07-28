package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeClientVpnIngressRequest extends js.Object {
  /**
    * The ID of the Active Directory group for which to revoke access. 
    */
  var AccessGroupId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether access should be revoked for all clients.
    */
  var RevokeAllGroups: js.UndefOr[Boolean] = js.undefined
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
    */
  var TargetNetworkCidr: String
}

object RevokeClientVpnIngressRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    TargetNetworkCidr: String,
    AccessGroupId: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    RevokeAllGroups: js.UndefOr[Boolean] = js.undefined
  ): RevokeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId, TargetNetworkCidr = TargetNetworkCidr)
    if (AccessGroupId != null) __obj.updateDynamic("AccessGroupId")(AccessGroupId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(RevokeAllGroups)) __obj.updateDynamic("RevokeAllGroups")(RevokeAllGroups)
    __obj.asInstanceOf[RevokeClientVpnIngressRequest]
  }
}

