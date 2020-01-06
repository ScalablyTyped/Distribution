package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv6CidrBlock extends js.Object {
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
}

object Ipv6CidrBlock {
  @scala.inline
  def apply(Ipv6CidrBlock: String = null): Ipv6CidrBlock = {
    val __obj = js.Dynamic.literal()
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipv6CidrBlock]
  }
}

