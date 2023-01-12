package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimepickerConfig extends StObject {
  
  /**
    * Whether the user can use up/down arrowkeys inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var arrowkeys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of hours to increase or decrease when using a button.
    *
    * @default 1
    */
  var hourStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Meridian labels based on locale. To override you must supply an array like ['AM', 'PM'].
    *
    * @default null
    */
  var meridians: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Number of minutes to increase or decrease when using a button.
    *
    * @default 1
    */
  var minuteStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the user can scroll inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var mousewheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the user can type inside the hours & minutes input.
    *
    * @default false
    */
  var readonlyInput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of seconds to increase or decrease when using a button.
    *
    * @default 1
    */
  var secondStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to display 12H or 24H mode.
    *
    * @default true
    */
  var showMeridian: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show seconds input.
    *
    * @default false
    */
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows spinner arrows above and below the inputs.
    *
    * @default true
    */
  var showSpinners: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add the ability to override the template used on the component.
    *
    * @default 'uib/template/timepicker/timepicker.html'
    */
  var templateUrl: js.UndefOr[String] = js.undefined
}
object ITimepickerConfig {
  
  inline def apply(): ITimepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimepickerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITimepickerConfig] (val x: Self) extends AnyVal {
    
    inline def setArrowkeys(value: Boolean): Self = StObject.set(x, "arrowkeys", value.asInstanceOf[js.Any])
    
    inline def setArrowkeysUndefined: Self = StObject.set(x, "arrowkeys", js.undefined)
    
    inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
    
    inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
    
    inline def setMeridians(value: js.Array[String]): Self = StObject.set(x, "meridians", value.asInstanceOf[js.Any])
    
    inline def setMeridiansUndefined: Self = StObject.set(x, "meridians", js.undefined)
    
    inline def setMeridiansVarargs(value: String*): Self = StObject.set(x, "meridians", js.Array(value*))
    
    inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    inline def setMousewheel(value: Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    inline def setReadonlyInput(value: Boolean): Self = StObject.set(x, "readonlyInput", value.asInstanceOf[js.Any])
    
    inline def setReadonlyInputUndefined: Self = StObject.set(x, "readonlyInput", js.undefined)
    
    inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
    inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
    
    inline def setShowMeridian(value: Boolean): Self = StObject.set(x, "showMeridian", value.asInstanceOf[js.Any])
    
    inline def setShowMeridianUndefined: Self = StObject.set(x, "showMeridian", js.undefined)
    
    inline def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
    
    inline def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
    
    inline def setShowSpinners(value: Boolean): Self = StObject.set(x, "showSpinners", value.asInstanceOf[js.Any])
    
    inline def setShowSpinnersUndefined: Self = StObject.set(x, "showSpinners", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
  }
}
