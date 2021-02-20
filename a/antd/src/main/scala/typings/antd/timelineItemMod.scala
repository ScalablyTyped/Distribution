package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineItemMod extends Shortcut {
  
  @JSImport("antd/lib/timeline/TimelineItem", JSImport.Default)
  @js.native
  val default: FC[TimelineItemProps] = js.native
  
  @js.native
  trait TimeLineItemProps_ extends TimelineItemProps {
    
    var __deprecated_do_not_use_it__ : js.UndefOr[js.Any] = js.native
  }
  object TimeLineItemProps_ {
    
    @scala.inline
    def apply(): TimeLineItemProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeLineItemProps_]
    }
    
    @scala.inline
    implicit class TimeLineItemProps_MutableBuilder[Self <: TimeLineItemProps_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__deprecated_do_not_use_it__(value: js.Any): Self = StObject.set(x, "__deprecated_do_not_use_it__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__deprecated_do_not_use_it__Undefined: Self = StObject.set(x, "__deprecated_do_not_use_it__", js.undefined)
    }
  }
  
  @js.native
  trait TimelineItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var dot: js.UndefOr[ReactNode] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var pending: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineItemProps {
    
    @scala.inline
    def apply(): TimelineItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineItemProps]
    }
    
    @scala.inline
    implicit class TimelineItemPropsMutableBuilder[Self <: TimelineItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDot(value: ReactNode): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[TimelineItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `timelineItemMod.foo` */
  override def _to: FC[TimelineItemProps] = default
}
