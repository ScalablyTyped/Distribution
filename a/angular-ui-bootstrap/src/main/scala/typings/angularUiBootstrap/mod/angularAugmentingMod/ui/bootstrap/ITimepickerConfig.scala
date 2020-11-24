package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimepickerConfig extends js.Object {
  
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
  implicit class ITimepickerConfigOps[Self <: ITimepickerConfig] (val x: Self) extends AnyVal {
    
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
    def setArrowkeys(value: Boolean): Self = this.set("arrowkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowkeys: Self = this.set("arrowkeys", js.undefined)
    
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    
    @scala.inline
    def setMeridiansVarargs(value: String*): Self = this.set("meridians", js.Array(value :_*))
    
    @scala.inline
    def setMeridians(value: js.Array[String]): Self = this.set("meridians", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridians: Self = this.set("meridians", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    
    @scala.inline
    def setMousewheel(value: Boolean): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    
    @scala.inline
    def setReadonlyInput(value: Boolean): Self = this.set("readonlyInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonlyInput: Self = this.set("readonlyInput", js.undefined)
    
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    
    @scala.inline
    def setShowMeridian(value: Boolean): Self = this.set("showMeridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMeridian: Self = this.set("showMeridian", js.undefined)
    
    @scala.inline
    def setShowSeconds(value: Boolean): Self = this.set("showSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSeconds: Self = this.set("showSeconds", js.undefined)
    
    @scala.inline
    def setShowSpinners(value: Boolean): Self = this.set("showSpinners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSpinners: Self = this.set("showSpinners", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
  }
}
