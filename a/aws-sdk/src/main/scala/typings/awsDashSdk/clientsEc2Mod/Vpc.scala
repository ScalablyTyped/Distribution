package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vpc extends js.Object {
  /**
    * The primary IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Information about the IPv4 CIDR blocks associated with the VPC.
    */
  var CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet] = js.undefined
  /**
    * The ID of the set of DHCP options you've associated with the VPC (or default if the default options are associated with the VPC).
    */
  var DhcpOptionsId: js.UndefOr[String] = js.undefined
  /**
    * The allowed tenancy of instances launched into the VPC.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
  /**
    * Information about the IPv6 CIDR blocks associated with the VPC.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet] = js.undefined
  /**
    * Indicates whether the VPC is the default VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The current state of the VPC.
    */
  var State: js.UndefOr[VpcState] = js.undefined
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object Vpc {
  @scala.inline
  def apply(
    CidrBlock: String = null,
    CidrBlockAssociationSet: VpcCidrBlockAssociationSet = null,
    DhcpOptionsId: String = null,
    InstanceTenancy: Tenancy = null,
    Ipv6CidrBlockAssociationSet: VpcIpv6CidrBlockAssociationSet = null,
    IsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    OwnerId: String = null,
    State: VpcState = null,
    Tags: TagList = null,
    VpcId: String = null
  ): Vpc = {
    val __obj = js.Dynamic.literal()
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    if (CidrBlockAssociationSet != null) __obj.updateDynamic("CidrBlockAssociationSet")(CidrBlockAssociationSet)
    if (DhcpOptionsId != null) __obj.updateDynamic("DhcpOptionsId")(DhcpOptionsId)
    if (InstanceTenancy != null) __obj.updateDynamic("InstanceTenancy")(InstanceTenancy.asInstanceOf[js.Any])
    if (Ipv6CidrBlockAssociationSet != null) __obj.updateDynamic("Ipv6CidrBlockAssociationSet")(Ipv6CidrBlockAssociationSet)
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[Vpc]
  }
}

