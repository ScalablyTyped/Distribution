package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkableTagMod extends Shortcut {
  
  @JSImport("antd/lib/tag/CheckableTag", JSImport.Default)
  @js.native
  val default: FC[CheckableTagProps] = js.native
  
  trait CheckableTagProps extends StObject {
    
    /**
      * @description       it is an absolute controlled component and has no uncontrolled mode.
      * @description.zh-CN 该组件为完全受控组件，不支持非受控用法。
      */
    var checked: Boolean
    
    var className: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent], Unit]
      ] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CheckableTagProps {
    
    inline def apply(checked: Boolean): CheckableTagProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckableTagProps]
    }
    
    extension [Self <: CheckableTagProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnChange(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* e */ typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[CheckableTagProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkableTagMod.foo` */
  override def _to: FC[CheckableTagProps] = default
}
