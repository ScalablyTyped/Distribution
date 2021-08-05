package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.lg
import typings.antDesignReactNative.antDesignReactNativeStrings.md
import typings.antDesignReactNative.antDesignReactNativeStrings.sm
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wingBlankMod {
  
  @JSImport("@ant-design/react-native/lib/wing-blank", JSImport.Default)
  @js.native
  class default () extends WingBlank
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/wing-blank", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/wing-blank", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WingBlank
    extends Component[WingBlankProps, js.Any, js.Any]
  
  trait WingBlankProps extends StObject {
    
    var size: js.UndefOr[sm | md | lg] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object WingBlankProps {
    
    inline def apply(): WingBlankProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankProps]
    }
    
    extension [Self <: WingBlankProps](x: Self) {
      
      inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
