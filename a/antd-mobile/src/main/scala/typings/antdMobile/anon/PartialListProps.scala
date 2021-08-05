package typings.antdMobile.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd-mobile.antd-mobile/lib/list.ListProps> */
trait PartialListProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var renderFooter: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.undefined
  
  var renderHeader: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PartialListProps {
  
  inline def apply(): PartialListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListProps]
  }
  
  extension [Self <: PartialListProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setRenderFooter(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    inline def setRenderFooterFunction0(value: () => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    inline def setRenderHeader(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
    
    inline def setRenderHeaderFunction0(value: () => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
    
    inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
