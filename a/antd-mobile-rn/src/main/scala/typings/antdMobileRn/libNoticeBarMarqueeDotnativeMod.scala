package typings.antdMobileRn

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoticeBarMarqueeDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", JSImport.Default)
  @js.native
  open class default protected () extends Marquee {
    def this(props: MarqueeProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", "default.defaultProps.fps")
      @js.native
      def fps: Double = js.native
      inline def fps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fps")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", "default.defaultProps.leading")
      @js.native
      def leading: Double = js.native
      inline def leading_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leading")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", "default.defaultProps.loop")
      @js.native
      def loop: Boolean = js.native
      inline def loop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loop")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", "default.defaultProps.maxWidth")
      @js.native
      def maxWidth: Double = js.native
      inline def maxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", "default.defaultProps.text")
      @js.native
      def text: String = js.native
      inline def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", "default.defaultProps.trailing")
      @js.native
      def trailing: Double = js.native
      inline def trailing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trailing")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Marquee extends PureComponent[MarqueeProps, Any, Any] {
    
    def moveToHeader(): Unit = js.native
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
    
    def onLayoutContainer(e: LayoutChangeEvent): Unit = js.native
    
    def startMove(): Unit = js.native
    
    var texts: Any = js.native
    
    def tryStart(): Unit = js.native
    
    var twidth: Double = js.native
    
    var width: Double = js.native
  }
  
  trait MarqueeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var fps: js.UndefOr[Double] = js.undefined
    
    var leading: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var text: ReactNode
    
    var trailing: js.UndefOr[Double] = js.undefined
  }
  object MarqueeProps {
    
    inline def apply(): MarqueeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarqueeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarqueeProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTrailing(value: Double): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
