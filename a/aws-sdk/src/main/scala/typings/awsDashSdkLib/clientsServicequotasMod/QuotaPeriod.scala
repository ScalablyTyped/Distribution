package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaPeriod extends js.Object {
  /**
    * The time unit of a period.
    */
  var PeriodUnit: js.UndefOr[PeriodUnit] = js.undefined
  /**
    * The value of a period.
    */
  var PeriodValue: js.UndefOr[PeriodValue] = js.undefined
}

object QuotaPeriod {
  @scala.inline
  def apply(PeriodUnit: PeriodUnit = null, PeriodValue: js.UndefOr[PeriodValue] = js.undefined): QuotaPeriod = {
    val __obj = js.Dynamic.literal()
    if (PeriodUnit != null) __obj.updateDynamic("PeriodUnit")(PeriodUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(PeriodValue)) __obj.updateDynamic("PeriodValue")(PeriodValue)
    __obj.asInstanceOf[QuotaPeriod]
  }
}

