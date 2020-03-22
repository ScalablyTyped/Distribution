package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  var backToToday: String
  var clear: String
  var dateFormat: String
  var dateSelect: String
  var dateTimeFormat: String
  var dayFormat: String
  var decadeSelect: String
  var locale: String
  var month: String
  var monthBeforeYear: js.UndefOr[Boolean] = js.undefined
  var monthFormat: js.UndefOr[String] = js.undefined
  var monthSelect: String
  var nextCentury: String
  var nextDecade: String
  var nextMonth: String
  var nextYear: String
  var now: String
  var ok: String
  var placeholder: String
  var previousCentury: String
  var previousDecade: String
  var previousMonth: String
  var previousYear: String
  var rangePlaceholder: js.Array[String]
  var shortMonths: js.UndefOr[js.Array[String]] = js.undefined
  var shortWeekDays: js.UndefOr[js.Array[String]] = js.undefined
  var timeSelect: String
  var today: String
  var weekSelect: js.UndefOr[String] = js.undefined
  var year: String
  var yearFormat: String
  var yearSelect: String
}

object AnonClear {
  @scala.inline
  def apply(
    backToToday: String,
    clear: String,
    dateFormat: String,
    dateSelect: String,
    dateTimeFormat: String,
    dayFormat: String,
    decadeSelect: String,
    locale: String,
    month: String,
    monthSelect: String,
    nextCentury: String,
    nextDecade: String,
    nextMonth: String,
    nextYear: String,
    now: String,
    ok: String,
    placeholder: String,
    previousCentury: String,
    previousDecade: String,
    previousMonth: String,
    previousYear: String,
    rangePlaceholder: js.Array[String],
    timeSelect: String,
    today: String,
    year: String,
    yearFormat: String,
    yearSelect: String,
    monthBeforeYear: js.UndefOr[Boolean] = js.undefined,
    monthFormat: String = null,
    shortMonths: js.Array[String] = null,
    shortWeekDays: js.Array[String] = null,
    weekSelect: String = null
  ): AnonClear = {
    val __obj = js.Dynamic.literal(backToToday = backToToday.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateSelect = dateSelect.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], dayFormat = dayFormat.asInstanceOf[js.Any], decadeSelect = decadeSelect.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthSelect = monthSelect.asInstanceOf[js.Any], nextCentury = nextCentury.asInstanceOf[js.Any], nextDecade = nextDecade.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], previousCentury = previousCentury.asInstanceOf[js.Any], previousDecade = previousDecade.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], previousYear = previousYear.asInstanceOf[js.Any], rangePlaceholder = rangePlaceholder.asInstanceOf[js.Any], timeSelect = timeSelect.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any], yearSelect = yearSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(monthBeforeYear)) __obj.updateDynamic("monthBeforeYear")(monthBeforeYear.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (shortMonths != null) __obj.updateDynamic("shortMonths")(shortMonths.asInstanceOf[js.Any])
    if (shortWeekDays != null) __obj.updateDynamic("shortWeekDays")(shortWeekDays.asInstanceOf[js.Any])
    if (weekSelect != null) __obj.updateDynamic("weekSelect")(weekSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClear]
  }
}

