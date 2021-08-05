package typings.antdMobile

import typings.antdMobile.anon.Icon
import typings.antdMobile.marqueeMod.MarqueeProps
import typings.antdMobile.noticeBarPropsTypeMod.NoticeBarPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarMod {
  
  @JSImport("antd-mobile/lib/notice-bar", JSImport.Default)
  @js.native
  class default protected () extends NoticeBar {
    def this(props: NoticeWebProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/notice-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/notice-bar", "default.defaultProps")
    @js.native
    def defaultProps: Icon = js.native
    inline def defaultProps_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NoticeBar
    extends Component[NoticeWebProps, js.Any, js.Any] {
    
    def onClick(): Unit = js.native
  }
  
  trait NoticeWebProps
    extends StObject
       with NoticeBarPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object NoticeWebProps {
    
    inline def apply(): NoticeWebProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeWebProps]
    }
    
    extension [Self <: NoticeWebProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMarqueeProps(value: MarqueeProps): Self = StObject.set(x, "marqueeProps", value.asInstanceOf[js.Any])
      
      inline def setMarqueePropsUndefined: Self = StObject.set(x, "marqueeProps", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
