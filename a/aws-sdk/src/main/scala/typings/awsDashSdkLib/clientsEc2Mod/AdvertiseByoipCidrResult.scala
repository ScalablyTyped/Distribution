package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiseByoipCidrResult extends js.Object {
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined
}

object AdvertiseByoipCidrResult {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): AdvertiseByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr)
    __obj.asInstanceOf[AdvertiseByoipCidrResult]
  }
}

