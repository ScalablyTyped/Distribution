package typings
package apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaServiceApplyOptions extends js.Object {
  var allow: scala.Double
  var identifier: java.lang.String
  var interval: js.UndefOr[scala.Double] = js.undefined
  var timeUnit: apigeeDashAccessLib.apigeeDashAccessLibStrings.minute | apigeeDashAccessLib.apigeeDashAccessLibStrings.hour | apigeeDashAccessLib.apigeeDashAccessLibStrings.day | apigeeDashAccessLib.apigeeDashAccessLibStrings.week | apigeeDashAccessLib.apigeeDashAccessLibStrings.month
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object QuotaServiceApplyOptions {
  @scala.inline
  def apply(
    allow: scala.Double,
    identifier: java.lang.String,
    timeUnit: apigeeDashAccessLib.apigeeDashAccessLibStrings.minute | apigeeDashAccessLib.apigeeDashAccessLibStrings.hour | apigeeDashAccessLib.apigeeDashAccessLibStrings.day | apigeeDashAccessLib.apigeeDashAccessLibStrings.week | apigeeDashAccessLib.apigeeDashAccessLibStrings.month,
    interval: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null
  ): QuotaServiceApplyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow")(allow)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyOptions]
  }
}

