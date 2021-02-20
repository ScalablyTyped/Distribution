package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.anon.DefaultMessage
import typings.antDesignProLayout.anon.Id
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPageTitleMod {
  
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", JSImport.Default)
  @js.native
  def default(props: GetPageTitleProps): String = js.native
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", JSImport.Default)
  @js.native
  def default(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
  
  /**
    * 获取关于 pageTile 的所有信息方便包装
    * @param props
    * @param ignoreTile
    */
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", "getPageTitleInfo")
  @js.native
  def getPageTitleInfo(props: GetPageTitleProps): Id = js.native
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", "getPageTitleInfo")
  @js.native
  def getPageTitleInfo(props: GetPageTitleProps, ignoreTile: Boolean): Id = js.native
  
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", "matchParamsPath")
  @js.native
  def matchParamsPath(pathname: String): MenuDataItem = js.native
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", "matchParamsPath")
  @js.native
  def matchParamsPath(pathname: String, breadcrumb: js.UndefOr[scala.Nothing], breadcrumbMap: Map[String, MenuDataItem]): MenuDataItem = js.native
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", "matchParamsPath")
  @js.native
  def matchParamsPath(pathname: String, breadcrumb: StringDictionary[MenuDataItem]): MenuDataItem = js.native
  @JSImport("@ant-design/pro-layout/lib/getPageTitle", "matchParamsPath")
  @js.native
  def matchParamsPath(
    pathname: String,
    breadcrumb: StringDictionary[MenuDataItem],
    breadcrumbMap: Map[String, MenuDataItem]
  ): MenuDataItem = js.native
  
  @js.native
  trait GetPageTitleProps extends StObject {
    
    var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.native
    
    var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
    
    var formatMessage: js.UndefOr[js.Function1[/* data */ DefaultMessage, String]] = js.native
    
    var menu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
      ] = js.native
    
    var pageName: js.UndefOr[String] = js.native
    
    var pathname: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['title'] */ js.Any
      ] = js.native
  }
  object GetPageTitleProps {
    
    @scala.inline
    def apply(): GetPageTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPageTitleProps]
    }
    
    @scala.inline
    implicit class GetPageTitlePropsMutableBuilder[Self <: GetPageTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumb(value: StringDictionary[MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbMapUndefined: Self = StObject.set(x, "breadcrumbMap", js.undefined)
      
      @scala.inline
      def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      @scala.inline
      def setFormatMessage(value: /* data */ DefaultMessage => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      @scala.inline
      def setMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
      ): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNameUndefined: Self = StObject.set(x, "pageName", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setTitle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['title'] */ js.Any
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
