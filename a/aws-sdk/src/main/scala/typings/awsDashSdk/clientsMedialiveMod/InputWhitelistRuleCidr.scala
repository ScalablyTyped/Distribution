package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputWhitelistRuleCidr extends js.Object {
  /**
    * The IPv4 CIDR to whitelist.
    */
  var Cidr: js.UndefOr[__string] = js.native
}

object InputWhitelistRuleCidr {
  @scala.inline
  def apply(Cidr: __string = null): InputWhitelistRuleCidr = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputWhitelistRuleCidr]
  }
}

