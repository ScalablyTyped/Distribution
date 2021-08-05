package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridColMod extends Shortcut {
  
  @JSImport("antd/lib/grid/col", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ColProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait ColProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var flex: js.UndefOr[FlexType] = js.undefined
    
    var lg: js.UndefOr[ColSpanType | ColSize] = js.undefined
    
    var md: js.UndefOr[ColSpanType | ColSize] = js.undefined
    
    var offset: js.UndefOr[ColSpanType] = js.undefined
    
    var order: js.UndefOr[ColSpanType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var pull: js.UndefOr[ColSpanType] = js.undefined
    
    var push: js.UndefOr[ColSpanType] = js.undefined
    
    var sm: js.UndefOr[ColSpanType | ColSize] = js.undefined
    
    var span: js.UndefOr[ColSpanType] = js.undefined
    
    var xl: js.UndefOr[ColSpanType | ColSize] = js.undefined
    
    var xs: js.UndefOr[ColSpanType | ColSize] = js.undefined
    
    var xxl: js.UndefOr[ColSpanType | ColSize] = js.undefined
  }
  object ColProps {
    
    inline def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    extension [Self <: ColProps](x: Self) {
      
      inline def setFlex(value: FlexType): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setLg(value: ColSpanType | ColSize): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: ColSpanType | ColSize): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setOffset(value: ColSpanType): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: ColSpanType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPull(value: ColSpanType): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      inline def setPush(value: ColSpanType): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setSm(value: ColSpanType | ColSize): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setSpan(value: ColSpanType): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setXl(value: ColSpanType | ColSize): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: ColSpanType | ColSize): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: ColSpanType | ColSize): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  trait ColSize extends StObject {
    
    var flex: js.UndefOr[FlexType] = js.undefined
    
    var offset: js.UndefOr[ColSpanType] = js.undefined
    
    var order: js.UndefOr[ColSpanType] = js.undefined
    
    var pull: js.UndefOr[ColSpanType] = js.undefined
    
    var push: js.UndefOr[ColSpanType] = js.undefined
    
    var span: js.UndefOr[ColSpanType] = js.undefined
  }
  object ColSize {
    
    inline def apply(): ColSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColSize]
    }
    
    extension [Self <: ColSize](x: Self) {
      
      inline def setFlex(value: FlexType): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setOffset(value: ColSpanType): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: ColSpanType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPull(value: ColSpanType): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      inline def setPush(value: ColSpanType): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setSpan(value: ColSpanType): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    }
  }
  
  type ColSpanType = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.antd.antdStrings.none
    - typings.antd.antdStrings.auto
    - java.lang.String
  */
  type FlexType = _FlexType | Double | String
  
  trait _FlexType extends StObject
  
  type _To = ForwardRefExoticComponent[ColProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `gridColMod.foo` */
  override def _to: ForwardRefExoticComponent[ColProps & RefAttributes[HTMLDivElement]] = default
}
