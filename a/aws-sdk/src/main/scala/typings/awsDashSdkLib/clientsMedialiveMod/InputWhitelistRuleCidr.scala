package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputWhitelistRuleCidr extends js.Object {
  /**
    * The IPv4 CIDR to whitelist.
    */
  var Cidr: js.UndefOr[__string] = js.undefined
}

object InputWhitelistRuleCidr {
  @scala.inline
  def apply(Cidr: __string = null): InputWhitelistRuleCidr = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr)
    __obj.asInstanceOf[InputWhitelistRuleCidr]
  }
}

