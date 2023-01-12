package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkbox extends StObject {
  
  var checkbox: BorderRadius
  
  var checkbox_inner: Height
  
  var checkbox_inner_after: BackgroundColor
  
  var checkbox_inner_after_disabled: BackgroundColorString
  
  var checkbox_wave: BorderRadius
  
  var radioItemContent: Color
  
  var radioItemContentDisable: ColorString
}
object Checkbox {
  
  inline def apply(
    checkbox: BorderRadius,
    checkbox_inner: Height,
    checkbox_inner_after: BackgroundColor,
    checkbox_inner_after_disabled: BackgroundColorString,
    checkbox_wave: BorderRadius,
    radioItemContent: Color,
    radioItemContentDisable: ColorString
  ): Checkbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], checkbox_inner = checkbox_inner.asInstanceOf[js.Any], checkbox_inner_after = checkbox_inner_after.asInstanceOf[js.Any], checkbox_inner_after_disabled = checkbox_inner_after_disabled.asInstanceOf[js.Any], checkbox_wave = checkbox_wave.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    inline def setCheckbox(value: BorderRadius): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckbox_inner(value: Height): Self = StObject.set(x, "checkbox_inner", value.asInstanceOf[js.Any])
    
    inline def setCheckbox_inner_after(value: BackgroundColor): Self = StObject.set(x, "checkbox_inner_after", value.asInstanceOf[js.Any])
    
    inline def setCheckbox_inner_after_disabled(value: BackgroundColorString): Self = StObject.set(x, "checkbox_inner_after_disabled", value.asInstanceOf[js.Any])
    
    inline def setCheckbox_wave(value: BorderRadius): Self = StObject.set(x, "checkbox_wave", value.asInstanceOf[js.Any])
    
    inline def setRadioItemContent(value: Color): Self = StObject.set(x, "radioItemContent", value.asInstanceOf[js.Any])
    
    inline def setRadioItemContentDisable(value: ColorString): Self = StObject.set(x, "radioItemContentDisable", value.asInstanceOf[js.Any])
  }
}
