package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.OmitRoutechildren
import typings.antd.breadcrumbItemMod.BreadcrumbItemInterface
import typings.antd.breadcrumbSeparatorMod.BreadcrumbSeparatorInterface
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbBreadcrumbMod extends Shortcut {
  
  @JSImport("antd/lib/breadcrumb/Breadcrumb", JSImport.Default)
  @js.native
  val default: BreadcrumbInterface = js.native
  
  @js.native
  trait BreadcrumbInterface extends FunctionComponent[BreadcrumbProps] {
    
    var Item: BreadcrumbItemInterface = js.native
    
    var Separator: BreadcrumbSeparatorInterface = js.native
  }
  
  @js.native
  trait BreadcrumbProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var itemRender: js.UndefOr[
        js.Function4[
          /* route */ Route, 
          /* params */ js.Any, 
          /* routes */ js.Array[Route], 
          /* paths */ js.Array[String], 
          ReactNode
        ]
      ] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var routes: js.UndefOr[js.Array[Route]] = js.native
    
    var separator: js.UndefOr[ReactNode] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object BreadcrumbProps {
    
    @scala.inline
    def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit class BreadcrumbPropsMutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setSeparator(value: ReactNode): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Route extends StObject {
    
    var breadcrumbName: String = js.native
    
    var children: js.UndefOr[js.Array[OmitRoutechildren]] = js.native
    
    var path: String = js.native
  }
  object Route {
    
    @scala.inline
    def apply(breadcrumbName: String, path: String): Route = {
      val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbName(value: String): Self = StObject.set(x, "breadcrumbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[OmitRoutechildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: OmitRoutechildren*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = BreadcrumbInterface
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbBreadcrumbMod.foo` */
  override def _to: BreadcrumbInterface = default
}
