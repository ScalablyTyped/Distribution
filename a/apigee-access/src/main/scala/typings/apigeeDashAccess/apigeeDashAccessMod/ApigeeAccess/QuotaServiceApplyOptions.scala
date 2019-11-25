package typings.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess

import typings.apigeeDashAccess.apigeeDashAccessStrings.day
import typings.apigeeDashAccess.apigeeDashAccessStrings.hour
import typings.apigeeDashAccess.apigeeDashAccessStrings.minute
import typings.apigeeDashAccess.apigeeDashAccessStrings.month
import typings.apigeeDashAccess.apigeeDashAccessStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaServiceApplyOptions extends js.Object {
  var allow: Double
  var identifier: String
  var interval: js.UndefOr[Double] = js.undefined
  var timeUnit: minute | hour | day | week | month
  var weight: js.UndefOr[Double] = js.undefined
}

object QuotaServiceApplyOptions {
  @scala.inline
  def apply(
    allow: Double,
    identifier: String,
    timeUnit: minute | hour | day | week | month,
    interval: Int | Double = null,
    weight: Int | Double = null
  ): QuotaServiceApplyOptions = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyOptions]
  }
}

