package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.alternate
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import typings.antd.timelineItemMod.TimelineItemProps
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineTimelineMod extends Shortcut {
  
  @JSImport("antd/lib/timeline/Timeline", JSImport.Default)
  @js.native
  val default: TimelineType = js.native
  
  trait TimelineProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[left | alternate | right] = js.undefined
    
    /** 指定最后一个幽灵节点是否存在或内容 */
    var pending: js.UndefOr[ReactNode] = js.undefined
    
    var pendingDot: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TimelineProps {
    
    inline def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    extension [Self <: TimelineProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMode(value: left | alternate | right): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPending(value: ReactNode): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingDot(value: ReactNode): Self = StObject.set(x, "pendingDot", value.asInstanceOf[js.Any])
      
      inline def setPendingDotUndefined: Self = StObject.set(x, "pendingDot", js.undefined)
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TimelineType
    extends StObject
       with FunctionComponent[TimelineProps] {
    
    var Item: FC[TimelineItemProps] = js.native
  }
  
  type _To = TimelineType
  
  /* This means you don't have to write `default`, but can instead just say `timelineTimelineMod.foo` */
  override def _to: TimelineType = default
}
