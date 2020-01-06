package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnassignIpv6AddressesRequest extends js.Object {
  /**
    * The IPv6 addresses to unassign from the network interface.
    */
  var Ipv6Addresses: Ipv6AddressList = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsDashSdk.clientsEc2Mod.NetworkInterfaceId = js.native
}

object UnassignIpv6AddressesRequest {
  @scala.inline
  def apply(Ipv6Addresses: Ipv6AddressList, NetworkInterfaceId: NetworkInterfaceId): UnassignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(Ipv6Addresses = Ipv6Addresses.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnassignIpv6AddressesRequest]
  }
}

