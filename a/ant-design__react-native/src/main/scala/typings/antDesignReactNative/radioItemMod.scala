package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.radioPropsTypeMod.RadioItemPropsType
import typings.antDesignReactNative.radioStyleMod.RadioStyle
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioItemMod {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioItem", JSImport.Default)
  @js.native
  class default () extends RadioItem
  
  @js.native
  trait RadioItem
    extends Component[RadioItemNativeProps, js.Any, js.Any] {
    
    def handleClick(): Unit = js.native
    
    var radio: typings.antDesignReactNative.radioRadioMod.default | Null = js.native
  }
  
  trait RadioItemNativeProps
    extends StObject
       with RadioItemPropsType
       with WithThemeStyles[RadioStyle] {
    
    var radioStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object RadioItemNativeProps {
    
    @scala.inline
    def apply(): RadioItemNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemNativeProps]
    }
    
    @scala.inline
    implicit class RadioItemNativePropsMutableBuilder[Self <: RadioItemNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadioStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "radioStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioStyleNull: Self = StObject.set(x, "radioStyle", null)
      
      @scala.inline
      def setRadioStyleUndefined: Self = StObject.set(x, "radioStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
