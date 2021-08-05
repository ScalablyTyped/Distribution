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
    
    inline def apply(): ITimepickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimepickerOptions]
    }
    
    extension [Self <: ITimepickerOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setArrowBehaviour(value: String): Self = StObject.set(x, "arrowBehaviour", value.asInstanceOf[js.Any])
      
      inline def setArrowBehaviourUndefined: Self = StObject.set(x, "arrowBehaviour", js.undefined)
      
      inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setIconDown(value: String): Self = StObject.set(x, "iconDown", value.asInstanceOf[js.Any])
      
      inline def setIconDownUndefined: Self = StObject.set(x, "iconDown", js.undefined)
      
      inline def setIconUp(value: String): Self = StObject.set(x, "iconUp", value.asInstanceOf[js.Any])
      
      inline def setIconUpUndefined: Self = StObject.set(x, "iconUp", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxTime(value: Date): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: Date): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setModelTimeFormat(value: String): Self = StObject.set(x, "modelTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setModelTimeFormatUndefined: Self = StObject.set(x, "modelTimeFormat", js.undefined)
      
      inline def setOnBeforeHide(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* timepicker */ ITimepicker => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRoundDisplay(value: Boolean): Self = StObject.set(x, "roundDisplay", value.asInstanceOf[js.Any])
      
      inline def setRoundDisplayUndefined: Self = StObject.set(x, "roundDisplay", js.undefined)
      
      inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      inline def setTimeType(value: String): Self = StObject.set(x, "timeType", value.asInstanceOf[js.Any])
      
      inline def setTimeTypeUndefined: Self = StObject.set(x, "timeType", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
      
      inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
    }
  }
  
  trait ITimepickerProvider extends StObject {
    
    var defaults: ITimepickerOptions
  }
  object ITimepickerProvider {
    
    inline def apply(defaults: ITimepickerOptions): ITimepickerProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimepickerProvider]
    }
    
    extension [Self <: ITimepickerProvider](x: Self) {
      
      inline def setDefaults(value: ITimepickerOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type ITimepickerService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[ITimepickerOptions], 
    ITimepicker
  ]
}
