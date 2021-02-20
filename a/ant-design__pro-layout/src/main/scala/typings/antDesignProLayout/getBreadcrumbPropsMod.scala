package typings.antDesignProLayout

import typings.antDesignProLayout.anon.BreadcrumbMap
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBreadcrumbPropsMod {
  
  @JSImport("@ant-design/pro-layout/lib/utils/getBreadcrumbProps", "genBreadcrumbProps")
  @js.native
  def genBreadcrumbProps(props: BreadcrumbProps): js.UndefOr[js.Array[Route]] = js.native
  
  @JSImport("@ant-design/pro-layout/lib/utils/getBreadcrumbProps", "getBreadcrumb")
  @js.native
  def getBreadcrumb(breadcrumbMap: Map[String, MenuDataItem], url: String): MenuDataItem = js.native
  
  @JSImport("@ant-design/pro-layout/lib/utils/getBreadcrumbProps", "getBreadcrumbFromProps")
  @js.native
  def getBreadcrumbFromProps(props: BreadcrumbProps): BreadcrumbMap = js.native
  
  @JSImport("@ant-design/pro-layout/lib/utils/getBreadcrumbProps", "getBreadcrumbProps")
  @js.native
  def getBreadcrumbProps(props: BreadcrumbProps): BreadcrumbListReturn = js.native
  
  /* Inlined std.Pick<antd.antd/lib/breadcrumb.BreadcrumbProps, std.Extract<keyof antd.antd/lib/breadcrumb.BreadcrumbProps, 'routes' | 'itemRender'>> */
  @js.native
  trait BreadcrumbListReturn extends StObject {
    
    var itemRender: js.UndefOr[
        js.Function4[
          /* route */ Route, 
          /* params */ js.Any, 
          /* routes */ js.Array[Route], 
          /* paths */ js.Array[String], 
          ReactNode
        ]
      ] = js.native
    
    var routes: js.UndefOr[js.Array[Route]] = js.native
  }
  object BreadcrumbListReturn {
    
    @scala.inline
    def apply(): BreadcrumbListReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbListReturn]
    }
    
    @scala.inline
    implicit class BreadcrumbListReturnMutableBuilder[Self <: BreadcrumbListReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemRender(
        value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BreadcrumbProps extends StObject {
    
    var breadcrumbList: js.UndefOr[js.Array[Href]] = js.native
    
    var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
    
    var breadcrumbRender: js.UndefOr[
        js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
      ] = js.native
    
    var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
    
    var home: js.UndefOr[String] = js.native
    
    var itemRender: js.UndefOr[
        js.Function4[
          /* route */ Route, 
          /* params */ js.Any, 
          /* routes */ js.Array[Route], 
          /* paths */ js.Array[String], 
          ReactNode
        ]
      ] = js.native
    
    var location: js.UndefOr[Location[LocationState] | Pathname] = js.native
    
    var menu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
      ] = js.native
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
      def setBreadcrumbList(value: js.Array[Href]): Self = StObject.set(x, "breadcrumbList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbListUndefined: Self = StObject.set(x, "breadcrumbList", js.undefined)
      
      @scala.inline
      def setBreadcrumbListVarargs(value: Href*): Self = StObject.set(x, "breadcrumbList", js.Array(value :_*))
      
      @scala.inline
      def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbMapUndefined: Self = StObject.set(x, "breadcrumbMap", js.undefined)
      
      @scala.inline
      def setBreadcrumbRender(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
      
      @scala.inline
      def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      @scala.inline
      def setHome(value: String): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setLocation(value: Location[LocationState] | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
      ): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    }
  }
}
