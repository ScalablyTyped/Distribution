package typings.antDesignPro

import typings.antDesignPro.anon.Key
import typings.antDesignPro.anon.Title
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageHeaderMod {
  
  @JSImport("ant-design-pro/lib/PageHeader", JSImport.Default)
  @js.native
  class default ()
    extends Component[PageHeaderProps, js.Any, js.Any]
  
  type PageHeader = Component[PageHeaderProps, js.Any, js.Any]
  
  trait PageHeaderProps extends StObject {
    
    var action: js.UndefOr[ReactNode | String] = js.undefined
    
    var breadcrumbList: js.UndefOr[js.Array[Title]] = js.undefined
    
    var breadcrumbNameMap: js.UndefOr[js.Any] = js.undefined
    
    var breadcrumbSeparator: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var extraContent: js.UndefOr[ReactNode] = js.undefined
    
    var hiddenBreadcrumb: js.UndefOr[Boolean] = js.undefined
    
    var home: js.UndefOr[ReactNode] = js.undefined
    
    def itemRender(menuItem: js.Any): ReactNode
    
    var linkElement: js.UndefOr[ReactNode | String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var location: js.UndefOr[Location[LocationState]] = js.undefined
    
    var logo: js.UndefOr[ReactNode | String] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var params: js.UndefOr[js.Any] = js.undefined
    
    var routes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabActiveKey: js.UndefOr[String] = js.undefined
    
    var tabBarExtraContent: js.UndefOr[ReactNode] = js.undefined
    
    var tabDefaultActiveKey: js.UndefOr[String] = js.undefined
    
    var tabList: js.UndefOr[js.Array[Key]] = js.undefined
    
    var title: js.UndefOr[ReactNode | String | Double] = js.undefined
    
    var wide: js.UndefOr[Boolean] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(itemRender: js.Any => ReactNode): PageHeaderProps = {
      val __obj = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setAction(value: ReactNode | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBreadcrumbList(value: js.Array[Title]): Self = StObject.set(x, "breadcrumbList", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbListUndefined: Self = StObject.set(x, "breadcrumbList", js.undefined)
      
      inline def setBreadcrumbListVarargs(value: Title*): Self = StObject.set(x, "breadcrumbList", js.Array(value :_*))
      
      inline def setBreadcrumbNameMap(value: js.Any): Self = StObject.set(x, "breadcrumbNameMap", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbNameMapUndefined: Self = StObject.set(x, "breadcrumbNameMap", js.undefined)
      
      inline def setBreadcrumbSeparator(value: ReactNode): Self = StObject.set(x, "breadcrumbSeparator", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbSeparatorUndefined: Self = StObject.set(x, "breadcrumbSeparator", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setExtraContent(value: ReactNode): Self = StObject.set(x, "extraContent", value.asInstanceOf[js.Any])
      
      inline def setExtraContentUndefined: Self = StObject.set(x, "extraContent", js.undefined)
      
      inline def setHiddenBreadcrumb(value: Boolean): Self = StObject.set(x, "hiddenBreadcrumb", value.asInstanceOf[js.Any])
      
      inline def setHiddenBreadcrumbUndefined: Self = StObject.set(x, "hiddenBreadcrumb", js.undefined)
      
      inline def setHome(value: ReactNode): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      inline def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      inline def setItemRender(value: js.Any => ReactNode): Self = StObject.set(x, "itemRender", js.Any.fromFunction1(value))
      
      inline def setLinkElement(value: ReactNode | String): Self = StObject.set(x, "linkElement", value.asInstanceOf[js.Any])
      
      inline def setLinkElementUndefined: Self = StObject.set(x, "linkElement", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setLogo(value: ReactNode | String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setOnTabChange(value: /* key */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRoutes(value: js.Array[js.Any]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: js.Any*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      inline def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      inline def setTabBarExtraContent(value: ReactNode): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      inline def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      inline def setTabDefaultActiveKey(value: String): Self = StObject.set(x, "tabDefaultActiveKey", value.asInstanceOf[js.Any])
      
      inline def setTabDefaultActiveKeyUndefined: Self = StObject.set(x, "tabDefaultActiveKey", js.undefined)
      
      inline def setTabList(value: js.Array[Key]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      inline def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      inline def setTabListVarargs(value: Key*): Self = StObject.set(x, "tabList", js.Array(value :_*))
      
      inline def setTitle(value: ReactNode | String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWide(value: Boolean): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
      
      inline def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    }
  }
}
