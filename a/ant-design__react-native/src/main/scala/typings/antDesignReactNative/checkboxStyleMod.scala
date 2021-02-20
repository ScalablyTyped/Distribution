package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxStyleMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/style", JSImport.Default)
  @js.native
  def default(theme: Theme): CheckboxStyle = js.native
  
  @js.native
  trait CheckboxStyle extends StObject {
    
    var agreeItem: ViewStyle = js.native
    
    var agreeItemCheckbox: TextStyle = js.native
    
    var checkboxItemCheckbox: TextStyle = js.native
    
    var icon: TextStyle = js.native
    
    var iconRight: TextStyle = js.native
    
    var wrapper: ViewStyle = js.native
  }
  object CheckboxStyle {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CheckboxStyleMutableBuilder[Self <: CheckboxStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgreeItem(value: ViewStyle): Self = StObject.set(x, "agreeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgreeItemCheckbox(value: TextStyle): Self = StObject.set(x, "agreeItemCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxItemCheckbox(value: TextStyle): Self = StObject.set(x, "checkboxItemCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: TextStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconRight(value: TextStyle): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
