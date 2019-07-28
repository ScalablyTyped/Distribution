package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateVpcCidrBlockResult extends js.Object {
  /**
    * Information about the IPv4 CIDR block association.
    */
  var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.undefined
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object DisassociateVpcCidrBlockResult {
  @scala.inline
  def apply(
    CidrBlockAssociation: VpcCidrBlockAssociation = null,
    Ipv6CidrBlockAssociation: VpcIpv6CidrBlockAssociation = null,
    VpcId: String = null
  ): DisassociateVpcCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    if (CidrBlockAssociation != null) __obj.updateDynamic("CidrBlockAssociation")(CidrBlockAssociation)
    if (Ipv6CidrBlockAssociation != null) __obj.updateDynamic("Ipv6CidrBlockAssociation")(Ipv6CidrBlockAssociation)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DisassociateVpcCidrBlockResult]
  }
}

