package typings.antdMobileRn

import typings.antdMobileRn.anon.AlignItemsBackgroundColor
import typings.antdMobileRn.anon.ColorStringFontSizeNumber
import typings.antdMobileRn.anon.FlexMarginRight
import typings.antdMobileRn.anon.FontSizeFontWeight
import typings.antdMobileRn.anon.MarginLeftNumber
import typings.antdMobileRn.anon.MarginRight
import typings.antdMobileRn.anon.Transform
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.actionWrap")
    @js.native
    def actionWrap: MarginRight = js.native
    @scala.inline
    def actionWrap_=(x: MarginRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actionWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.close")
    @js.native
    def close: FontSizeFontWeight = js.native
    @scala.inline
    def close_=(x: FontSizeFontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.container")
    @js.native
    def container: FlexMarginRight = js.native
    @scala.inline
    def container_=(x: FlexMarginRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.content")
    @js.native
    def content: ColorStringFontSizeNumber = js.native
    @scala.inline
    def content_=(x: ColorStringFontSizeNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.left15")
    @js.native
    def left15: MarginLeftNumber = js.native
    @scala.inline
    def left15_=(x: MarginLeftNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left15")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.left6")
    @js.native
    def left6: MarginLeftNumber = js.native
    @scala.inline
    def left6_=(x: MarginLeftNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left6")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.link")
    @js.native
    def link: Transform = js.native
    @scala.inline
    def link_=(x: Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("link")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/notice-bar/style/index.native", "default.notice")
    @js.native
    def notice: AlignItemsBackgroundColor = js.native
    @scala.inline
    def notice_=(x: AlignItemsBackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notice")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait INoticeBarStyle extends StObject {
    
    var actionWrap: ViewStyle = js.native
    
    var close: TextStyle = js.native
    
    var container: ViewStyle = js.native
    
    var content: TextStyle = js.native
    
    var left15: ViewStyle = js.native
    
    var left6: ViewStyle = js.native
    
    var link: TextStyle = js.native
    
    var notice: ViewStyle = js.native
  }
  object INoticeBarStyle {
    
    @scala.inline
    def apply(
      actionWrap: ViewStyle,
      close: TextStyle,
      container: ViewStyle,
      content: TextStyle,
      left15: ViewStyle,
      left6: ViewStyle,
      link: TextStyle,
      notice: ViewStyle
    ): INoticeBarStyle = {
      val __obj = js.Dynamic.literal(actionWrap = actionWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], left15 = left15.asInstanceOf[js.Any], left6 = left6.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any])
      __obj.asInstanceOf[INoticeBarStyle]
    }
    
    @scala.inline
    implicit class INoticeBarStyleMutableBuilder[Self <: INoticeBarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionWrap(value: ViewStyle): Self = StObject.set(x, "actionWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: TextStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: TextStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft15(value: ViewStyle): Self = StObject.set(x, "left15", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft6(value: ViewStyle): Self = StObject.set(x, "left6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: TextStyle): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice(value: ViewStyle): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
    }
  }
}
