package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDescriptionsItemMod extends Shortcut {
  
  @JSImport("antd/lib/descriptions/Item", JSImport.Default)
  @js.native
  val default: FC[DescriptionsItemProps] = js.native
  
  trait DescriptionsItemProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var span: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object DescriptionsItemProps {
    
    inline def apply(): DescriptionsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionsItemProps]
    }
    
    extension [Self <: DescriptionsItemProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[DescriptionsItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `libDescriptionsItemMod.foo` */
  override def _to: FC[DescriptionsItemProps] = default
}
