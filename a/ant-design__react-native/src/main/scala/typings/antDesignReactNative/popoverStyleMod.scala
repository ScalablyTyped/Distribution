package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverStyleMod {
  
  @JSImport("@ant-design/react-native/lib/popover/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): PopoverStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[PopoverStyle]
  
  trait PopoverStyle extends StObject {
    
    var arrow: ViewStyle
    
    var background: ViewStyle
    
    var content: ViewStyle
  }
  object PopoverStyle {
    
    @scala.inline
    def apply(arrow: ViewStyle, background: ViewStyle, content: ViewStyle): PopoverStyle = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverStyle]
    }
    
    @scala.inline
    implicit class PopoverStyleMutableBuilder[Self <: PopoverStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(value: ViewStyle): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackground(value: ViewStyle): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
