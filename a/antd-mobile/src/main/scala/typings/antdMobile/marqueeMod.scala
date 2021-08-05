package typings.antdMobile

import typings.antdMobile.anon.AnimatedWidth
import typings.antdMobile.anon.Fps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def defaultProps_=(x: Fps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Marquee
    extends Component[MarqueeProps, js.Any, js.Any] {
    
    /* private */ var _marqueeTimer: js.Any = js.native
    
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
  
  trait MarqueeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var fps: js.UndefOr[Double] = js.undefined
    
    var leading: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var trailing: js.UndefOr[Double] = js.undefined
  }
  object MarqueeProps {
    
    inline def apply(): MarqueeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarqueeProps]
    }
    
    extension [Self <: MarqueeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTrailing(value: Double): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
