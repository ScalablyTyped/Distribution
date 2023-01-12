package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridStyleMod {
  
  @JSImport("@ant-design/react-native/lib/grid/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): GridStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[GridStyle]
  
  trait GridStyle extends StObject {
    
    var grayBorderBox: ViewStyle
    
    var icon: ImageStyle
    
    var text: TextStyle
  }
  object GridStyle {
    
    inline def apply(grayBorderBox: ViewStyle, icon: ImageStyle, text: TextStyle): GridStyle = {
      val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridStyle] (val x: Self) extends AnyVal {
      
      inline def setGrayBorderBox(value: ViewStyle): Self = StObject.set(x, "grayBorderBox", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: ImageStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
