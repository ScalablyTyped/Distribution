package typings.antDesignProLayout

import typings.antDesignProLayout.anon.FooterToolbarPropsRouteCo
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFooterToolbarMod {
  
  @JSImport("@ant-design/pro-layout/es/components/FooterToolbar", "FooterToolbar")
  @js.native
  val FooterToolbar: FC[FooterToolbarProps] = js.native
  
  trait FooterToolbarProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderContent: js.UndefOr[
        js.Function2[/* props */ FooterToolbarPropsRouteCo, /* dom */ Element, ReactNode]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FooterToolbarProps {
    
    inline def apply(): FooterToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterToolbarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FooterToolbarProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderContent(value: (/* props */ FooterToolbarPropsRouteCo, /* dom */ Element) => ReactNode): Self = StObject.set(x, "renderContent", js.Any.fromFunction2(value))
      
      inline def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
