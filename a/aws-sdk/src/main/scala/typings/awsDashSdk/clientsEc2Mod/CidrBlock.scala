package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CidrBlock extends js.Object {
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
}

object CidrBlock {
  @scala.inline
  def apply(CidrBlock: String = null): CidrBlock = {
    val __obj = js.Dynamic.literal()
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    __obj.asInstanceOf[CidrBlock]
  }
}

