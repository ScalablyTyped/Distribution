package typings.antdMobileRn

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.radioPropsTypeMod.RadioPropsType
import typings.antdMobileRn.radioStyleIndexNativeMod.IRadioStyle
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioNativeMod {
  
  @JSImport("antd-mobile-rn/lib/radio/Radio.native", JSImport.Default)
  @js.native
  class default protected () extends Radio {
    def this(props: RadioNativeProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/radio/Radio.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/radio/Radio.native", "default.RadioItem")
    @js.native
    def RadioItem: js.Any = js.native
    inline def RadioItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadioItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/radio/Radio.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Radio
    extends Component[RadioNativeProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MRadio(nextProps: RadioNativeProps): Unit = js.native
    
    def handleClick(): Unit = js.native
  }
  
  trait RadioNativeProps
    extends StObject
       with RadioPropsType {
    
    var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var styles: js.UndefOr[IRadioStyle] = js.undefined
  }
  object RadioNativeProps {
    
    inline def apply(): RadioNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioNativeProps]
    }
    
    extension [Self <: RadioNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: IRadioStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
