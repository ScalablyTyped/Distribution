package typings.antDesignReactNative

import typings.antDesignReactNative.libResultPropsTypeMod.ResultPropsType
import typings.antDesignReactNative.libResultStyleMod.ResultStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultMod {
  
  @JSImport("@ant-design/react-native/lib/result", JSImport.Default)
  @js.native
  open class default () extends Result
  
  @js.native
  trait Result extends Component[ResultNativeProps, Any, Any]
  
  trait ResultNativeProps
    extends StObject
       with ResultPropsType
       with WithThemeStyles[ResultStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object ResultNativeProps {
    
    inline def apply(): ResultNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultNativeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultNativeProps] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
