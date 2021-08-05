package typings.antDesignReactNative

import typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType
import typings.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agreeItemMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/AgreeItem", JSImport.Default)
  @js.native
  class default () extends AgreeItem
  
  @js.native
  trait AgreeItem
    extends Component[AgreeItemProps, js.Any, js.Any] {
    
    var checkbox: typings.antDesignReactNative.checkboxCheckboxMod.default | Null = js.native
    
    def handleClick(): Unit = js.native
  }
  
  trait AgreeItemProps
    extends StObject
       with CheckboxPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object AgreeItemProps {
    
    inline def apply(): AgreeItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgreeItemProps]
    }
    
    extension [Self <: AgreeItemProps](x: Self) {
      
      inline def setCheckboxStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "checkboxStyle", value.asInstanceOf[js.Any])
      
      inline def setCheckboxStyleNull: Self = StObject.set(x, "checkboxStyle", null)
      
      inline def setCheckboxStyleUndefined: Self = StObject.set(x, "checkboxStyle", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
