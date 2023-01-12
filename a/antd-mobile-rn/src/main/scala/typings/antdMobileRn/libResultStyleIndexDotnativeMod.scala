package typings.antdMobileRn

import typings.antdMobileRn.anon.BackgroundColorBorderBottomColor
import typings.antdMobileRn.anon.ColorStringFontSizeNumber
import typings.antdMobileRn.anon.FlexDirectionMarginTopPaddingHorizontal
import typings.antdMobileRn.anon.FlexNumber
import typings.antdMobileRn.anon.HeightWidth
import typings.antdMobileRn.anon.Margin
import typings.antdMobileRn.anon.MarginTopPaddingHorizontal
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultStyleIndexDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.button")
    @js.native
    def button: FlexNumber = js.native
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.buttonWrap")
    @js.native
    def buttonWrap: FlexDirectionMarginTopPaddingHorizontal = js.native
    inline def buttonWrap_=(x: FlexDirectionMarginTopPaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buttonWrap")(x.asInstanceOf[js.Any])
    
    inline def button_=(x: FlexNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("button")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.img")
    @js.native
    def img: HeightWidth = js.native
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.imgWrap")
    @js.native
    def imgWrap: Margin = js.native
    inline def imgWrap_=(x: Margin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imgWrap")(x.asInstanceOf[js.Any])
    
    inline def img_=(x: HeightWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("img")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.message")
    @js.native
    def message: MarginTopPaddingHorizontal = js.native
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.messageText")
    @js.native
    def messageText: ColorStringFontSizeNumber = js.native
    inline def messageText_=(x: ColorStringFontSizeNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageText")(x.asInstanceOf[js.Any])
    
    inline def message_=(x: MarginTopPaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.result")
    @js.native
    def result: BackgroundColorBorderBottomColor = js.native
    inline def result_=(x: BackgroundColorBorderBottomColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("result")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.title")
    @js.native
    def title: MarginTopPaddingHorizontal = js.native
    
    @JSImport("antd-mobile-rn/lib/result/style/index.native", "default.titleText")
    @js.native
    def titleText: ColorStringFontSizeNumber = js.native
    inline def titleText_=(x: ColorStringFontSizeNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleText")(x.asInstanceOf[js.Any])
    
    inline def title_=(x: MarginTopPaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  trait IResultStyle extends StObject {
    
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
  object IResultStyle {
    
    inline def apply(
      button: ViewStyle,
      buttonWrap: ViewStyle,
      img: ImageStyle,
      imgWrap: ViewStyle,
      message: ViewStyle,
      messageText: TextStyle,
      result: ViewStyle,
      title: ViewStyle,
      titleText: TextStyle
    ): IResultStyle = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonWrap = buttonWrap.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], imgWrap = imgWrap.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResultStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResultStyle] (val x: Self) extends AnyVal {
      
      inline def setButton(value: ViewStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonWrap(value: ViewStyle): Self = StObject.set(x, "buttonWrap", value.asInstanceOf[js.Any])
      
      inline def setImg(value: ImageStyle): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgWrap(value: ViewStyle): Self = StObject.set(x, "imgWrap", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: ViewStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageText(value: TextStyle): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
      
      inline def setResult(value: ViewStyle): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ViewStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleText(value: TextStyle): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    }
  }
}
