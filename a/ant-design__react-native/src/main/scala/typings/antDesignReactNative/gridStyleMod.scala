package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridStyleMod {
  
  @JSImport("@ant-design/react-native/lib/grid/style", JSImport.Default)
  @js.native
  def default(theme: Theme): GridStyle = js.native
  
  @js.native
  trait GridStyle extends StObject {
    
    var grayBorderBox: ViewStyle = js.native
    
    var icon: ImageStyle = js.native
    
    var text: TextStyle = js.native
  }
  object GridStyle {
    
    @scala.inline
    def apply(grayBorderBox: ViewStyle, icon: ImageStyle, text: TextStyle): GridStyle = {
      val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridStyle]
    }
    
    @scala.inline
    implicit class GridStyleMutableBuilder[Self <: GridStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrayBorderBox(value: ViewStyle): Self = StObject.set(x, "grayBorderBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: ImageStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
