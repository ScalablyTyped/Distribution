package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaSettings extends js.Object {
  /**
    * The maximum number of requests that can be made in a given time period.
    */
  var limit: js.UndefOr[Integer] = js.undefined
  /**
    * The number of requests subtracted from the given limit in the initial time period.
    */
  var offset: js.UndefOr[Integer] = js.undefined
  /**
    * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
    */
  var period: js.UndefOr[QuotaPeriodType] = js.undefined
}

object QuotaSettings {
  @scala.inline
  def apply(
    limit: js.UndefOr[Integer] = js.undefined,
    offset: js.UndefOr[Integer] = js.undefined,
    period: QuotaPeriodType = null
  ): QuotaSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaSettings]
  }
}

