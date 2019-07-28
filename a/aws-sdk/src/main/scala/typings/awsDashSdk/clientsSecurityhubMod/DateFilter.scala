package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilter extends js.Object {
  /**
    * A date range for the date filter.
    */
  var DateRange: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.DateRange] = js.undefined
  /**
    * An end date for the date filter.
    */
  var End: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A start date for the date filter.
    */
  var Start: js.UndefOr[NonEmptyString] = js.undefined
}

object DateFilter {
  @scala.inline
  def apply(DateRange: DateRange = null, End: NonEmptyString = null, Start: NonEmptyString = null): DateFilter = {
    val __obj = js.Dynamic.literal()
    if (DateRange != null) __obj.updateDynamic("DateRange")(DateRange)
    if (End != null) __obj.updateDynamic("End")(End)
    if (Start != null) __obj.updateDynamic("Start")(Start)
    __obj.asInstanceOf[DateFilter]
  }
}

