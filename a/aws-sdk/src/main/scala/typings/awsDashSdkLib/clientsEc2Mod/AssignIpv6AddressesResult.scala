package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignIpv6AddressesResult extends js.Object {
  /**
    * The IPv6 addresses assigned to the network interface.
    */
  var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
}

object AssignIpv6AddressesResult {
  @scala.inline
  def apply(AssignedIpv6Addresses: Ipv6AddressList = null, NetworkInterfaceId: String = null): AssignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    if (AssignedIpv6Addresses != null) __obj.updateDynamic("AssignedIpv6Addresses")(AssignedIpv6Addresses)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    __obj.asInstanceOf[AssignIpv6AddressesResult]
  }
}

