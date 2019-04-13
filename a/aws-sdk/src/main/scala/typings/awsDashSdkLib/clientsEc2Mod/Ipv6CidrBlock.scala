package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ipv6CidrBlock extends js.Object {
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
}

object Ipv6CidrBlock {
  @scala.inline
  def apply(Ipv6CidrBlock: String = null): Ipv6CidrBlock = {
    val __obj = js.Dynamic.literal()
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock)
    __obj.asInstanceOf[Ipv6CidrBlock]
  }
}

