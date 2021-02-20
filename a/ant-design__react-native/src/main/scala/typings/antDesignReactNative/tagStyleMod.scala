package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagStyleMod {
  
  @JSImport("@ant-design/react-native/lib/tag/style", JSImport.Default)
  @js.native
  def default(theme: Theme): TagStyle = js.native
  
  @js.native
  trait TagStyle extends StObject {
    
    var activeText: TextStyle = js.native
    
    var activeWrap: ViewStyle = js.native
    
    var close: ViewStyle = js.native
    
    var closeAndroid: ViewStyle = js.native
    
    var closeIOS: ViewStyle = js.native
    
    var closeText: TextStyle = js.native
    
    var closeTransform: ViewStyle = js.native
    
    var disabledText: TextStyle = js.native
    
    var disabledWrap: ViewStyle = js.native
    
    var normalText: TextStyle = js.native
    
    var normalWrap: ViewStyle = js.native
    
    var tag: ViewStyle = js.native
    
    var text: TextStyle = js.native
    
    var textSmall: TextStyle = js.native
    
    var wrap: ViewStyle = js.native
    
    var wrapSmall: ViewStyle = js.native
  }
  object TagStyle {
    
    @scala.inline
    def apply(
      activeText: TextStyle,
      activeWrap: ViewStyle,
      close: ViewStyle,
      closeAndroid: ViewStyle,
      closeIOS: ViewStyle,
      closeText: TextStyle,
      closeTransform: ViewStyle,
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
      val __obj = js.Dynamic.literal(activeText = activeText.asInstanceOf[js.Any], activeWrap = activeWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeAndroid = closeAndroid.asInstanceOf[js.Any], closeIOS = closeIOS.asInstanceOf[js.Any], closeText = closeText.asInstanceOf[js.Any], closeTransform = closeTransform.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], disabledWrap = disabledWrap.asInstanceOf[js.Any], normalText = normalText.asInstanceOf[js.Any], normalWrap = normalWrap.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textSmall = textSmall.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapSmall = wrapSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagStyle]
    }
    
    @scala.inline
    implicit class TagStyleMutableBuilder[Self <: TagStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveText(value: TextStyle): Self = StObject.set(x, "activeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveWrap(value: ViewStyle): Self = StObject.set(x, "activeWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: ViewStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAndroid(value: ViewStyle): Self = StObject.set(x, "closeAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIOS(value: ViewStyle): Self = StObject.set(x, "closeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseText(value: TextStyle): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTransform(value: ViewStyle): Self = StObject.set(x, "closeTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledText(value: TextStyle): Self = StObject.set(x, "disabledText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledWrap(value: ViewStyle): Self = StObject.set(x, "disabledWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalText(value: TextStyle): Self = StObject.set(x, "normalText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalWrap(value: ViewStyle): Self = StObject.set(x, "normalWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: ViewStyle): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSmall(value: TextStyle): Self = StObject.set(x, "textSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapSmall(value: ViewStyle): Self = StObject.set(x, "wrapSmall", value.asInstanceOf[js.Any])
    }
  }
}
