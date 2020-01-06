package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignIpv6AddressesResult extends js.Object {
  /**
    * The IPv6 addresses assigned to the network interface.
    */
  var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
}

object AssignIpv6AddressesResult {
  @scala.inline
  def apply(AssignedIpv6Addresses: Ipv6AddressList = null, NetworkInterfaceId: String = null): AssignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    if (AssignedIpv6Addresses != null) __obj.updateDynamic("AssignedIpv6Addresses")(AssignedIpv6Addresses.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignIpv6AddressesResult]
  }
}

