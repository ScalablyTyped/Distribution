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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whiteSpaceMod {
  
  @JSImport("@ant-design/react-native/lib/white-space", JSImport.Default)
  @js.native
  class default () extends WhiteSpace
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/white-space", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/white-space", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      @scala.inline
      def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WhiteSpace
    extends Component[WhiteSpaceProps, js.Any, js.Any]
  
  @js.native
  trait WhiteSpaceProps extends StObject {
    
    var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object WhiteSpaceProps {
    
    @scala.inline
    def apply(): WhiteSpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiteSpaceProps]
    }
    
    @scala.inline
    implicit class WhiteSpacePropsMutableBuilder[Self <: WhiteSpaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
