package typings.antDesignReactNative

import typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxItemPropsType
import typings.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxItemMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/CheckboxItem", JSImport.Default)
  @js.native
  class default () extends CheckboxItem
  
  @js.native
  trait CheckboxItem
    extends Component[CheckboxItemProps, js.Any, js.Any] {
    
    var checkbox: typings.antDesignReactNative.checkboxCheckboxMod.default | Null = js.native
    
    def handleClick(): Unit = js.native
  }
  
  trait CheckboxItemProps
    extends StObject
       with CheckboxItemPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var checkboxStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CheckboxItemProps {
    
    inline def apply(): CheckboxItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxItemProps]
    }
    
    extension [Self <: CheckboxItemProps](x: Self) {
      
      inline def setCheckboxStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "checkboxStyle", value.asInstanceOf[js.Any])
      
      inline def setCheckboxStyleNull: Self = StObject.set(x, "checkboxStyle", null)
      
      inline def setCheckboxStyleUndefined: Self = StObject.set(x, "checkboxStyle", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
