package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionVpcInfo extends js.Object {
  /**
    * The IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Information about the IPv4 CIDR blocks for the VPC.
    */
  var CidrBlockSet: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CidrBlockSet] = js.undefined
  /**
    * The IPv6 CIDR block for the VPC.
    */
  var Ipv6CidrBlockSet: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Ipv6CidrBlockSet] = js.undefined
  /**
    * The AWS account ID of the VPC owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Information about the VPC peering connection options for the accepter or requester VPC.
    */
  var PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription] = js.undefined
  /**
    * The Region in which the VPC is located.
    */
  var Region: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object VpcPeeringConnectionVpcInfo {
  @scala.inline
  def apply(
    CidrBlock: String = null,
    CidrBlockSet: CidrBlockSet = null,
    Ipv6CidrBlockSet: Ipv6CidrBlockSet = null,
    OwnerId: String = null,
    PeeringOptions: VpcPeeringConnectionOptionsDescription = null,
    Region: String = null,
    VpcId: String = null
  ): VpcPeeringConnectionVpcInfo = {
    val __obj = js.Dynamic.literal()
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    if (CidrBlockSet != null) __obj.updateDynamic("CidrBlockSet")(CidrBlockSet)
    if (Ipv6CidrBlockSet != null) __obj.updateDynamic("Ipv6CidrBlockSet")(Ipv6CidrBlockSet)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (PeeringOptions != null) __obj.updateDynamic("PeeringOptions")(PeeringOptions)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[VpcPeeringConnectionVpcInfo]
  }
}

