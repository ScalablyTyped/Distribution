package typings.antDesignProLayout

import typings.antDesignProLayout.anon.BreadcrumbMap
import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.anon.Href
import typings.antDesignProLayout.anon.Pathname
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antd.breadcrumbBreadcrumbMod.Route
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ReactNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBreadcrumbPropsMod {
  
  @JSImport("@ant-design/pro-layout/lib/utils/getBreadcrumbProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def genBreadcrumbProps(props: BreadcrumbProps): js.UndefOr[js.Array[Route]] = ^.asInstanceOf[js.Dynamic].applyDynamic("genBreadcrumbProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Route]]]
  
  inline def getBreadcrumb(breadcrumbMap: Map[String, MenuDataItem], url: String): MenuDataItem = (^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumb")(breadcrumbMap.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[MenuDataItem]
  
  inline def getBreadcrumbFromProps(props: BreadcrumbProps): BreadcrumbMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[BreadcrumbMap]
  
  inline def getBreadcrumbProps(props: BreadcrumbProps): BreadcrumbListReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbProps")(props.asInstanceOf[js.Any]).asInstanceOf[BreadcrumbListReturn]
  
  /* Inlined std.Pick<antd.antd/lib/breadcrumb.BreadcrumbProps, std.Extract<keyof antd.antd/lib/breadcrumb.BreadcrumbProps, 'routes' | 'itemRender'>> */
  trait BreadcrumbListReturn extends StObject {
    
    var itemRender: js.UndefOr[
        js.Function4[
          /* route */ Route, 
          /* params */ js.Any, 
          /* routes */ js.Array[Route], 
          /* paths */ js.Array[String], 
          ReactNode
        ]
      ] = js.undefined
    
    var routes: js.UndefOr[js.Array[Route]] = js.undefined
  }
  object BreadcrumbListReturn {
    
    inline def apply(): BreadcrumbListReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbListReturn]
    }
    
    extension [Self <: BreadcrumbListReturn](x: Self) {
      
      inline def setItemRender(
        value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  trait BreadcrumbProps extends StObject {
    
    var breadcrumbList: js.UndefOr[js.Array[Href]] = js.undefined
    
    var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
    
    var breadcrumbRender: js.UndefOr[
        js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
      ] = js.undefined
    
    var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
    
    var home: js.UndefOr[String] = js.undefined
    
    var itemRender: js.UndefOr[
        js.Function4[
          /* route */ Route, 
          /* params */ js.Any, 
          /* routes */ js.Array[Route], 
          /* paths */ js.Array[String], 
          ReactNode
        ]
      ] = js.undefined
    
    var location: js.UndefOr[Location[LocationState] | Pathname] = js.undefined
    
    var menu: js.UndefOr[DefaultOpenAll] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    extension [Self <: BreadcrumbProps](x: Self) {
      
      inline def setBreadcrumbList(value: js.Array[Href]): Self = StObject.set(x, "breadcrumbList", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbListUndefined: Self = StObject.set(x, "breadcrumbList", js.undefined)
      
      inline def setBreadcrumbListVarargs(value: Href*): Self = StObject.set(x, "breadcrumbList", js.Array(value :_*))
      
      inline def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbMapUndefined: Self = StObject.set(x, "breadcrumbMap", js.undefined)
      
      inline def setBreadcrumbRender(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
      
      inline def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      inline def setHome(value: String): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      inline def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      inline def setItemRender(
        value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setLocation(value: Location[LocationState] | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    }
  }
}
