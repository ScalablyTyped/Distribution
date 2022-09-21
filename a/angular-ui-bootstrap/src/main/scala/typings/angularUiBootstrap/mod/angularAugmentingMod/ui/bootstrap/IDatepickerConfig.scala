package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDatepickerConfig extends StObject {
  
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
  var initDate: js.UndefOr[Any] = js.undefined
  
  /**
    * Defines the maximum available date.
    *
    * @default null
    */
  var maxDate: js.UndefOr[Any] = js.undefined
  
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
  var minDate: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): IDatepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatepickerConfig]
  }
  
  extension [Self <: IDatepickerConfig](x: Self) {
    
    inline def setCustomClass(value: /* args */ IDatepickerCellArgs => String): Self = StObject.set(x, "customClass", js.Any.fromFunction1(value))
    
    inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
    
    inline def setDateDisabled(value: /* args */ IDatepickerCellArgs => Boolean): Self = StObject.set(x, "dateDisabled", js.Any.fromFunction1(value))
    
    inline def setDateDisabledUndefined: Self = StObject.set(x, "dateDisabled", js.undefined)
    
    inline def setDatepickerMode(value: DatepickerMode): Self = StObject.set(x, "datepickerMode", value.asInstanceOf[js.Any])
    
    inline def setDatepickerModeUndefined: Self = StObject.set(x, "datepickerMode", js.undefined)
    
    inline def setFormatDay(value: String): Self = StObject.set(x, "formatDay", value.asInstanceOf[js.Any])
    
    inline def setFormatDayHeader(value: String): Self = StObject.set(x, "formatDayHeader", value.asInstanceOf[js.Any])
    
    inline def setFormatDayHeaderUndefined: Self = StObject.set(x, "formatDayHeader", js.undefined)
    
    inline def setFormatDayTitle(value: String): Self = StObject.set(x, "formatDayTitle", value.asInstanceOf[js.Any])
    
    inline def setFormatDayTitleUndefined: Self = StObject.set(x, "formatDayTitle", js.undefined)
    
    inline def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
    
    inline def setFormatMonth(value: String): Self = StObject.set(x, "formatMonth", value.asInstanceOf[js.Any])
    
    inline def setFormatMonthTitle(value: String): Self = StObject.set(x, "formatMonthTitle", value.asInstanceOf[js.Any])
    
    inline def setFormatMonthTitleUndefined: Self = StObject.set(x, "formatMonthTitle", js.undefined)
    
    inline def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
    
    inline def setFormatYear(value: String): Self = StObject.set(x, "formatYear", value.asInstanceOf[js.Any])
    
    inline def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
    
    inline def setInitDate(value: Any): Self = StObject.set(x, "initDate", value.asInstanceOf[js.Any])
    
    inline def setInitDateUndefined: Self = StObject.set(x, "initDate", js.undefined)
    
    inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMaxMode(value: String): Self = StObject.set(x, "maxMode", value.asInstanceOf[js.Any])
    
    inline def setMaxModeUndefined: Self = StObject.set(x, "maxMode", js.undefined)
    
    inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMinMode(value: String): Self = StObject.set(x, "minMode", value.asInstanceOf[js.Any])
    
    inline def setMinModeUndefined: Self = StObject.set(x, "minMode", js.undefined)
    
    inline def setMonthColumns(value: Double): Self = StObject.set(x, "monthColumns", value.asInstanceOf[js.Any])
    
    inline def setMonthColumnsUndefined: Self = StObject.set(x, "monthColumns", js.undefined)
    
    inline def setNgModelOptions(value: IDropdownConfigNgOptions): Self = StObject.set(x, "ngModelOptions", value.asInstanceOf[js.Any])
    
    inline def setNgModelOptionsUndefined: Self = StObject.set(x, "ngModelOptions", js.undefined)
    
    inline def setShortcutPropagation(value: Boolean): Self = StObject.set(x, "shortcutPropagation", value.asInstanceOf[js.Any])
    
    inline def setShortcutPropagationUndefined: Self = StObject.set(x, "shortcutPropagation", js.undefined)
    
    inline def setShowWeeks(value: Boolean): Self = StObject.set(x, "showWeeks", value.asInstanceOf[js.Any])
    
    inline def setShowWeeksUndefined: Self = StObject.set(x, "showWeeks", js.undefined)
    
    inline def setStartingDay(value: Double): Self = StObject.set(x, "startingDay", value.asInstanceOf[js.Any])
    
    inline def setStartingDayUndefined: Self = StObject.set(x, "startingDay", js.undefined)
    
    inline def setYearColumns(value: Double): Self = StObject.set(x, "yearColumns", value.asInstanceOf[js.Any])
    
    inline def setYearColumnsUndefined: Self = StObject.set(x, "yearColumns", js.undefined)
    
    inline def setYearRange(value: Double): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    
    inline def setYearRows(value: Double): Self = StObject.set(x, "yearRows", value.asInstanceOf[js.Any])
    
    inline def setYearRowsUndefined: Self = StObject.set(x, "yearRows", js.undefined)
  }
}
