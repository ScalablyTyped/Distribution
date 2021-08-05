package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeStyleMod {
  
  @JSImport("@ant-design/react-native/lib/badge/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): BadgeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[BadgeStyle]
  
  trait BadgeStyle extends StObject {
    
    var dot: ViewStyle
    
    var dotSizelarge: ViewStyle
    
    var text: TextStyle
    
    var textCorner: ViewStyle
    
    var textCornerWrap: ViewStyle
    
    var textCornerlarge: ViewStyle
    
    var textDom: ViewStyle
    
    var wrap: ViewStyle
  }
  object BadgeStyle {
    
    inline def apply(
      dot: ViewStyle,
      dotSizelarge: ViewStyle,
      text: TextStyle,
      textCorner: ViewStyle,
      textCornerWrap: ViewStyle,
      textCornerlarge: ViewStyle,
      textDom: ViewStyle,
      wrap: ViewStyle
    ): BadgeStyle = {
      val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeStyle]
    }
    
    extension [Self <: BadgeStyle](x: Self) {
      
      inline def setDot(value: ViewStyle): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotSizelarge(value: ViewStyle): Self = StObject.set(x, "dotSizelarge", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextCorner(value: ViewStyle): Self = StObject.set(x, "textCorner", value.asInstanceOf[js.Any])
      
      inline def setTextCornerWrap(value: ViewStyle): Self = StObject.set(x, "textCornerWrap", value.asInstanceOf[js.Any])
      
      inline def setTextCornerlarge(value: ViewStyle): Self = StObject.set(x, "textCornerlarge", value.asInstanceOf[js.Any])
      
      inline def setTextDom(value: ViewStyle): Self = StObject.set(x, "textDom", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
