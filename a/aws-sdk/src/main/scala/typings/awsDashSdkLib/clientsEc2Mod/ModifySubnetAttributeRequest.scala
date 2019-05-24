package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifySubnetAttributeRequest extends js.Object {
  /**
    * Specify true to indicate that network interfaces created in the specified subnet should be assigned an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the instance therefore receives an IPv6 address).  If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an IPv6 address if it's created using version 2016-11-15 or later of the Amazon EC2 API.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Specify true to indicate that ENIs attached to instances created in the specified subnet should be assigned a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * The ID of the subnet.
    */
  var SubnetId: String
}

object ModifySubnetAttributeRequest {
  @scala.inline
  def apply(
    SubnetId: String,
    AssignIpv6AddressOnCreation: AttributeBooleanValue = null,
    MapPublicIpOnLaunch: AttributeBooleanValue = null
  ): ModifySubnetAttributeRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId)
    if (AssignIpv6AddressOnCreation != null) __obj.updateDynamic("AssignIpv6AddressOnCreation")(AssignIpv6AddressOnCreation)
    if (MapPublicIpOnLaunch != null) __obj.updateDynamic("MapPublicIpOnLaunch")(MapPublicIpOnLaunch)
    __obj.asInstanceOf[ModifySubnetAttributeRequest]
  }
}

