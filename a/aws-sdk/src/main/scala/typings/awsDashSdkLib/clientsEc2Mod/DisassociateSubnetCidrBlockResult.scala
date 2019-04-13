package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateSubnetCidrBlockResult extends js.Object {
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.undefined
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}

object DisassociateSubnetCidrBlockResult {
  @scala.inline
  def apply(Ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation = null, SubnetId: String = null): DisassociateSubnetCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    if (Ipv6CidrBlockAssociation != null) __obj.updateDynamic("Ipv6CidrBlockAssociation")(Ipv6CidrBlockAssociation)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[DisassociateSubnetCidrBlockResult]
  }
}

