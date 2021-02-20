package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.anon.Hide
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait IDatepickerDateRange extends StObject {
    
    var end: Date = js.native
    
    var start: Date = js.native
  }
  object IDatepickerDateRange {
    
    @scala.inline
    def apply(end: Date, start: Date): IDatepickerDateRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatepickerDateRange]
    }
    
    @scala.inline
    implicit class IDatepickerDateRangeMutableBuilder[Self <: IDatepickerDateRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDatepickerOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.native
    
    var autoclose: js.UndefOr[Boolean] = js.native
    
    var container: js.UndefOr[String | Boolean] = js.native
    
    var dateFormat: js.UndefOr[String] = js.native
    
    var dateType: js.UndefOr[String] = js.native
    
    var daysOfWeekDisabled: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double | Hide] = js.native
    
    var disabledDates: js.UndefOr[js.Array[IDatepickerDateRange]] = js.native
    
    var html: js.UndefOr[Boolean] = js.native
    
    var iconLeft: js.UndefOr[String] = js.native
    
    var iconRight: js.UndefOr[String] = js.native
    
    var maxDate: js.UndefOr[Date] = js.native
    
    var minDate: js.UndefOr[Date] = js.native
    
    var minView: js.UndefOr[Double] = js.native
    
    var modelDateFormat: js.UndefOr[String] = js.native
    
    var onBeforeHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
    
    var onBeforeShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
    
    var onHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
    
    var onShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var startDate: js.UndefOr[Date] = js.native
    
    var startView: js.UndefOr[Double] = js.native
    
    var startWeek: js.UndefOr[Double] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var timezone: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[String] = js.native
    
    var useNative: js.UndefOr[Boolean] = js.native
  }
  object IDatepickerOptions {
    
    @scala.inline
    def apply(): IDatepickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatepickerOptions]
    }
    
    @scala.inline
    implicit class IDatepickerOptionsMutableBuilder[Self <: IDatepickerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDateType(value: String): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTypeUndefined: Self = StObject.set(x, "dateType", js.undefined)
      
      @scala.inline
      def setDaysOfWeekDisabled(value: String): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: js.Array[IDatepickerDateRange]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: IDatepickerDateRange*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIconLeft(value: String): Self = StObject.set(x, "iconLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconLeftUndefined: Self = StObject.set(x, "iconLeft", js.undefined)
      
      @scala.inline
      def setIconRight(value: String): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinView(value: Double): Self = StObject.set(x, "minView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinViewUndefined: Self = StObject.set(x, "minView", js.undefined)
      
      @scala.inline
      def setModelDateFormat(value: String): Self = StObject.set(x, "modelDateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDateFormatUndefined: Self = StObject.set(x, "modelDateFormat", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* datepicker */ IDatepicker => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setStartView(value: Double): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
      
      @scala.inline
      def setStartWeek(value: Double): Self = StObject.set(x, "startWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartWeekUndefined: Self = StObject.set(x, "startWeek", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
    }
  }
  
  @js.native
  trait IDatepickerProvider extends StObject {
    
    var defaults: IDatepickerOptions = js.native
  }
  object IDatepickerProvider {
    
    @scala.inline
    def apply(defaults: IDatepickerOptions): IDatepickerProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatepickerProvider]
    }
    
    @scala.inline
    implicit class IDatepickerProviderMutableBuilder[Self <: IDatepickerProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IDatepickerOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IDatepickerService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[IDatepickerOptions], 
    IDatepicker
  ]
}
