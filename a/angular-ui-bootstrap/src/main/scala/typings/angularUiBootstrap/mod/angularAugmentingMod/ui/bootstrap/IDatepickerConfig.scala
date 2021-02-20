package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatepickerConfig extends StObject {
  
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
  implicit class IDatepickerConfigMutableBuilder[Self <: IDatepickerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomClass(value: /* args */ IDatepickerCellArgs => String): Self = StObject.set(x, "customClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
    
    @scala.inline
    def setDateDisabled(value: /* args */ IDatepickerCellArgs => Boolean): Self = StObject.set(x, "dateDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateDisabledUndefined: Self = StObject.set(x, "dateDisabled", js.undefined)
    
    @scala.inline
    def setDatepickerMode(value: DatepickerMode): Self = StObject.set(x, "datepickerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatepickerModeUndefined: Self = StObject.set(x, "datepickerMode", js.undefined)
    
    @scala.inline
    def setFormatDay(value: String): Self = StObject.set(x, "formatDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDayHeader(value: String): Self = StObject.set(x, "formatDayHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDayHeaderUndefined: Self = StObject.set(x, "formatDayHeader", js.undefined)
    
    @scala.inline
    def setFormatDayTitle(value: String): Self = StObject.set(x, "formatDayTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDayTitleUndefined: Self = StObject.set(x, "formatDayTitle", js.undefined)
    
    @scala.inline
    def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
    
    @scala.inline
    def setFormatMonth(value: String): Self = StObject.set(x, "formatMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatMonthTitle(value: String): Self = StObject.set(x, "formatMonthTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatMonthTitleUndefined: Self = StObject.set(x, "formatMonthTitle", js.undefined)
    
    @scala.inline
    def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
    
    @scala.inline
    def setFormatYear(value: String): Self = StObject.set(x, "formatYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
    
    @scala.inline
    def setInitDate(value: js.Any): Self = StObject.set(x, "initDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitDateUndefined: Self = StObject.set(x, "initDate", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMaxMode(value: String): Self = StObject.set(x, "maxMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxModeUndefined: Self = StObject.set(x, "maxMode", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMinMode(value: String): Self = StObject.set(x, "minMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinModeUndefined: Self = StObject.set(x, "minMode", js.undefined)
    
    @scala.inline
    def setMonthColumns(value: Double): Self = StObject.set(x, "monthColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthColumnsUndefined: Self = StObject.set(x, "monthColumns", js.undefined)
    
    @scala.inline
    def setNgModelOptions(value: IDropdownConfigNgOptions): Self = StObject.set(x, "ngModelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgModelOptionsUndefined: Self = StObject.set(x, "ngModelOptions", js.undefined)
    
    @scala.inline
    def setShortcutPropagation(value: Boolean): Self = StObject.set(x, "shortcutPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutPropagationUndefined: Self = StObject.set(x, "shortcutPropagation", js.undefined)
    
    @scala.inline
    def setShowWeeks(value: Boolean): Self = StObject.set(x, "showWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWeeksUndefined: Self = StObject.set(x, "showWeeks", js.undefined)
    
    @scala.inline
    def setStartingDay(value: Double): Self = StObject.set(x, "startingDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingDayUndefined: Self = StObject.set(x, "startingDay", js.undefined)
    
    @scala.inline
    def setYearColumns(value: Double): Self = StObject.set(x, "yearColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearColumnsUndefined: Self = StObject.set(x, "yearColumns", js.undefined)
    
    @scala.inline
    def setYearRange(value: Double): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    
    @scala.inline
    def setYearRows(value: Double): Self = StObject.set(x, "yearRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearRowsUndefined: Self = StObject.set(x, "yearRows", js.undefined)
  }
}
