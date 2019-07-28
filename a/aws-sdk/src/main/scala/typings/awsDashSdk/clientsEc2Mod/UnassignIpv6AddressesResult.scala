package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnassignIpv6AddressesResult extends js.Object {
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The IPv6 addresses that have been unassigned from the network interface.
    */
  var UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
}

object UnassignIpv6AddressesResult {
  @scala.inline
  def apply(NetworkInterfaceId: String = null, UnassignedIpv6Addresses: Ipv6AddressList = null): UnassignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (UnassignedIpv6Addresses != null) __obj.updateDynamic("UnassignedIpv6Addresses")(UnassignedIpv6Addresses)
    __obj.asInstanceOf[UnassignIpv6AddressesResult]
  }
}

