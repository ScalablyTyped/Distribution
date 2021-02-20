package typings.antdMobile

import typings.antdMobile.anon.AnimatedWidth
import typings.antdMobile.anon.Fps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marqueeMod {
  
  @JSImport("antd-mobile/lib/notice-bar/Marquee", JSImport.Default)
  @js.native
  class default () extends Marquee
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/notice-bar/Marquee", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/notice-bar/Marquee", "default.defaultProps")
    @js.native
    def defaultProps: Fps = js.native
    @scala.inline
    def defaultProps_=(x: Fps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Marquee
    extends Component[MarqueeProps, js.Any, js.Any] {
    
    var _marqueeTimer: js.Any = js.native
    
    def _measureText(): Unit = js.native
    
    def _startAnimation(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MMarquee(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMarquee(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MMarquee(): Unit = js.native
    
    @JSName("state")
    var state_Marquee: AnimatedWidth = js.native
    
    var textRef: js.Any = js.native
  }
  
  @js.native
  trait MarqueeProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var fps: js.UndefOr[Double] = js.native
    
    var leading: js.UndefOr[Double] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var trailing: js.UndefOr[Double] = js.native
  }
  object MarqueeProps {
    
    @scala.inline
    def apply(): MarqueeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarqueeProps]
    }
    
    @scala.inline
    implicit class MarqueePropsMutableBuilder[Self <: MarqueeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      @scala.inline
      def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTrailing(value: Double): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
