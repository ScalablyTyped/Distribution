package typings.antDesignReactNative

import typings.antDesignReactNative.anon.OnPress
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.marqueeMod.MarqueeProps
import typings.antDesignReactNative.noticeBarPropsTypeMod.NoticeBarPropsType
import typings.antDesignReactNative.noticeBarStyleMod.NoticeBarStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarMod {
  
  @JSImport("@ant-design/react-native/lib/notice-bar", JSImport.Default)
  @js.native
  class default protected () extends NoticeBar {
    def this(props: NoticeNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/notice-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/notice-bar", "default.defaultProps")
    @js.native
    def defaultProps: OnPress = js.native
    @scala.inline
    def defaultProps_=(x: OnPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NoticeBar
    extends Component[NoticeNativeProps, js.Any, js.Any] {
    
    def onPress(): Unit = js.native
  }
  
  @js.native
  trait NoticeNativeProps
    extends NoticeBarPropsType
       with WithThemeStyles[NoticeBarStyle] {
    
    var marqueeProps: js.UndefOr[MarqueeProps] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
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
    }
  }
}
