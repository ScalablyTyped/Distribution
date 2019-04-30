package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface.
    */
  var Association: js.UndefOr[NetworkInterfaceAssociation] = js.undefined
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.undefined
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * A description.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Any security groups for the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  /**
    * The type of network interface.
    */
  var InterfaceType: js.UndefOr[NetworkInterfaceType] = js.undefined
  /**
    * The IPv6 addresses associated with the network interface.
    */
  var Ipv6Addresses: js.UndefOr[NetworkInterfaceIpv6AddressesList] = js.undefined
  /**
    * The MAC address.
    */
  var MacAddress: js.UndefOr[String] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the owner of the network interface.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The private IPv4 addresses associated with the network interface.
    */
  var PrivateIpAddresses: js.UndefOr[NetworkInterfacePrivateIpAddressList] = js.undefined
  /**
    * The ID of the entity that launched the instance on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the network interface is being managed by AWS.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * The status of the network interface.
    */
  var Status: js.UndefOr[NetworkInterfaceStatus] = js.undefined
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the network interface.
    */
  var TagSet: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object NetworkInterface {
  @scala.inline
  def apply(
    Association: NetworkInterfaceAssociation = null,
    Attachment: NetworkInterfaceAttachment = null,
    AvailabilityZone: String = null,
    Description: String = null,
    Groups: GroupIdentifierList = null,
    InterfaceType: NetworkInterfaceType = null,
    Ipv6Addresses: NetworkInterfaceIpv6AddressesList = null,
    MacAddress: String = null,
    NetworkInterfaceId: String = null,
    OwnerId: String = null,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: NetworkInterfacePrivateIpAddressList = null,
    RequesterId: String = null,
    RequesterManaged: js.UndefOr[Boolean] = js.undefined,
    SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
    Status: NetworkInterfaceStatus = null,
    SubnetId: String = null,
    TagSet: TagList = null,
    VpcId: String = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association)
    if (Attachment != null) __obj.updateDynamic("Attachment")(Attachment)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (InterfaceType != null) __obj.updateDynamic("InterfaceType")(InterfaceType.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses)
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses)
    if (RequesterId != null) __obj.updateDynamic("RequesterId")(RequesterId)
    if (!js.isUndefined(RequesterManaged)) __obj.updateDynamic("RequesterManaged")(RequesterManaged)
    if (!js.isUndefined(SourceDestCheck)) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (TagSet != null) __obj.updateDynamic("TagSet")(TagSet)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[NetworkInterface]
  }
}

