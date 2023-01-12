package typings.antdMobileRn.anon

import typings.rmcInputNumber.anon.RegisteredStyleBrand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofstyles extends StObject {
  
  var container: Double & RegisteredStyleBrand
  
  var disabledStepTextColor: Double & RegisteredStyleBrand
  
  var highlightStepBorderColor: Double & RegisteredStyleBrand
  
  var highlightStepTextColor: Double & RegisteredStyleBrand
  
  var input: Double & RegisteredStyleBrand
  
  var stepDisabled: Double & RegisteredStyleBrand
  
  var stepText: Double & RegisteredStyleBrand
  
  var stepWrap: Double & RegisteredStyleBrand
}
object Typeofstyles {
  
  inline def apply(
    container: Double & RegisteredStyleBrand,
    disabledStepTextColor: Double & RegisteredStyleBrand,
    highlightStepBorderColor: Double & RegisteredStyleBrand,
    highlightStepTextColor: Double & RegisteredStyleBrand,
    input: Double & RegisteredStyleBrand,
    stepDisabled: Double & RegisteredStyleBrand,
    stepText: Double & RegisteredStyleBrand,
    stepWrap: Double & RegisteredStyleBrand
  ): Typeofstyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofstyles] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDisabledStepTextColor(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "disabledStepTextColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightStepBorderColor(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "highlightStepBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightStepTextColor(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "highlightStepTextColor", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setStepDisabled(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "stepDisabled", value.asInstanceOf[js.Any])
    
    inline def setStepText(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "stepText", value.asInstanceOf[js.Any])
    
    inline def setStepWrap(value: Double & RegisteredStyleBrand): Self = StObject.set(x, "stepWrap", value.asInstanceOf[js.Any])
  }
}
