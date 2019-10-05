package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateVpcCidrBlockRequest extends js.Object {
  /**
    * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
    */
  var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined
  /**
    * An IPv4 CIDR block to associate with the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object AssociateVpcCidrBlockRequest {
  @scala.inline
  def apply(
    VpcId: String,
    AmazonProvidedIpv6CidrBlock: js.UndefOr[scala.Boolean] = js.undefined,
    CidrBlock: String = null
  ): AssociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId)
    if (!js.isUndefined(AmazonProvidedIpv6CidrBlock)) __obj.updateDynamic("AmazonProvidedIpv6CidrBlock")(AmazonProvidedIpv6CidrBlock)
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    __obj.asInstanceOf[AssociateVpcCidrBlockRequest]
  }
}

