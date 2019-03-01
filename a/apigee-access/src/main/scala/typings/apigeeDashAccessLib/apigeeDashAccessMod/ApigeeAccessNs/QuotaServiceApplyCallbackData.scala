package typings
package apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaServiceApplyCallbackData extends js.Object {
  var allowed: scala.Double
  var expiryTime: scala.Double
  var isAllowed: scala.Boolean
  var timestamp: scala.Double
  var used: scala.Double
}

object QuotaServiceApplyCallbackData {
  @scala.inline
  def apply(
    allowed: scala.Double,
    expiryTime: scala.Double,
    isAllowed: scala.Boolean,
    timestamp: scala.Double,
    used: scala.Double
  ): QuotaServiceApplyCallbackData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowed")(allowed)
    __obj.updateDynamic("expiryTime")(expiryTime)
    __obj.updateDynamic("isAllowed")(isAllowed)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("used")(used)
    __obj.asInstanceOf[QuotaServiceApplyCallbackData]
  }
}

