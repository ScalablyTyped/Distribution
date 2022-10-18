package typings.antdMobileRn

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.libRadioPropsTypeMod.RadioItemPropsType
import typings.antdMobileRn.libRadioStyleIndexDotnativeMod.IRadioStyle
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioRadioItemDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/radio/RadioItem.native", JSImport.Default)
  @js.native
  open class default () extends RadioItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/radio/RadioItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/radio/RadioItem.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RadioItem extends Component[RadioItemNativeProps, Any, Any] {
    
    def handleClick(): Unit = js.native
  }
  
  trait RadioItemNativeProps
    extends StObject
       with RadioItemPropsType {
    
    var radioStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[IRadioStyle] = js.undefined
  }
  object RadioItemNativeProps {
    
    inline def apply(): RadioItemNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemNativeProps]
    }
    
    extension [Self <: RadioItemNativeProps](x: Self) {
      
      inline def setRadioStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "radioStyle", value.asInstanceOf[js.Any])
      
      inline def setRadioStyleNull: Self = StObject.set(x, "radioStyle", null)
      
      inline def setRadioStyleUndefined: Self = StObject.set(x, "radioStyle", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: IRadioStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
