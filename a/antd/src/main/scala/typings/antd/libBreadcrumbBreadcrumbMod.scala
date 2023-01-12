package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.OmitRoutechildren
import typings.antd.libBreadcrumbBreadcrumbItemMod.BreadcrumbItemInterface
import typings.antd.libBreadcrumbBreadcrumbSeparatorMod.BreadcrumbSeparatorInterface
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBreadcrumbBreadcrumbMod extends Shortcut {
  
  @JSImport("antd/lib/breadcrumb/Breadcrumb", JSImport.Default)
  @js.native
  val default: BreadcrumbInterface = js.native
  
  @js.native
  trait BreadcrumbInterface
    extends StObject
       with FunctionComponent[BreadcrumbProps] {
    
    var Item: BreadcrumbItemInterface = js.native
    
    var Separator: BreadcrumbSeparatorInterface = js.native
  }
  
  trait BreadcrumbProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var itemRender: js.UndefOr[
        js.Function4[
          /* route */ Route, 
          /* params */ Any, 
          /* routes */ js.Array[Route], 
          /* paths */ js.Array[String], 
          ReactNode
        ]
      ] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var routes: js.UndefOr[js.Array[Route]] = js.undefined
    
    var separator: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setItemRender(
        value: (/* route */ Route, /* params */ Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setSeparator(value: ReactNode): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Route extends StObject {
    
    var breadcrumbName: String
    
    var children: js.UndefOr[js.Array[OmitRoutechildren]] = js.undefined
    
    var path: String
  }
  object Route {
    
    inline def apply(breadcrumbName: String, path: String): Route = {
      val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      inline def setBreadcrumbName(value: String): Self = StObject.set(x, "breadcrumbName", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[OmitRoutechildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: OmitRoutechildren*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = BreadcrumbInterface
  
  /* This means you don't have to write `default`, but can instead just say `libBreadcrumbBreadcrumbMod.foo` */
  override def _to: BreadcrumbInterface = default
}
