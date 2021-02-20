package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimepickerConfig extends StObject {
  
  /**
    * Whether the user can use up/down arrowkeys inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var arrowkeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of hours to increase or decrease when using a button.
    *
    * @default 1
    */
  var hourStep: js.UndefOr[Double] = js.native
  
  /**
    * Meridian labels based on locale. To override you must supply an array like ['AM', 'PM'].
    *
    * @default null
    */
  var meridians: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Number of minutes to increase or decrease when using a button.
    *
    * @default 1
    */
  var minuteStep: js.UndefOr[Double] = js.native
  
  /**
    * Whether the user can scroll inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var mousewheel: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the user can type inside the hours & minutes input.
    *
    * @default false
    */
  var readonlyInput: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of seconds to increase or decrease when using a button.
    *
    * @default 1
    */
  var secondStep: js.UndefOr[Double] = js.native
  
  /**
    * Whether to display 12H or 24H mode.
    *
    * @default true
    */
  var showMeridian: js.UndefOr[Boolean] = js.native
  
  /**
    * Show seconds input.
    *
    * @default false
    */
  var showSeconds: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows spinner arrows above and below the inputs.
    *
    * @default true
    */
  var showSpinners: js.UndefOr[Boolean] = js.native
  
  /**
    * Add the ability to override the template used on the component.
    *
    * @default 'uib/template/timepicker/timepicker.html'
    */
  var templateUrl: js.UndefOr[String] = js.native
}
object ITimepickerConfig {
  
  @scala.inline
  def apply(): ITimepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimepickerConfig]
  }
  
  @scala.inline
  implicit class ITimepickerConfigMutableBuilder[Self <: ITimepickerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowkeys(value: Boolean): Self = StObject.set(x, "arrowkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowkeysUndefined: Self = StObject.set(x, "arrowkeys", js.undefined)
    
    @scala.inline
    def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
    
    @scala.inline
    def setMeridians(value: js.Array[String]): Self = StObject.set(x, "meridians", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiansUndefined: Self = StObject.set(x, "meridians", js.undefined)
    
    @scala.inline
    def setMeridiansVarargs(value: String*): Self = StObject.set(x, "meridians", js.Array(value :_*))
    
    @scala.inline
    def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    @scala.inline
    def setMousewheel(value: Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    @scala.inline
    def setReadonlyInput(value: Boolean): Self = StObject.set(x, "readonlyInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyInputUndefined: Self = StObject.set(x, "readonlyInput", js.undefined)
    
    @scala.inline
    def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
    
    @scala.inline
    def setShowMeridian(value: Boolean): Self = StObject.set(x, "showMeridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMeridianUndefined: Self = StObject.set(x, "showMeridian", js.undefined)
    
    @scala.inline
    def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
    
    @scala.inline
    def setShowSpinners(value: Boolean): Self = StObject.set(x, "showSpinners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSpinnersUndefined: Self = StObject.set(x, "showSpinners", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
  }
}
