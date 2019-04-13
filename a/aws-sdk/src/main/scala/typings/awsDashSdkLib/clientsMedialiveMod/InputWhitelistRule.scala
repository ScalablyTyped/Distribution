package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputWhitelistRule extends js.Object {
  /**
    * The IPv4 CIDR that's whitelisted.
    */
  var Cidr: js.UndefOr[__string] = js.undefined
}

object InputWhitelistRule {
  @scala.inline
  def apply(Cidr: __string = null): InputWhitelistRule = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr)
    __obj.asInstanceOf[InputWhitelistRule]
  }
}

