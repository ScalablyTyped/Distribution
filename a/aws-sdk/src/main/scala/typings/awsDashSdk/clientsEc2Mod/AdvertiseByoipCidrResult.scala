package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiseByoipCidrResult extends js.Object {
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ByoipCidr] = js.native
}

object AdvertiseByoipCidrResult {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): AdvertiseByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiseByoipCidrResult]
  }
}

