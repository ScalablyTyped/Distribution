package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagStyleMod {
  
  @JSImport("@ant-design/react-native/lib/tag/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): TagStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[TagStyle]
  
  trait TagStyle extends StObject {
    
    var activeText: TextStyle
    
    var activeWrap: ViewStyle
    
    var close: ViewStyle
    
    var disabledText: TextStyle
    
    var disabledWrap: ViewStyle
    
    var normalText: TextStyle
    
    var normalWrap: ViewStyle
    
    var tag: ViewStyle
    
    var text: TextStyle
    
    var textSmall: TextStyle
    
    var wrap: ViewStyle
    
    var wrapSmall: ViewStyle
  }
  object TagStyle {
    
    inline def apply(
      activeText: TextStyle,
      activeWrap: ViewStyle,
      close: ViewStyle,
      disabledText: TextStyle,
      disabledWrap: ViewStyle,
      normalText: TextStyle,
      normalWrap: ViewStyle,
      tag: ViewStyle,
      text: TextStyle,
      textSmall: TextStyle,
      wrap: ViewStyle,
      wrapSmall: ViewStyle
    ): TagStyle = {
      val __obj = js.Dynamic.literal(activeText = activeText.asInstanceOf[js.Any], activeWrap = activeWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], disabledWrap = disabledWrap.asInstanceOf[js.Any], normalText = normalText.asInstanceOf[js.Any], normalWrap = normalWrap.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textSmall = textSmall.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapSmall = wrapSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagStyle] (val x: Self) extends AnyVal {
      
      inline def setActiveText(value: TextStyle): Self = StObject.set(x, "activeText", value.asInstanceOf[js.Any])
      
      inline def setActiveWrap(value: ViewStyle): Self = StObject.set(x, "activeWrap", value.asInstanceOf[js.Any])
      
      inline def setClose(value: ViewStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setDisabledText(value: TextStyle): Self = StObject.set(x, "disabledText", value.asInstanceOf[js.Any])
      
      inline def setDisabledWrap(value: ViewStyle): Self = StObject.set(x, "disabledWrap", value.asInstanceOf[js.Any])
      
      inline def setNormalText(value: TextStyle): Self = StObject.set(x, "normalText", value.asInstanceOf[js.Any])
      
      inline def setNormalWrap(value: ViewStyle): Self = StObject.set(x, "normalWrap", value.asInstanceOf[js.Any])
      
      inline def setTag(value: ViewStyle): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextSmall(value: TextStyle): Self = StObject.set(x, "textSmall", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapSmall(value: ViewStyle): Self = StObject.set(x, "wrapSmall", value.asInstanceOf[js.Any])
    }
  }
}
