package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithdrawByoipCidrResult extends js.Object {
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined
}

object WithdrawByoipCidrResult {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): WithdrawByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr)
    __obj.asInstanceOf[WithdrawByoipCidrResult]
  }
}

