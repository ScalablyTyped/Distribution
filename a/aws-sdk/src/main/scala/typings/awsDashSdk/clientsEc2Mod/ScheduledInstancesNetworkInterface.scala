package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesNetworkInterface extends js.Object {
  /**
    * Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to delete the interface when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The index of the device for the network interface attachment.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The IDs of the security groups.
    */
  var Groups: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.native
  /**
    * The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically selected from the subnet range.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * The specific IPv6 addresses from the subnet range.
    */
  var Ipv6Addresses: js.UndefOr[ScheduledInstancesIpv6AddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The private IPv4 addresses.
    */
  var PrivateIpAddressConfigs: js.UndefOr[PrivateIpAddressConfigSet] = js.native
  /**
    * The number of secondary private IPv4 addresses.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object ScheduledInstancesNetworkInterface {
  @scala.inline
  def apply(
    AssociatePublicIpAddress: js.UndefOr[scala.Boolean] = js.undefined,
    DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    Description: String = null,
    DeviceIndex: Int | scala.Double = null,
    Groups: ScheduledInstancesSecurityGroupIdSet = null,
    Ipv6AddressCount: Int | scala.Double = null,
    Ipv6Addresses: ScheduledInstancesIpv6AddressList = null,
    NetworkInterfaceId: String = null,
    PrivateIpAddress: String = null,
    PrivateIpAddressConfigs: PrivateIpAddressConfigSet = null,
    SecondaryPrivateIpAddressCount: Int | scala.Double = null,
    SubnetId: String = null
  ): ScheduledInstancesNetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssociatePublicIpAddress)) __obj.updateDynamic("AssociatePublicIpAddress")(AssociatePublicIpAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DeviceIndex != null) __obj.updateDynamic("DeviceIndex")(DeviceIndex.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Ipv6AddressCount != null) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PrivateIpAddressConfigs != null) __obj.updateDynamic("PrivateIpAddressConfigs")(PrivateIpAddressConfigs.asInstanceOf[js.Any])
    if (SecondaryPrivateIpAddressCount != null) __obj.updateDynamic("SecondaryPrivateIpAddressCount")(SecondaryPrivateIpAddressCount.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesNetworkInterface]
  }
}

