package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.anon.Hide
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Datepicker
// see http://mgcrea.github.io/angular-strap/#/datepickers
///////////////////////////////////////////////////////////////////////////
object datepicker {
  
  @js.native
  trait IDatepicker extends StObject {
    
    def destroy(): Unit = js.native
    
    def hide(): Unit = js.native
    
    def int(): Unit = js.native
    
    def select(dateConstructorArg: String, keep: Boolean): Unit = js.native
    def select(dateConstructorArg: js.Array[Double], keep: Boolean): Unit = js.native
    def select(dateConstructorArg: Double, keep: Boolean): Unit = js.native
    
    def setMode(mode: js.Any): Unit = js.native
    
    def show(): Unit = js.native
    
    def update(date: Date): Unit = js.native
    
    def updateDisabledDates(dateRanges: js.Array[IDatepickerDateRange]): Unit = js.native
  }
  
  trait IDatepickerDateRange extends StObject {
    
    var end: Date
    
    var start: Date
  }
  object IDatepickerDateRange {
    
    inline def apply(end: Date, start: Date): IDatepickerDateRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatepickerDateRange]
    }
    
    extension [Self <: IDatepickerDateRange](x: Self) {
      
      inline def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDatepickerOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var autoclose: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var dateType: js.UndefOr[String] = js.undefined
    
    var daysOfWeekDisabled: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var disabledDates: js.UndefOr[js.Array[IDatepickerDateRange]] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var iconLeft: js.UndefOr[String] = js.undefined
    
    var iconRight: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var minView: js.UndefOr[Double] = js.undefined
    
    var modelDateFormat: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[Date] = js.undefined
    
    var startView: js.UndefOr[Double] = js.undefined
    
    var startWeek: js.UndefOr[Double] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var useNative: js.UndefOr[Boolean] = js.undefined
  }
  object IDatepickerOptions {
    
    inline def apply(): IDatepickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatepickerOptions]
    }
    
    extension [Self <: IDatepickerOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDateType(value: String): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
      
      inline def setDateTypeUndefined: Self = StObject.set(x, "dateType", js.undefined)
      
      inline def setDaysOfWeekDisabled(value: String): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisabledDates(value: js.Array[IDatepickerDateRange]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: IDatepickerDateRange*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setIconLeft(value: String): Self = StObject.set(x, "iconLeft", value.asInstanceOf[js.Any])
      
      inline def setIconLeftUndefined: Self = StObject.set(x, "iconLeft", js.undefined)
      
      inline def setIconRight(value: String): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      inline def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinView(value: Double): Self = StObject.set(x, "minView", value.asInstanceOf[js.Any])
      
      inline def setMinViewUndefined: Self = StObject.set(x, "minView", js.undefined)
      
      inline def setModelDateFormat(value: String): Self = StObject.set(x, "modelDateFormat", value.asInstanceOf[js.Any])
      
      inline def setModelDateFormatUndefined: Self = StObject.set(x, "modelDateFormat", js.undefined)
      
      inline def setOnBeforeHide(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setStartView(value: Double): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
      
      inline def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
      
      inline def setStartWeek(value: Double): Self = StObject.set(x, "startWeek", value.asInstanceOf[js.Any])
      
      inline def setStartWeekUndefined: Self = StObject.set(x, "startWeek", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
      
      inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
    }
  }
  
  trait IDatepickerProvider extends StObject {
    
    var defaults: IDatepickerOptions
  }
  object IDatepickerProvider {
    
    inline def apply(defaults: IDatepickerOptions): IDatepickerProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatepickerProvider]
    }
    
    extension [Self <: IDatepickerProvider](x: Self) {
      
      inline def setDefaults(value: IDatepickerOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IDatepickerService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[IDatepickerOptions], 
    IDatepicker
  ]
}
