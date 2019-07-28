package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcCidrBlockAssociation extends js.Object {
  /**
    * The association ID for the IPv4 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.undefined
}

object VpcCidrBlockAssociation {
  @scala.inline
  def apply(AssociationId: String = null, CidrBlock: String = null, CidrBlockState: VpcCidrBlockState = null): VpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    if (CidrBlockState != null) __obj.updateDynamic("CidrBlockState")(CidrBlockState)
    __obj.asInstanceOf[VpcCidrBlockAssociation]
  }
}

