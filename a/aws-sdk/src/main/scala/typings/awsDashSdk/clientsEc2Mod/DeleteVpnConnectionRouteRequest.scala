package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpnConnectionRouteRequest extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typings.awsDashSdk.clientsEc2Mod.VpnConnectionId = js.native
}

object DeleteVpnConnectionRouteRequest {
  @scala.inline
  def apply(DestinationCidrBlock: String, VpnConnectionId: VpnConnectionId): DeleteVpnConnectionRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVpnConnectionRouteRequest]
  }
}

