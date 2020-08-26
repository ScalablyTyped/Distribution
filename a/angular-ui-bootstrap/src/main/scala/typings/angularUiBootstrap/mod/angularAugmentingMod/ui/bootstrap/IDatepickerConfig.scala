package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatepickerConfig extends js.Object {
  /**
    * Defines an optional expression to add classes based on passing an object with date and current mode properties.
    *
    * @default null
    */
  var customClass: js.UndefOr[DatepickerCallback[String]] = js.native
  /**
    * Defines an optional expression to disable visible options based on passing an object with date and current mode properties.
    *
    * @default null
    */
  var dateDisabled: js.UndefOr[DatepickerCallback[Boolean]] = js.native
  /**
    * Current mode of the datepicker (day|month|year). Can be used to initialize datepicker to specific mode.
    *
    * @default 'day'
    */
  var datepickerMode: js.UndefOr[DatepickerMode] = js.native
  /**
    * Format of day in month.
    *
    * @default 'dd'
    */
  var formatDay: js.UndefOr[String] = js.native
  /**
    * Format of day in week header.
    *
    * @default 'EEE'
    */
  var formatDayHeader: js.UndefOr[String] = js.native
  /**
    * Format of title when selecting day.
    *
    * @default 'MMM yyyy'
    */
  var formatDayTitle: js.UndefOr[String] = js.native
  /**
    * Format of month in year.
    *
    * @default 'MMM'
    */
  var formatMonth: js.UndefOr[String] = js.native
  /**
    * Format of title when selecting month.
    *
    * @default 'yyyy'
    */
  var formatMonthTitle: js.UndefOr[String] = js.native
  /**
    * Format of year in year range.
    *
    * @default 'yyyy'
    */
  var formatYear: js.UndefOr[String] = js.native
  /**
    * Defines the initial date, when no model value is specified.
    *
    * @default null
    */
  var initDate: js.UndefOr[js.Any] = js.native
  /**
    * Defines the maximum available date.
    *
    * @default null
    */
  var maxDate: js.UndefOr[js.Any] = js.native
  /**
    * Set an upper limit for mode.
    *
    * @default 'year'
    */
  var maxMode: js.UndefOr[String] = js.native
  /**
    * Defines the minimum available date.
    *
    * @default null
    */
  var minDate: js.UndefOr[js.Any] = js.native
  /**
    * Set a lower limit for mode.
    *
    * @default 'day'
    */
  var minMode: js.UndefOr[String] = js.native
  /**
    * The number of columns displayed in month selection.
    *
    * @default 3
    */
  var monthColumns: js.UndefOr[Double] = js.native
  /**
    * All supported angular ngModelOptions plus some
    *
    * @default {}
    */
  var ngModelOptions: js.UndefOr[IDropdownConfigNgOptions] = js.native
  /**
    * An option to disable or enable shortcut's event propagation
    *
    * @default false
    */
  var shortcutPropagation: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display week numbers.
    *
    * @default true
    */
  var showWeeks: js.UndefOr[Boolean] = js.native
  /**
    * Starting day of the week from 0-6 where 0=Sunday and 6=Saturday.
    *
    * @default 0
    */
  var startingDay: js.UndefOr[Double] = js.native
  /**
    * The number of columns displayed in year selection.
    *
    * @default 5
    */
  var yearColumns: js.UndefOr[Double] = js.native
  /**
    * Number of years displayed in year selection.
    *
    * @default 20
    */
  var yearRange: js.UndefOr[Double] = js.native
  /**
    * The number of rows displayed in year selection
    *
    * @default 4
    */
  var yearRows: js.UndefOr[Double] = js.native
}

object IDatepickerConfig {
  @scala.inline
  def apply(): IDatepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatepickerConfig]
  }
  @scala.inline
  implicit class IDatepickerConfigOps[Self <: IDatepickerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomClass(value: /* args */ IDatepickerCellArgs => String): Self = this.set("customClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomClass: Self = this.set("customClass", js.undefined)
    @scala.inline
    def setDateDisabled(value: /* args */ IDatepickerCellArgs => Boolean): Self = this.set("dateDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateDisabled: Self = this.set("dateDisabled", js.undefined)
    @scala.inline
    def setDatepickerMode(value: DatepickerMode): Self = this.set("datepickerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatepickerMode: Self = this.set("datepickerMode", js.undefined)
    @scala.inline
    def setFormatDay(value: String): Self = this.set("formatDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatDay: Self = this.set("formatDay", js.undefined)
    @scala.inline
    def setFormatDayHeader(value: String): Self = this.set("formatDayHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatDayHeader: Self = this.set("formatDayHeader", js.undefined)
    @scala.inline
    def setFormatDayTitle(value: String): Self = this.set("formatDayTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatDayTitle: Self = this.set("formatDayTitle", js.undefined)
    @scala.inline
    def setFormatMonth(value: String): Self = this.set("formatMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatMonth: Self = this.set("formatMonth", js.undefined)
    @scala.inline
    def setFormatMonthTitle(value: String): Self = this.set("formatMonthTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatMonthTitle: Self = this.set("formatMonthTitle", js.undefined)
    @scala.inline
    def setFormatYear(value: String): Self = this.set("formatYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatYear: Self = this.set("formatYear", js.undefined)
    @scala.inline
    def setInitDate(value: js.Any): Self = this.set("initDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDate: Self = this.set("initDate", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMaxMode(value: String): Self = this.set("maxMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMode: Self = this.set("maxMode", js.undefined)
    @scala.inline
    def setMinDate(value: js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMinMode(value: String): Self = this.set("minMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinMode: Self = this.set("minMode", js.undefined)
    @scala.inline
    def setMonthColumns(value: Double): Self = this.set("monthColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthColumns: Self = this.set("monthColumns", js.undefined)
    @scala.inline
    def setNgModelOptions(value: IDropdownConfigNgOptions): Self = this.set("ngModelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNgModelOptions: Self = this.set("ngModelOptions", js.undefined)
    @scala.inline
    def setShortcutPropagation(value: Boolean): Self = this.set("shortcutPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcutPropagation: Self = this.set("shortcutPropagation", js.undefined)
    @scala.inline
    def setShowWeeks(value: Boolean): Self = this.set("showWeeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeeks: Self = this.set("showWeeks", js.undefined)
    @scala.inline
    def setStartingDay(value: Double): Self = this.set("startingDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingDay: Self = this.set("startingDay", js.undefined)
    @scala.inline
    def setYearColumns(value: Double): Self = this.set("yearColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearColumns: Self = this.set("yearColumns", js.undefined)
    @scala.inline
    def setYearRange(value: Double): Self = this.set("yearRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearRange: Self = this.set("yearRange", js.undefined)
    @scala.inline
    def setYearRows(value: Double): Self = this.set("yearRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearRows: Self = this.set("yearRows", js.undefined)
  }
  
}

