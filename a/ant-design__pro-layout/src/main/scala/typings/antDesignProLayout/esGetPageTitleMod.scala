package typings.antDesignProLayout

import typings.antDesignProLayout.anon.AutoClose
import typings.antDesignProLayout.anon.DefaultMessage
import typings.antDesignProLayout.anon.Id
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.react.mod.ReactNode
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetPageTitleMod {
  
  @JSImport("@ant-design/pro-layout/es/getPageTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPageTitle(props: GetPageTitleProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitle")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPageTitle(props: GetPageTitleProps, ignoreTitle: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitle")(props.asInstanceOf[js.Any], ignoreTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPageTitleInfo(props: GetPageTitleProps): Id = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitleInfo")(props.asInstanceOf[js.Any]).asInstanceOf[Id]
  inline def getPageTitleInfo(props: GetPageTitleProps, ignoreTitle: Boolean): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitleInfo")(props.asInstanceOf[js.Any], ignoreTitle.asInstanceOf[js.Any])).asInstanceOf[Id]
  
  inline def matchParamsPath(pathname: String): BreadcrumbItem = ^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[BreadcrumbItem]
  inline def matchParamsPath(pathname: String, breadcrumb: Unit, breadcrumbMap: Map[String, BreadcrumbItem]): BreadcrumbItem = (^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any], breadcrumbMap.asInstanceOf[js.Any])).asInstanceOf[BreadcrumbItem]
  inline def matchParamsPath(pathname: String, breadcrumb: Record[String, BreadcrumbItem]): BreadcrumbItem = (^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any])).asInstanceOf[BreadcrumbItem]
  inline def matchParamsPath(
    pathname: String,
    breadcrumb: Record[String, BreadcrumbItem],
    breadcrumbMap: Map[String, BreadcrumbItem]
  ): BreadcrumbItem = (^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any], breadcrumbMap.asInstanceOf[js.Any])).asInstanceOf[BreadcrumbItem]
  
  /* Inlined std.Omit<@ant-design/pro-layout.@ant-design/pro-layout/es/typing.MenuDataItem, 'children' | 'routes'> & {  routes :@ant-design/pro-layout.@ant-design/pro-layout/es/getPageTitle.BreadcrumbItem | undefined} */
  trait BreadcrumbItem extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var flatMenu: js.UndefOr[Boolean] = js.undefined
    
    var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
    
    var hideInMenu: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var routes: js.UndefOr[BreadcrumbItem] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object BreadcrumbItem {
    
    inline def apply(): BreadcrumbItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbItem] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFlatMenu(value: Boolean): Self = StObject.set(x, "flatMenu", value.asInstanceOf[js.Any])
      
      inline def setFlatMenuUndefined: Self = StObject.set(x, "flatMenu", js.undefined)
      
      inline def setHideChildrenInMenu(value: Boolean): Self = StObject.set(x, "hideChildrenInMenu", value.asInstanceOf[js.Any])
      
      inline def setHideChildrenInMenuUndefined: Self = StObject.set(x, "hideChildrenInMenu", js.undefined)
      
      inline def setHideInMenu(value: Boolean): Self = StObject.set(x, "hideInMenu", value.asInstanceOf[js.Any])
      
      inline def setHideInMenuUndefined: Self = StObject.set(x, "hideInMenu", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentKeys(value: js.Array[String]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
      
      inline def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
      
      inline def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRoutes(value: BreadcrumbItem): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait GetPageTitleProps extends StObject {
    
    var breadcrumb: js.UndefOr[Record[String, BreadcrumbItem]] = js.undefined
    
    var breadcrumbMap: js.UndefOr[Map[String, BreadcrumbItem]] = js.undefined
    
    var formatMessage: js.UndefOr[js.Function1[/* data */ DefaultMessage, String]] = js.undefined
    
    var menu: js.UndefOr[AutoClose] = js.undefined
    
    var pageName: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String | `false`] = js.undefined
  }
  object GetPageTitleProps {
    
    inline def apply(): GetPageTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPageTitleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPageTitleProps] (val x: Self) extends AnyVal {
      
      inline def setBreadcrumb(value: Record[String, BreadcrumbItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbMap(value: Map[String, BreadcrumbItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbMapUndefined: Self = StObject.set(x, "breadcrumbMap", js.undefined)
      
      inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      inline def setFormatMessage(value: /* data */ DefaultMessage => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      inline def setMenu(value: AutoClose): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
      
      inline def setPageNameUndefined: Self = StObject.set(x, "pageName", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
