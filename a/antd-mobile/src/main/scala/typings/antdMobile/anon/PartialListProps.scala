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
  
  @scala.inline
  def apply(): PartialListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListProps]
  }
  
  @scala.inline
  implicit class PartialListPropsMutableBuilder[Self <: PartialListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRenderFooter(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFooterFunction0(value: () => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHeaderFunction0(value: () => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
