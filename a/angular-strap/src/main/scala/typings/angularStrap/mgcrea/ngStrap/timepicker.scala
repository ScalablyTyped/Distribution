package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.anon.Hide
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Timepicker
// see http://mgcrea.github.io/angular-strap/#/timepickers
///////////////////////////////////////////////////////////////////////////
object timepicker {
  
  trait ITimepicker extends StObject
  
  trait ITimepickerOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var arrowBehaviour: js.UndefOr[String] = js.undefined
    
    var autoclose: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var iconDown: js.UndefOr[String] = js.undefined
    
    var iconUp: js.UndefOr[String] = js.undefined
    
    // TODO
    var length: js.UndefOr[Double] = js.undefined
    
    // TODO
    var maxTime: js.UndefOr[Date] = js.undefined
    
    var minTime: js.UndefOr[Date] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var modelTimeFormat: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var roundDisplay: js.UndefOr[Boolean] = js.undefined
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var timeFormat: js.UndefOr[String] = js.undefined
    
    var timeType: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var useNative: js.UndefOr[Boolean] = js.undefined
  }
  object ITimepickerOptions {
    
    @scala.inline
    def apply(): ITimepickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimepickerOptions]
    }
    
    @scala.inline
    implicit class ITimepickerOptionsMutableBuilder[Self <: ITimepickerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrowBehaviour(value: String): Self = StObject.set(x, "arrowBehaviour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowBehaviourUndefined: Self = StObject.set(x, "arrowBehaviour", js.undefined)
      
      @scala.inline
      def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIconDown(value: String): Self = StObject.set(x, "iconDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDownUndefined: Self = StObject.set(x, "iconDown", js.undefined)
      
      @scala.inline
      def setIconUp(value: String): Self = StObject.set(x, "iconUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUpUndefined: Self = StObject.set(x, "iconUp", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMaxTime(value: Date): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinTime(value: Date): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setModelTimeFormat(value: String): Self = StObject.set(x, "modelTimeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelTimeFormatUndefined: Self = StObject.set(x, "modelTimeFormat", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRoundDisplay(value: Boolean): Self = StObject.set(x, "roundDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundDisplayUndefined: Self = StObject.set(x, "roundDisplay", js.undefined)
      
      @scala.inline
      def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      @scala.inline
      def setTimeType(value: String): Self = StObject.set(x, "timeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeTypeUndefined: Self = StObject.set(x, "timeType", js.undefined)
      
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
  
  trait ITimepickerProvider extends StObject {
    
    var defaults: ITimepickerOptions
  }
  object ITimepickerProvider {
    
    @scala.inline
    def apply(defaults: ITimepickerOptions): ITimepickerProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimepickerProvider]
    }
    
    @scala.inline
    implicit class ITimepickerProviderMutableBuilder[Self <: ITimepickerProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: ITimepickerOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type ITimepickerService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[ITimepickerOptions], 
    ITimepicker
  ]
}
