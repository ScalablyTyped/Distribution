package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.anon.DefaultMessage
import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.anon.Id
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPageTitleMod {
  
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GetPageTitleProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(props: GetPageTitleProps, ignoreTile: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], ignoreTile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * 获取关于 pageTile 的所有信息方便包装
    * @param props
    * @param ignoreTile
    */
  inline def getPageTitleInfo(props: GetPageTitleProps): Id = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitleInfo")(props.asInstanceOf[js.Any]).asInstanceOf[Id]
  inline def getPageTitleInfo(props: GetPageTitleProps, ignoreTile: Boolean): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitleInfo")(props.asInstanceOf[js.Any], ignoreTile.asInstanceOf[js.Any])).asInstanceOf[Id]
  
  inline def matchParamsPath(pathname: String): MenuDataItem = ^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[MenuDataItem]
  inline def matchParamsPath(pathname: String, breadcrumb: StringDictionary[MenuDataItem]): MenuDataItem = (^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any])).asInstanceOf[MenuDataItem]
  inline def matchParamsPath(
    pathname: String,
    breadcrumb: StringDictionary[MenuDataItem],
    breadcrumbMap: Map[String, MenuDataItem]
  ): MenuDataItem = (^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any], breadcrumbMap.asInstanceOf[js.Any])).asInstanceOf[MenuDataItem]
  inline def matchParamsPath(pathname: String, breadcrumb: Unit, breadcrumbMap: Map[String, MenuDataItem]): MenuDataItem = (^.asInstanceOf[js.Dynamic].applyDynamic("matchParamsPath")(pathname.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any], breadcrumbMap.asInstanceOf[js.Any])).asInstanceOf[MenuDataItem]
  
  trait GetPageTitleProps extends StObject {
    
    var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
    
    var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
    
    var formatMessage: js.UndefOr[js.Function1[/* data */ DefaultMessage, String]] = js.undefined
    
    var menu: js.UndefOr[DefaultOpenAll] = js.undefined
    
    var pageName: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String | `false`] = js.undefined
  }
  object GetPageTitleProps {
    
    inline def apply(): GetPageTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPageTitleProps]
    }
    
    extension [Self <: GetPageTitleProps](x: Self) {
      
      inline def setBreadcrumb(value: StringDictionary[MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbMapUndefined: Self = StObject.set(x, "breadcrumbMap", js.undefined)
      
      inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      inline def setFormatMessage(value: /* data */ DefaultMessage => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      inline def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
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
