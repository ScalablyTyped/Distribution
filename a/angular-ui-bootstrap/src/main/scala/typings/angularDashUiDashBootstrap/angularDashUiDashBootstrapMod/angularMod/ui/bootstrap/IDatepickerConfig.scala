package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatepickerConfig extends js.Object {
  /**
    * Defines an optional expression to add classes based on passing an object with date and current mode properties.
    *
    * @default null
    */
  var customClass: js.UndefOr[DatepickerCallback[String]] = js.undefined
  /**
    * Defines an optional expression to disable visible options based on passing an object with date and current mode properties.
    *
    * @default null
    */
  var dateDisabled: js.UndefOr[DatepickerCallback[Boolean]] = js.undefined
  /**
    * Current mode of the datepicker (day|month|year). Can be used to initialize datepicker to specific mode.
    *
    * @default 'day'
    */
  var datepickerMode: js.UndefOr[DatepickerMode] = js.undefined
  /**
    * Format of day in month.
    *
    * @default 'dd'
    */
  var formatDay: js.UndefOr[String] = js.undefined
  /**
    * Format of day in week header.
    *
    * @default 'EEE'
    */
  var formatDayHeader: js.UndefOr[String] = js.undefined
  /**
    * Format of title when selecting day.
    *
    * @default 'MMM yyyy'
    */
  var formatDayTitle: js.UndefOr[String] = js.undefined
  /**
    * Format of month in year.
    *
    * @default 'MMM'
    */
  var formatMonth: js.UndefOr[String] = js.undefined
  /**
    * Format of title when selecting month.
    *
    * @default 'yyyy'
    */
  var formatMonthTitle: js.UndefOr[String] = js.undefined
  /**
    * Format of year in year range.
    *
    * @default 'yyyy'
    */
  var formatYear: js.UndefOr[String] = js.undefined
  /**
    * Defines the initial date, when no model value is specified.
    *
    * @default null
    */
  var initDate: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines the maximum available date.
    *
    * @default null
    */
  var maxDate: js.UndefOr[js.Any] = js.undefined
  /**
    * Set an upper limit for mode.
    *
    * @default 'year'
    */
  var maxMode: js.UndefOr[String] = js.undefined
  /**
    * Defines the minimum available date.
    *
    * @default null
    */
  var minDate: js.UndefOr[js.Any] = js.undefined
  /**
    * Set a lower limit for mode.
    *
    * @default 'day'
    */
  var minMode: js.UndefOr[String] = js.undefined
  /**
    * The number of columns displayed in month selection.
    *
    * @default 3
    */
  var monthColumns: js.UndefOr[Double] = js.undefined
  /**
    * All supported angular ngModelOptions plus some
    *
    * @default {}
    */
  var ngModelOptions: js.UndefOr[IDropdownConfigNgOptions] = js.undefined
  /**
    * An option to disable or enable shortcut's event propagation
    *
    * @default false
    */
  var shortcutPropagation: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to display week numbers.
    *
    * @default true
    */
  var showWeeks: js.UndefOr[Boolean] = js.undefined
  /**
    * Starting day of the week from 0-6 where 0=Sunday and 6=Saturday.
    *
    * @default 0
    */
  var startingDay: js.UndefOr[Double] = js.undefined
  /**
    * The number of columns displayed in year selection.
    *
    * @default 5
    */
  var yearColumns: js.UndefOr[Double] = js.undefined
  /**
    * Number of years displayed in year selection.
    *
    * @default 20
    */
  var yearRange: js.UndefOr[Double] = js.undefined
  /**
    * The number of rows displayed in year selection
    *
    * @default 4
    */
  var yearRows: js.UndefOr[Double] = js.undefined
}

object IDatepickerConfig {
  @scala.inline
  def apply(
    customClass: /* args */ IDatepickerCellArgs => String = null,
    dateDisabled: /* args */ IDatepickerCellArgs => Boolean = null,
    datepickerMode: DatepickerMode = null,
    formatDay: String = null,
    formatDayHeader: String = null,
    formatDayTitle: String = null,
    formatMonth: String = null,
    formatMonthTitle: String = null,
    formatYear: String = null,
    initDate: js.Any = null,
    maxDate: js.Any = null,
    maxMode: String = null,
    minDate: js.Any = null,
    minMode: String = null,
    monthColumns: Int | Double = null,
    ngModelOptions: IDropdownConfigNgOptions = null,
    shortcutPropagation: js.UndefOr[Boolean] = js.undefined,
    showWeeks: js.UndefOr[Boolean] = js.undefined,
    startingDay: Int | Double = null,
    yearColumns: Int | Double = null,
    yearRange: Int | Double = null,
    yearRows: Int | Double = null
  ): IDatepickerConfig = {
    val __obj = js.Dynamic.literal()
    if (customClass != null) __obj.updateDynamic("customClass")(js.Any.fromFunction1(customClass))
    if (dateDisabled != null) __obj.updateDynamic("dateDisabled")(js.Any.fromFunction1(dateDisabled))
    if (datepickerMode != null) __obj.updateDynamic("datepickerMode")(datepickerMode)
    if (formatDay != null) __obj.updateDynamic("formatDay")(formatDay)
    if (formatDayHeader != null) __obj.updateDynamic("formatDayHeader")(formatDayHeader)
    if (formatDayTitle != null) __obj.updateDynamic("formatDayTitle")(formatDayTitle)
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(formatMonth)
    if (formatMonthTitle != null) __obj.updateDynamic("formatMonthTitle")(formatMonthTitle)
    if (formatYear != null) __obj.updateDynamic("formatYear")(formatYear)
    if (initDate != null) __obj.updateDynamic("initDate")(initDate)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (maxMode != null) __obj.updateDynamic("maxMode")(maxMode)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minMode != null) __obj.updateDynamic("minMode")(minMode)
    if (monthColumns != null) __obj.updateDynamic("monthColumns")(monthColumns.asInstanceOf[js.Any])
    if (ngModelOptions != null) __obj.updateDynamic("ngModelOptions")(ngModelOptions)
    if (!js.isUndefined(shortcutPropagation)) __obj.updateDynamic("shortcutPropagation")(shortcutPropagation)
    if (!js.isUndefined(showWeeks)) __obj.updateDynamic("showWeeks")(showWeeks)
    if (startingDay != null) __obj.updateDynamic("startingDay")(startingDay.asInstanceOf[js.Any])
    if (yearColumns != null) __obj.updateDynamic("yearColumns")(yearColumns.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearRows != null) __obj.updateDynamic("yearRows")(yearRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerConfig]
  }
}

