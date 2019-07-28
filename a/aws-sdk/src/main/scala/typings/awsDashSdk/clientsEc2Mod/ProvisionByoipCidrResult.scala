package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionByoipCidrResult extends js.Object {
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ByoipCidr] = js.undefined
}

object ProvisionByoipCidrResult {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): ProvisionByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr)
    __obj.asInstanceOf[ProvisionByoipCidrResult]
  }
}

