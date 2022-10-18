package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.lg
import typings.antDesignReactNative.antDesignReactNativeStrings.md
import typings.antDesignReactNative.antDesignReactNativeStrings.sm
import typings.antDesignReactNative.antDesignReactNativeStrings.xl
import typings.antDesignReactNative.antDesignReactNativeStrings.xs
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWhiteSpaceMod {
  
  @JSImport("@ant-design/react-native/lib/white-space", JSImport.Default)
  @js.native
  open class default () extends WhiteSpace
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/white-space", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/white-space", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WhiteSpace extends Component[WhiteSpaceProps, Any, Any]
  
  trait WhiteSpaceProps extends StObject {
    
    var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object WhiteSpaceProps {
    
    inline def apply(): WhiteSpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiteSpaceProps]
    }
    
    extension [Self <: WhiteSpaceProps](x: Self) {
      
      inline def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
