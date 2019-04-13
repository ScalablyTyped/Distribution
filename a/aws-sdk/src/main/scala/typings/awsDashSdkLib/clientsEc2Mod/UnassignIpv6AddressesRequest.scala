package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnassignIpv6AddressesRequest extends js.Object {
  /**
    * The IPv6 addresses to unassign from the network interface.
    */
  var Ipv6Addresses: Ipv6AddressList
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
}

object UnassignIpv6AddressesRequest {
  @scala.inline
  def apply(Ipv6Addresses: Ipv6AddressList, NetworkInterfaceId: String): UnassignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(Ipv6Addresses = Ipv6Addresses, NetworkInterfaceId = NetworkInterfaceId)
  
    __obj.asInstanceOf[UnassignIpv6AddressesRequest]
  }
}

