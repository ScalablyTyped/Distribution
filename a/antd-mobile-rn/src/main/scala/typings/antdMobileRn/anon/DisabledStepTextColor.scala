package typings.antdMobileRn.anon

import typings.rmcInputNumber.anon.RegisteredStyleBrand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisabledStepTextColor extends js.Object {
  
  var container: Double with RegisteredStyleBrand = js.native
  
  var disabledStepTextColor: Double with RegisteredStyleBrand = js.native
  
  var highlightStepBorderColor: Double with RegisteredStyleBrand = js.native
  
  var highlightStepTextColor: Double with RegisteredStyleBrand = js.native
  
  var input: Double with RegisteredStyleBrand = js.native
  
  var stepDisabled: Double with RegisteredStyleBrand = js.native
  
  var stepText: Double with RegisteredStyleBrand = js.native
  
  var stepWrap: Double with RegisteredStyleBrand = js.native
}
object DisabledStepTextColor {
  
  @scala.inline
  def apply(
    container: Double with RegisteredStyleBrand,
    disabledStepTextColor: Double with RegisteredStyleBrand,
    highlightStepBorderColor: Double with RegisteredStyleBrand,
    highlightStepTextColor: Double with RegisteredStyleBrand,
    input: Double with RegisteredStyleBrand,
    stepDisabled: Double with RegisteredStyleBrand,
    stepText: Double with RegisteredStyleBrand,
    stepWrap: Double with RegisteredStyleBrand
  ): DisabledStepTextColor = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledStepTextColor]
  }
  
  @scala.inline
  implicit class DisabledStepTextColorOps[Self <: DisabledStepTextColor] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: Double with RegisteredStyleBrand): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStepTextColor(value: Double with RegisteredStyleBrand): Self = this.set("disabledStepTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStepBorderColor(value: Double with RegisteredStyleBrand): Self = this.set("highlightStepBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStepTextColor(value: Double with RegisteredStyleBrand): Self = this.set("highlightStepTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: Double with RegisteredStyleBrand): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDisabled(value: Double with RegisteredStyleBrand): Self = this.set("stepDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepText(value: Double with RegisteredStyleBrand): Self = this.set("stepText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepWrap(value: Double with RegisteredStyleBrand): Self = this.set("stepWrap", value.asInstanceOf[js.Any])
  }
}
