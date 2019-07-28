package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateInstanceNetworkInterfaceSpecification extends js.Object {
  /**
    * Indicates whether to associate a public IPv4 address with eth0 for a new network interface.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The device index for the network interface attachment.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.undefined
  /**
    * The IDs of one or more security groups.
    */
  var Groups: js.UndefOr[GroupIdStringList] = js.undefined
  /**
    * The type of network interface.
    */
  var InterfaceType: js.UndefOr[String] = js.undefined
  /**
    * The number of IPv6 addresses for the network interface.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  /**
    * The IPv6 addresses for the network interface.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The primary private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * One or more private IPv4 addresses.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined
  /**
    * The number of secondary private IPv4 addresses for the network interface.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the subnet for the network interface.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}

object LaunchTemplateInstanceNetworkInterfaceSpecification {
  @scala.inline
  def apply(
    AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
    DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    Description: String = null,
    DeviceIndex: js.UndefOr[Integer] = js.undefined,
    Groups: GroupIdStringList = null,
    InterfaceType: String = null,
    Ipv6AddressCount: js.UndefOr[Integer] = js.undefined,
    Ipv6Addresses: InstanceIpv6AddressList = null,
    NetworkInterfaceId: String = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: PrivateIpAddressSpecificationList = null,
    SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined,
    SubnetId: String = null
  ): LaunchTemplateInstanceNetworkInterfaceSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssociatePublicIpAddress)) __obj.updateDynamic("AssociatePublicIpAddress")(AssociatePublicIpAddress)
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DeviceIndex)) __obj.updateDynamic("DeviceIndex")(DeviceIndex)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (InterfaceType != null) __obj.updateDynamic("InterfaceType")(InterfaceType)
    if (!js.isUndefined(Ipv6AddressCount)) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount)
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses)
    if (!js.isUndefined(SecondaryPrivateIpAddressCount)) __obj.updateDynamic("SecondaryPrivateIpAddressCount")(SecondaryPrivateIpAddressCount)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[LaunchTemplateInstanceNetworkInterfaceSpecification]
  }
}

