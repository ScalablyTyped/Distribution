package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatepickerPopupConfig extends IDatepickerConfig {
  /**
    * A list of alternate formats acceptable for manual entry.
    *
    * @default []
    */
  var altInputFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Append the datepicker popup element to `body`, rather than inserting after `datepicker-popup`.
    *
    * @default false
    */
  var appendToBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text to display for the clear button.
    *
    * @default 'Clear'
    */
  var clearText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to close calendar when a date is chosen.
    *
    * @default true
    */
  var closeOnDateSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text to display for the close button.
    *
    * @default 'Done'
    */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to display for the current day button.
    *
    * @default 'Today'
    */
  var currentText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The format for displayed dates.
    *
    * @default 'yyyy-MM-dd'
    */
  var datepickerPopup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows overriding of default template of the popup.
    *
    * @default 'template/datepicker/popup.html'
    */
  var datepickerPopupTemplateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows overriding of default template of the datepicker used in popup.
    *
    * @default 'template/datepicker/popup.html'
    */
  var datepickerTemplateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows overriding of the default format for html5 date inputs.
    */
  var html5Types: js.UndefOr[angularDashUiDashBootstrapLib.Anon_Date] = js.undefined
  /**
    * Whether to focus the datepicker popup upon opening.
    *
    * @default true
    */
  var onOpenFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Passing in 'auto' separated by a space before the placement will enable auto positioning, e.g: "auto bottom-left". The popup will attempt to position where it fits in the closest scrollable ancestor.
    *
    * @default 'auto bottom-left'
    */
  var placement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to display a button bar underneath the datepicker.
    *
    * @default true
    */
  var showButtonBar: js.UndefOr[scala.Boolean] = js.undefined
}

object IDatepickerPopupConfig {
  @scala.inline
  def apply(
    altInputFormats: js.Array[java.lang.String] = null,
    appendToBody: js.UndefOr[scala.Boolean] = js.undefined,
    clearText: java.lang.String = null,
    closeOnDateSelection: js.UndefOr[scala.Boolean] = js.undefined,
    closeText: java.lang.String = null,
    currentText: java.lang.String = null,
    customClass: DatepickerCallback[java.lang.String] = null,
    dateDisabled: DatepickerCallback[scala.Boolean] = null,
    datepickerMode: DatepickerMode = null,
    datepickerPopup: java.lang.String = null,
    datepickerPopupTemplateUrl: java.lang.String = null,
    datepickerTemplateUrl: java.lang.String = null,
    formatDay: java.lang.String = null,
    formatDayHeader: java.lang.String = null,
    formatDayTitle: java.lang.String = null,
    formatMonth: java.lang.String = null,
    formatMonthTitle: java.lang.String = null,
    formatYear: java.lang.String = null,
    html5Types: angularDashUiDashBootstrapLib.Anon_Date = null,
    initDate: js.Any = null,
    maxDate: js.Any = null,
    maxMode: java.lang.String = null,
    minDate: js.Any = null,
    minMode: java.lang.String = null,
    monthColumns: scala.Int | scala.Double = null,
    ngModelOptions: IDropdownConfigNgOptions = null,
    onOpenFocus: js.UndefOr[scala.Boolean] = js.undefined,
    placement: java.lang.String = null,
    shortcutPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    showButtonBar: js.UndefOr[scala.Boolean] = js.undefined,
    showWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    startingDay: scala.Int | scala.Double = null,
    yearColumns: scala.Int | scala.Double = null,
    yearRange: scala.Int | scala.Double = null,
    yearRows: scala.Int | scala.Double = null
  ): IDatepickerPopupConfig = {
    val __obj = js.Dynamic.literal()
    if (altInputFormats != null) __obj.updateDynamic("altInputFormats")(altInputFormats)
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody)
    if (clearText != null) __obj.updateDynamic("clearText")(clearText)
    if (!js.isUndefined(closeOnDateSelection)) __obj.updateDynamic("closeOnDateSelection")(closeOnDateSelection)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText)
    if (currentText != null) __obj.updateDynamic("currentText")(currentText)
    if (customClass != null) __obj.updateDynamic("customClass")(customClass)
    if (dateDisabled != null) __obj.updateDynamic("dateDisabled")(dateDisabled)
    if (datepickerMode != null) __obj.updateDynamic("datepickerMode")(datepickerMode)
    if (datepickerPopup != null) __obj.updateDynamic("datepickerPopup")(datepickerPopup)
    if (datepickerPopupTemplateUrl != null) __obj.updateDynamic("datepickerPopupTemplateUrl")(datepickerPopupTemplateUrl)
    if (datepickerTemplateUrl != null) __obj.updateDynamic("datepickerTemplateUrl")(datepickerTemplateUrl)
    if (formatDay != null) __obj.updateDynamic("formatDay")(formatDay)
    if (formatDayHeader != null) __obj.updateDynamic("formatDayHeader")(formatDayHeader)
    if (formatDayTitle != null) __obj.updateDynamic("formatDayTitle")(formatDayTitle)
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(formatMonth)
    if (formatMonthTitle != null) __obj.updateDynamic("formatMonthTitle")(formatMonthTitle)
    if (formatYear != null) __obj.updateDynamic("formatYear")(formatYear)
    if (html5Types != null) __obj.updateDynamic("html5Types")(html5Types)
    if (initDate != null) __obj.updateDynamic("initDate")(initDate)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (maxMode != null) __obj.updateDynamic("maxMode")(maxMode)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minMode != null) __obj.updateDynamic("minMode")(minMode)
    if (monthColumns != null) __obj.updateDynamic("monthColumns")(monthColumns.asInstanceOf[js.Any])
    if (ngModelOptions != null) __obj.updateDynamic("ngModelOptions")(ngModelOptions)
    if (!js.isUndefined(onOpenFocus)) __obj.updateDynamic("onOpenFocus")(onOpenFocus)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(shortcutPropagation)) __obj.updateDynamic("shortcutPropagation")(shortcutPropagation)
    if (!js.isUndefined(showButtonBar)) __obj.updateDynamic("showButtonBar")(showButtonBar)
    if (!js.isUndefined(showWeeks)) __obj.updateDynamic("showWeeks")(showWeeks)
    if (startingDay != null) __obj.updateDynamic("startingDay")(startingDay.asInstanceOf[js.Any])
    if (yearColumns != null) __obj.updateDynamic("yearColumns")(yearColumns.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearRows != null) __obj.updateDynamic("yearRows")(yearRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerPopupConfig]
  }
}

