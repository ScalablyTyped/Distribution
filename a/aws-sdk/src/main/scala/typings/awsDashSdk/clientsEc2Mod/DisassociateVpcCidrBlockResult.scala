package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateVpcCidrBlockResult extends js.Object {
  /**
    * Information about the IPv4 CIDR block association.
    */
  var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.native
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DisassociateVpcCidrBlockResult {
  @scala.inline
  def apply(
    CidrBlockAssociation: VpcCidrBlockAssociation = null,
    Ipv6CidrBlockAssociation: VpcIpv6CidrBlockAssociation = null,
    VpcId: String = null
  ): DisassociateVpcCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    if (CidrBlockAssociation != null) __obj.updateDynamic("CidrBlockAssociation")(CidrBlockAssociation.asInstanceOf[js.Any])
    if (Ipv6CidrBlockAssociation != null) __obj.updateDynamic("Ipv6CidrBlockAssociation")(Ipv6CidrBlockAssociation.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVpcCidrBlockResult]
  }
}

