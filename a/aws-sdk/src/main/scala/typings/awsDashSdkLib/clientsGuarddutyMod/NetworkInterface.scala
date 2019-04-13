package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /**
    * A list of EC2 instance IPv6 address information.
    */
  var Ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined
  /**
    * The ID of the network interface
    */
  var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined
  /**
    * Private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined
  /**
    * Private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined
  /**
    * Other private IP address information of the EC2 instance.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined
  /**
    * Public DNS name of the EC2 instance.
    */
  var PublicDnsName: js.UndefOr[__string] = js.undefined
  /**
    * Public IP address of the EC2 instance.
    */
  var PublicIp: js.UndefOr[__string] = js.undefined
  /**
    * Security groups associated with the EC2 instance.
    */
  var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
  /**
    * The subnet ID of the EC2 instance.
    */
  var SubnetId: js.UndefOr[__string] = js.undefined
  /**
    * The VPC ID of the EC2 instance.
    */
  var VpcId: js.UndefOr[__string] = js.undefined
}

object NetworkInterface {
  @scala.inline
  def apply(
    Ipv6Addresses: Ipv6Addresses = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    PrivateDnsName: PrivateDnsName = null,
    PrivateIpAddress: PrivateIpAddress = null,
    PrivateIpAddresses: PrivateIpAddresses = null,
    PublicDnsName: __string = null,
    PublicIp: __string = null,
    SecurityGroups: SecurityGroups = null,
    SubnetId: __string = null,
    VpcId: __string = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses)
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[NetworkInterface]
  }
}

