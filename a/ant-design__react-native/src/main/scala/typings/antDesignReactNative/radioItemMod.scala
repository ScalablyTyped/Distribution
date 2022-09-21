package typings.antDesignReactNative

import typings.antDesignReactNative.checkboxCheckboxMod.RefCheckboxProps
import typings.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.radioPropsTypeMod.RadioItemPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioItemMod {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioItem", JSImport.Default)
  @js.native
  open class default () extends RadioItem
  
  @js.native
  trait RadioItem
    extends Component[RadioItemProps, js.Object, Any] {
    
    def handleClick(): Unit = js.native
    
    var radio: RefCheckboxProps = js.native
  }
  
  trait RadioItemProps
    extends StObject
       with RadioItemPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object RadioItemProps {
    
    inline def apply(): RadioItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemProps]
    }
    
    extension [Self <: RadioItemProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
