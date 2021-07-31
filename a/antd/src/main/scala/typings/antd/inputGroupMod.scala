package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupMod extends Shortcut {
  
  @JSImport("antd/lib/input/Group", JSImport.Default)
  @js.native
  val default: FC[GroupProps] = js.native
  
  trait GroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[large | small | typings.antd.antdStrings.default] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GroupProps {
    
    @scala.inline
    def apply(): GroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupProps]
    }
    
    @scala.inline
    implicit class GroupPropsMutableBuilder[Self <: GroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSize(value: large | small | typings.antd.antdStrings.default): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[GroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `inputGroupMod.foo` */
  override def _to: FC[GroupProps] = default
}
