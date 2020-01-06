package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * A list of EC2 instance IPv6 address information.
    */
  var Ipv6Addresses: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Ipv6Addresses] = js.native
  /**
    * The ID of the network interface
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * Private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * Private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * Other private IP address information of the EC2 instance.
    */
  var PrivateIpAddresses: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.PrivateIpAddresses] = js.native
  /**
    * Public DNS name of the EC2 instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * Public IP address of the EC2 instance.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * Security groups associated with the EC2 instance.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.SecurityGroups] = js.native
  /**
    * The subnet ID of the EC2 instance.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The VPC ID of the EC2 instance.
    */
  var VpcId: js.UndefOr[String] = js.native
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
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses.asInstanceOf[js.Any])
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
}

