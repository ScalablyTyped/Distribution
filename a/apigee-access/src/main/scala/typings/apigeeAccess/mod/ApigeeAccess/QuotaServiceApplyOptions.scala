package typings.apigeeAccess.mod.ApigeeAccess

import typings.apigeeAccess.apigeeAccessStrings.day
import typings.apigeeAccess.apigeeAccessStrings.hour
import typings.apigeeAccess.apigeeAccessStrings.minute
import typings.apigeeAccess.apigeeAccessStrings.month
import typings.apigeeAccess.apigeeAccessStrings.week
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
    interval: js.UndefOr[Double] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): QuotaServiceApplyOptions = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyOptions]
  }
}

