package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.resultPropsTypeMod.ResultPropsType
import typings.antDesignReactNative.resultStyleMod.ResultStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod {
  
  @JSImport("@ant-design/react-native/lib/result", JSImport.Default)
  @js.native
  class default () extends Result
  
  @js.native
  trait Result
    extends Component[ResultNativeProps, js.Any, js.Any]
  
  @js.native
  trait ResultNativeProps
    extends ResultPropsType
       with WithThemeStyles[ResultStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object ResultNativeProps {
    
    @scala.inline
    def apply(): ResultNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultNativeProps]
    }
    
    @scala.inline
    implicit class ResultNativePropsMutableBuilder[Self <: ResultNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
