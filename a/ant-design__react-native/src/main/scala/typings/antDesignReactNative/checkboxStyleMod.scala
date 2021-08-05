package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
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
    
    var agreeItem: ViewStyle
    
    var agreeItemCheckbox: TextStyle
    
    var checkboxItemCheckbox: TextStyle
    
    var icon: TextStyle
    
    var iconRight: TextStyle
    
    var wrapper: ViewStyle
  }
  object CheckboxStyle {
    
    inline def apply(
      agreeItem: ViewStyle,
      agreeItemCheckbox: TextStyle,
      checkboxItemCheckbox: TextStyle,
      icon: TextStyle,
      iconRight: TextStyle,
      wrapper: ViewStyle
    ): CheckboxStyle = {
      val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxStyle]
    }
    
    extension [Self <: CheckboxStyle](x: Self) {
      
      inline def setAgreeItem(value: ViewStyle): Self = StObject.set(x, "agreeItem", value.asInstanceOf[js.Any])
      
      inline def setAgreeItemCheckbox(value: TextStyle): Self = StObject.set(x, "agreeItemCheckbox", value.asInstanceOf[js.Any])
      
      inline def setCheckboxItemCheckbox(value: TextStyle): Self = StObject.set(x, "checkboxItemCheckbox", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: TextStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconRight(value: TextStyle): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
