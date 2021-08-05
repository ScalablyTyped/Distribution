package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.radioPropsTypeMod.RadioPropsType
import typings.antDesignReactNative.radioStyleMod.RadioStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadioMod {
  
  @JSImport("@ant-design/react-native/lib/radio/Radio", JSImport.Default)
  @js.native
  class default protected () extends Radio {
    def this(props: RadioNativeProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/radio/Radio", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/radio/Radio", "default.RadioItem")
    @js.native
    def RadioItem: js.Any = js.native
    inline def RadioItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadioItem")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Radio
    extends Component[RadioNativeProps, js.Any, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MRadio(nextProps: RadioNativeProps): Unit = js.native
    
    def handleClick(): Unit = js.native
  }
  
  trait RadioNativeProps
    extends StObject
       with RadioPropsType
       with WithThemeStyles[RadioStyle] {
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object RadioNativeProps {
    
    inline def apply(): RadioNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioNativeProps]
    }
    
    extension [Self <: RadioNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
