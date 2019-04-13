package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcIpv6CidrBlockAssociation extends js.Object {
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Information about the state of the CIDR block.
    */
  var Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.undefined
}

object VpcIpv6CidrBlockAssociation {
  @scala.inline
  def apply(
    AssociationId: String = null,
    Ipv6CidrBlock: String = null,
    Ipv6CidrBlockState: VpcCidrBlockState = null
  ): VpcIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock)
    if (Ipv6CidrBlockState != null) __obj.updateDynamic("Ipv6CidrBlockState")(Ipv6CidrBlockState)
    __obj.asInstanceOf[VpcIpv6CidrBlockAssociation]
  }
}

