package typings.antdMobileRn

import typings.antdMobileRn.anon.Icon
import typings.antdMobileRn.marqueeNativeMod.MarqueeProps
import typings.antdMobileRn.noticeBarPropsTypeMod.NoticeBarPropsType
import typings.antdMobileRn.noticeBarStyleIndexNativeMod.INoticeBarStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/notice-bar/index.native", JSImport.Default)
  @js.native
  class default protected () extends NoticeBar {
    def this(props: NoticeNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/notice-bar/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/notice-bar/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Icon = js.native
    @scala.inline
    def defaultProps_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NoticeBar
    extends Component[NoticeNativeProps, js.Any, js.Any] {
    
    def onClick(): Unit = js.native
  }
  
  trait NoticeNativeProps
    extends StObject
       with NoticeBarPropsType {
    
    var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[INoticeBarStyle] = js.undefined
  }
  object NoticeNativeProps {
    
    @scala.inline
    def apply(): NoticeNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeNativeProps]
    }
    
    @scala.inline
    implicit class NoticeNativePropsMutableBuilder[Self <: NoticeNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarqueeProps(value: MarqueeProps): Self = StObject.set(x, "marqueeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarqueePropsUndefined: Self = StObject.set(x, "marqueeProps", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: INoticeBarStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
