package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpnConnectionRouteRequest extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  var DestinationCidrBlock: String
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: String
}

object CreateVpnConnectionRouteRequest {
  @scala.inline
  def apply(DestinationCidrBlock: String, VpnConnectionId: String): CreateVpnConnectionRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock, VpnConnectionId = VpnConnectionId)
  
    __obj.asInstanceOf[CreateVpnConnectionRouteRequest]
  }
}

