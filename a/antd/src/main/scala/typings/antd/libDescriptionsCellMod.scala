package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDescriptionsCellMod extends Shortcut {
  
  @JSImport("antd/lib/descriptions/Cell", JSImport.Default)
  @js.native
  val default: FC[CellProps] = js.native
  
  trait CellProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colon: js.UndefOr[Boolean] = js.undefined
    
    var component: String
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var itemPrefixCls: String
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var span: Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CellProps {
    
    inline def apply(component: String, itemPrefixCls: String, span: Double): CellProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], itemPrefixCls = itemPrefixCls.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setItemPrefixCls(value: String): Self = StObject.set(x, "itemPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[CellProps]
  
  /* This means you don't have to write `default`, but can instead just say `libDescriptionsCellMod.foo` */
  override def _to: FC[CellProps] = default
}
