package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Full
import typings.antDesignReactNative.anon.TypeofCardBody
import typings.antDesignReactNative.anon.TypeofCardFooter
import typings.antDesignReactNative.anon.TypeofCardHeader
import typings.antDesignReactNative.libCardStyleMod.CardStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardMod {
  
  @JSImport("@ant-design/react-native/lib/card", JSImport.Default)
  @js.native
  open class default () extends Card
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/card", "default.Body")
    @js.native
    def Body: TypeofCardBody = js.native
    inline def Body_=(x: TypeofCardBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/card", "default.Footer")
    @js.native
    def Footer: TypeofCardFooter = js.native
    inline def Footer_=(x: TypeofCardFooter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/card", "default.Header")
    @js.native
    def Header: TypeofCardHeader = js.native
    inline def Header_=(x: TypeofCardHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/card", "default.defaultProps")
    @js.native
    def defaultProps: Full = js.native
    inline def defaultProps_=(x: Full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Card extends Component[CardNativeProps, Any, Any]
  
  trait CardNativeProps
    extends StObject
       with WithThemeStyles[CardStyle] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CardNativeProps {
    
    inline def apply(): CardNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardNativeProps]
    }
    
    extension [Self <: CardNativeProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
