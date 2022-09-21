package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxStyleMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): CheckboxStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[CheckboxStyle]
  
  trait CheckboxStyle extends StObject {
    
    var checkbox: ViewStyle
    
    var checkbox_checked: ViewStyle
    
    var checkbox_disabled: ViewStyle
    
    var checkbox_inner: ViewStyle
    
    var checkbox_inner_after: ViewStyle
    
    var checkbox_inner_after_disabled: ViewStyle
    
    var checkbox_inner_after_indeterminate: ViewStyle
    
    var checkbox_inner_disabled: ViewStyle
    
    var checkbox_inner_indeterminate: ViewStyle
    
    var checkbox_label: ViewStyle
    
    var checkbox_label_disabled: ViewStyle
    
    var checkbox_wave: ViewStyle
    
    var checkbox_wrapper: ViewStyle
  }
  object CheckboxStyle {
    
    inline def apply(
      checkbox: ViewStyle,
      checkbox_checked: ViewStyle,
      checkbox_disabled: ViewStyle,
      checkbox_inner: ViewStyle,
      checkbox_inner_after: ViewStyle,
      checkbox_inner_after_disabled: ViewStyle,
      checkbox_inner_after_indeterminate: ViewStyle,
      checkbox_inner_disabled: ViewStyle,
      checkbox_inner_indeterminate: ViewStyle,
      checkbox_label: ViewStyle,
      checkbox_label_disabled: ViewStyle,
      checkbox_wave: ViewStyle,
      checkbox_wrapper: ViewStyle
    ): CheckboxStyle = {
      val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], checkbox_checked = checkbox_checked.asInstanceOf[js.Any], checkbox_disabled = checkbox_disabled.asInstanceOf[js.Any], checkbox_inner = checkbox_inner.asInstanceOf[js.Any], checkbox_inner_after = checkbox_inner_after.asInstanceOf[js.Any], checkbox_inner_after_disabled = checkbox_inner_after_disabled.asInstanceOf[js.Any], checkbox_inner_after_indeterminate = checkbox_inner_after_indeterminate.asInstanceOf[js.Any], checkbox_inner_disabled = checkbox_inner_disabled.asInstanceOf[js.Any], checkbox_inner_indeterminate = checkbox_inner_indeterminate.asInstanceOf[js.Any], checkbox_label = checkbox_label.asInstanceOf[js.Any], checkbox_label_disabled = checkbox_label_disabled.asInstanceOf[js.Any], checkbox_wave = checkbox_wave.asInstanceOf[js.Any], checkbox_wrapper = checkbox_wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxStyle]
    }
    
    extension [Self <: CheckboxStyle](x: Self) {
      
      inline def setCheckbox(value: ViewStyle): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_checked(value: ViewStyle): Self = StObject.set(x, "checkbox_checked", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_disabled(value: ViewStyle): Self = StObject.set(x, "checkbox_disabled", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_inner(value: ViewStyle): Self = StObject.set(x, "checkbox_inner", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_inner_after(value: ViewStyle): Self = StObject.set(x, "checkbox_inner_after", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_inner_after_disabled(value: ViewStyle): Self = StObject.set(x, "checkbox_inner_after_disabled", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_inner_after_indeterminate(value: ViewStyle): Self = StObject.set(x, "checkbox_inner_after_indeterminate", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_inner_disabled(value: ViewStyle): Self = StObject.set(x, "checkbox_inner_disabled", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_inner_indeterminate(value: ViewStyle): Self = StObject.set(x, "checkbox_inner_indeterminate", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_label(value: ViewStyle): Self = StObject.set(x, "checkbox_label", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_label_disabled(value: ViewStyle): Self = StObject.set(x, "checkbox_label_disabled", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_wave(value: ViewStyle): Self = StObject.set(x, "checkbox_wave", value.asInstanceOf[js.Any])
      
      inline def setCheckbox_wrapper(value: ViewStyle): Self = StObject.set(x, "checkbox_wrapper", value.asInstanceOf[js.Any])
    }
  }
}
