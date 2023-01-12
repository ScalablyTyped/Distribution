package typings.antDesignProLayout

import typings.antDesignProLayout.anon.ActionRef
import typings.antDesignProLayout.anon.PartialRouterTypes
import typings.antDesignProLayout.anon.Token
import typings.antDesignProLayout.antDesignProLayoutStrings.collapsed
import typings.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typings.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.SiderMenuProps
import typings.antDesignProLayout.esTypingMod.MenuDataItem
import typings.react.mod.FC
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProLayoutMod {
  
  @JSImport("@ant-design/pro-layout/es/ProLayout", "ProLayout")
  @js.native
  val ProLayout: FC[ProLayoutProps] = js.native
  
  /* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/es/ProLayout.ProLayoutProps[K]} & {  breadcrumb :std.Record<string, @ant-design/pro-layout.@ant-design/pro-layout/es/typing.MenuDataItem>} */
  trait BasicLayoutContext extends StObject {
    
    var breadcrumb: Record[String, MenuDataItem]
    
    var location: js.UndefOr[Any] = js.undefined
  }
  object BasicLayoutContext {
    
    inline def apply(breadcrumb: Record[String, MenuDataItem]): BasicLayoutContext = {
      val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicLayoutContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasicLayoutContext] (val x: Self) extends AnyVal {
      
      inline def setBreadcrumb(value: Record[String, MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  type GlobalTypes = Omit[PartialRouterTypes & SiderMenuProps & HeaderViewProps & Token, collapsed]
  
  trait LayoutBreadcrumbProps extends StObject {
    
    var minLength: js.UndefOr[Double] = js.undefined
  }
  object LayoutBreadcrumbProps {
    
    inline def apply(): LayoutBreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutBreadcrumbProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutBreadcrumbProps] (val x: Self) extends AnyVal {
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    }
  }
  
  type ProLayoutProps = GlobalTypes & ActionRef
}
