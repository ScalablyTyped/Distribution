package typings.antdMobileRn

import typings.antdMobileRn.anon.BorderStyle
import typings.antdMobileRn.anon.FlexDirectionString
import typings.antdMobileRn.anon.Height
import typings.antdMobileRn.anon.Overflow
import typings.antdMobileRn.anon.Position
import typings.antdMobileRn.anon.TextAlign
import typings.antdMobileRn.anon.Top
import typings.antdMobileRn.anon.Width
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.dot")
    @js.native
    def dot: Height = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.dotSizelarge")
    @js.native
    def dotSizelarge: Width = js.native
    inline def dotSizelarge_=(x: Width): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotSizelarge")(x.asInstanceOf[js.Any])
    
    inline def dot_=(x: Height): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.text")
    @js.native
    def text: TextAlign = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textCorner")
    @js.native
    def textCorner: Position = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textCornerWrap")
    @js.native
    def textCornerWrap: Overflow = js.native
    inline def textCornerWrap_=(x: Overflow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textCornerWrap")(x.asInstanceOf[js.Any])
    
    inline def textCorner_=(x: Position): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textCorner")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textCornerlarge")
    @js.native
    def textCornerlarge: Top = js.native
    inline def textCornerlarge_=(x: Top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textCornerlarge")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textDom")
    @js.native
    def textDom: BorderStyle = js.native
    inline def textDom_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textDom")(x.asInstanceOf[js.Any])
    
    inline def text_=(x: TextAlign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.wrap")
    @js.native
    def wrap: FlexDirectionString = js.native
    inline def wrap_=(x: FlexDirectionString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrap")(x.asInstanceOf[js.Any])
  }
  
  trait IBadgeStyle extends StObject {
    
    var dot: ViewStyle
    
    var dotSizelarge: ViewStyle
    
    var text: TextStyle
    
    var textCorner: ViewStyle
    
    var textCornerWrap: ViewStyle
    
    var textCornerlarge: ViewStyle
    
    var textDom: ViewStyle
    
    var wrap: ViewStyle
  }
  object IBadgeStyle {
    
    inline def apply(
      dot: ViewStyle,
      dotSizelarge: ViewStyle,
      text: TextStyle,
      textCorner: ViewStyle,
      textCornerWrap: ViewStyle,
      textCornerlarge: ViewStyle,
      textDom: ViewStyle,
      wrap: ViewStyle
    ): IBadgeStyle = {
      val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBadgeStyle]
    }
    
    extension [Self <: IBadgeStyle](x: Self) {
      
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
