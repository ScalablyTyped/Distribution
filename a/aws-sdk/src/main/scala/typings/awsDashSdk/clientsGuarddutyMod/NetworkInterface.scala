package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /**
    * A list of EC2 instance IPv6 address information.
    */
  var Ipv6Addresses: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Ipv6Addresses] = js.undefined
  /**
    * The ID of the network interface
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * Private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * Private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * Other private IP address information of the EC2 instance.
    */
  var PrivateIpAddresses: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.PrivateIpAddresses] = js.undefined
  /**
    * Public DNS name of the EC2 instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  /**
    * Public IP address of the EC2 instance.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  /**
    * Security groups associated with the EC2 instance.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.SecurityGroups] = js.undefined
  /**
    * The subnet ID of the EC2 instance.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * The VPC ID of the EC2 instance.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object NetworkInterface {
  @scala.inline
  def apply(
    Ipv6Addresses: Ipv6Addresses = null,
    NetworkInterfaceId: String = null,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: PrivateIpAddresses = null,
    PublicDnsName: String = null,
    PublicIp: String = null,
    SecurityGroups: SecurityGroups = null,
    SubnetId: String = null,
    VpcId: String = null
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

