package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /**
    * The IP addresses associated with the network interface.
    */
  var ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[Text] = js.undefined
  /**
    * The name of a private DNS associated with the network interface.
    */
  var privateDnsName: js.UndefOr[Text] = js.undefined
  /**
    * The private IP address associated with the network interface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.undefined
  /**
    * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and privateIpAddress.
    */
  var privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined
  /**
    * The name of a public DNS associated with the network interface.
    */
  var publicDnsName: js.UndefOr[Text] = js.undefined
  /**
    * The public IP address from which the network interface is reachable.
    */
  var publicIp: js.UndefOr[Text] = js.undefined
  /**
    * A list of the security groups associated with the network interface. Includes the groupId and groupName.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
  /**
    * The ID of a subnet associated with the network interface.
    */
  var subnetId: js.UndefOr[Text] = js.undefined
  /**
    * The ID of a VPC associated with the network interface.
    */
  var vpcId: js.UndefOr[Text] = js.undefined
}

object NetworkInterface {
  @scala.inline
  def apply(
    ipv6Addresses: Ipv6Addresses = null,
    networkInterfaceId: Text = null,
    privateDnsName: Text = null,
    privateIpAddress: Text = null,
    privateIpAddresses: PrivateIpAddresses = null,
    publicDnsName: Text = null,
    publicIp: Text = null,
    securityGroups: SecurityGroups = null,
    subnetId: Text = null,
    vpcId: Text = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses)
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    if (privateDnsName != null) __obj.updateDynamic("privateDnsName")(privateDnsName)
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress)
    if (privateIpAddresses != null) __obj.updateDynamic("privateIpAddresses")(privateIpAddresses)
    if (publicDnsName != null) __obj.updateDynamic("publicDnsName")(publicDnsName)
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[NetworkInterface]
  }
}

