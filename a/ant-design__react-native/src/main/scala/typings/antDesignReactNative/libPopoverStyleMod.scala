package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverStyleMod {
  
  @JSImport("@ant-design/react-native/lib/popover/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): PopoverStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[PopoverStyle]
  
  trait PopoverStyle extends StObject {
    
    var arrow: ViewStyle
    
    var background: ViewStyle
    
    var content: ViewStyle
  }
  object PopoverStyle {
    
    inline def apply(arrow: ViewStyle, background: ViewStyle, content: ViewStyle): PopoverStyle = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverStyle]
    }
    
    extension [Self <: PopoverStyle](x: Self) {
      
      inline def setArrow(value: ViewStyle): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: ViewStyle): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
