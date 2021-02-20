package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeStyleMod {
  
  @JSImport("@ant-design/react-native/lib/badge/style", JSImport.Default)
  @js.native
  def default(theme: Theme): BadgeStyle = js.native
  
  @js.native
  trait BadgeStyle extends StObject {
    
    var dot: ViewStyle = js.native
    
    var dotSizelarge: ViewStyle = js.native
    
    var text: TextStyle = js.native
    
    var textCorner: ViewStyle = js.native
    
    var textCornerWrap: ViewStyle = js.native
    
    var textCornerlarge: ViewStyle = js.native
    
    var textDom: ViewStyle = js.native
    
    var wrap: ViewStyle = js.native
  }
  object BadgeStyle {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BadgeStyleMutableBuilder[Self <: BadgeStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDot(value: ViewStyle): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSizelarge(value: ViewStyle): Self = StObject.set(x, "dotSizelarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCorner(value: ViewStyle): Self = StObject.set(x, "textCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCornerWrap(value: ViewStyle): Self = StObject.set(x, "textCornerWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCornerlarge(value: ViewStyle): Self = StObject.set(x, "textCornerlarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDom(value: ViewStyle): Self = StObject.set(x, "textDom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
