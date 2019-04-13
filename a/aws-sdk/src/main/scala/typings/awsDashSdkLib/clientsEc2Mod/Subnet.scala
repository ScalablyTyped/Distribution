package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subnet extends js.Object {
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives an IPv6 address.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined
  /**
    * The Availability Zone of the subnet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The AZ ID of the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  /**
    * The number of unused private IPv4 addresses in the subnet. The IPv4 addresses for any stopped instances are considered unavailable.
    */
  var AvailableIpAddressCount: js.UndefOr[Integer] = js.undefined
  /**
    * The IPv4 CIDR block assigned to the subnet.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether this is the default subnet for the Availability Zone.
    */
  var DefaultForAz: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the IPv6 CIDR blocks associated with the subnet.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet] = js.undefined
  /**
    * Indicates whether instances launched in this subnet receive a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AWS account that owns the subnet.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The current state of the subnet.
    */
  var State: js.UndefOr[SubnetState] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the subnet.
    */
  var SubnetArn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the subnet.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC the subnet is in.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object Subnet {
  @scala.inline
  def apply(
    AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined,
    AvailabilityZone: String = null,
    AvailabilityZoneId: String = null,
    AvailableIpAddressCount: js.UndefOr[Integer] = js.undefined,
    CidrBlock: String = null,
    DefaultForAz: js.UndefOr[Boolean] = js.undefined,
    Ipv6CidrBlockAssociationSet: SubnetIpv6CidrBlockAssociationSet = null,
    MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined,
    OwnerId: String = null,
    State: SubnetState = null,
    SubnetArn: String = null,
    SubnetId: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): Subnet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssignIpv6AddressOnCreation)) __obj.updateDynamic("AssignIpv6AddressOnCreation")(AssignIpv6AddressOnCreation)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId)
    if (!js.isUndefined(AvailableIpAddressCount)) __obj.updateDynamic("AvailableIpAddressCount")(AvailableIpAddressCount)
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    if (!js.isUndefined(DefaultForAz)) __obj.updateDynamic("DefaultForAz")(DefaultForAz)
    if (Ipv6CidrBlockAssociationSet != null) __obj.updateDynamic("Ipv6CidrBlockAssociationSet")(Ipv6CidrBlockAssociationSet)
    if (!js.isUndefined(MapPublicIpOnLaunch)) __obj.updateDynamic("MapPublicIpOnLaunch")(MapPublicIpOnLaunch)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetArn != null) __obj.updateDynamic("SubnetArn")(SubnetArn)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[Subnet]
  }
}

