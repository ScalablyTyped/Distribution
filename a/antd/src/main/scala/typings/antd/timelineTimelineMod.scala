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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineTimelineMod extends Shortcut {
  
  @JSImport("antd/lib/timeline/Timeline", JSImport.Default)
  @js.native
  val default: TimelineType = js.native
  
  @js.native
  trait TimelineProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[left | alternate | right] = js.native
    
    /** 指定最后一个幽灵节点是否存在或内容 */
    var pending: js.UndefOr[ReactNode] = js.native
    
    var pendingDot: js.UndefOr[ReactNode] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineProps {
    
    @scala.inline
    def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    @scala.inline
    implicit class TimelinePropsMutableBuilder[Self <: TimelineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMode(value: left | alternate | right): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPending(value: ReactNode): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingDot(value: ReactNode): Self = StObject.set(x, "pendingDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingDotUndefined: Self = StObject.set(x, "pendingDot", js.undefined)
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TimelineType extends FunctionComponent[TimelineProps] {
    
    var Item: FC[TimelineItemProps] = js.native
  }
  
  type _To = TimelineType
  
  /* This means you don't have to write `default`, but can instead just say `timelineTimelineMod.foo` */
  override def _to: TimelineType = default
}
