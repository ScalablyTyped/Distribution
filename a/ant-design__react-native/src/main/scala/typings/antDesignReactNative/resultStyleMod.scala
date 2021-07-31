package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultStyleMod {
  
  @JSImport("@ant-design/react-native/lib/result/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): ResultStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[ResultStyle]
  
  trait ResultStyle extends StObject {
    
    var button: ViewStyle
    
    var buttonWrap: ViewStyle
    
    var img: ImageStyle
    
    var imgWrap: ViewStyle
    
    var message: ViewStyle
    
    var messageText: TextStyle
    
    var result: ViewStyle
    
    var title: ViewStyle
    
    var titleText: TextStyle
  }
  object ResultStyle {
    
    @scala.inline
    def apply(
      button: ViewStyle,
      buttonWrap: ViewStyle,
      img: ImageStyle,
      imgWrap: ViewStyle,
      message: ViewStyle,
      messageText: TextStyle,
      result: ViewStyle,
      title: ViewStyle,
      titleText: TextStyle
    ): ResultStyle = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonWrap = buttonWrap.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], imgWrap = imgWrap.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultStyle]
    }
    
    @scala.inline
    implicit class ResultStyleMutableBuilder[Self <: ResultStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: ViewStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWrap(value: ViewStyle): Self = StObject.set(x, "buttonWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImg(value: ImageStyle): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgWrap(value: ViewStyle): Self = StObject.set(x, "imgWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: ViewStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageText(value: TextStyle): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: ViewStyle): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ViewStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleText(value: TextStyle): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    }
  }
}
