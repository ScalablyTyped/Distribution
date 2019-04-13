package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /**
    * A date range unit for the date filter.
    */
  var Unit: js.UndefOr[DateRangeUnit] = js.undefined
  /**
    * A date range value for the date filter.
    */
  var Value: js.UndefOr[Integer] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(Unit: DateRangeUnit = null, Value: js.UndefOr[Integer] = js.undefined): DateRange = {
    val __obj = js.Dynamic.literal()
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[DateRange]
  }
}

