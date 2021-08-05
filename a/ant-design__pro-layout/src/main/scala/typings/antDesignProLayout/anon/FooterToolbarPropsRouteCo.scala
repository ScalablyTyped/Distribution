package typings.antDesignProLayout.anon

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import typings.antDesignProLayout.defaultSettingsMod.PureSettings
import typings.antDesignProLayout.getBreadcrumbPropsMod.BreadcrumbListReturn
import typings.antDesignProLayout.routeContextMod.RouteContextType
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antd.menuContextMod.MenuTheme
import typings.react.mod.CSSProperties
import typings.react.mod.Dispatch
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/FooterToolbar.FooterToolbarProps & @ant-design/pro-layout.@ant-design/pro-layout.RouteContextType & {  leftWidth :string | undefined} */
trait FooterToolbarPropsRouteCo extends StObject {
  
  var breadcrumb: js.UndefOr[BreadcrumbListReturn] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  
  var currentMenu: js.UndefOr[PureSettings & MenuDataItem] = js.undefined
  
  var extra: js.UndefOr[ReactNode] = js.undefined
  
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  
  var hasFooter: js.UndefOr[Boolean] = js.undefined
  
  var hasFooterToolbar: js.UndefOr[Boolean] = js.undefined
  
  var hasHeader: js.UndefOr[Boolean] = js.undefined
  
  var hasSiderMenu: js.UndefOr[Boolean] = js.undefined
  
  var headerHeight: js.UndefOr[Double] = js.undefined
  
  var headerTheme: js.UndefOr[MenuTheme] = js.undefined
  
  var iconfontUrl: js.UndefOr[String] = js.undefined
  
  var isChildrenLayout: js.UndefOr[Boolean] = js.undefined
  
  var isMobile: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[side | top | mix] = js.undefined
  
  var leftWidth: js.UndefOr[String] = js.undefined
  
  var matchMenuKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var matchMenus: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  
  var menu: js.UndefOr[DefaultOpenAll] = js.undefined
  
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.undefined
  
  var pageTitleInfo: js.UndefOr[Id] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var primaryColor: js.UndefOr[String] = js.undefined
  
  var renderContent: js.UndefOr[
    js.Function2[/* props */ this.type & RouteContextType & LeftWidth, /* dom */ Element, ReactNode]
  ] = js.undefined
  
  var setHasFooterToolbar: js.UndefOr[Dispatch[SetStateAction[Boolean]]] = js.undefined
  
  var siderWidth: js.UndefOr[Double] = js.undefined
  
  var splitMenus: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[String | `false`] = js.undefined
}
object FooterToolbarPropsRouteCo {
  
  inline def apply(): FooterToolbarPropsRouteCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterToolbarPropsRouteCo]
  }
  
  extension [Self <: FooterToolbarPropsRouteCo](x: Self) {
    
    inline def setBreadcrumb(value: BreadcrumbListReturn): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
    
    inline def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
    
    inline def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
    
    inline def setCurrentMenu(value: PureSettings & MenuDataItem): Self = StObject.set(x, "currentMenu", value.asInstanceOf[js.Any])
    
    inline def setCurrentMenuUndefined: Self = StObject.set(x, "currentMenu", js.undefined)
    
    inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
    
    inline def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    inline def setHasFooter(value: Boolean): Self = StObject.set(x, "hasFooter", value.asInstanceOf[js.Any])
    
    inline def setHasFooterToolbar(value: Boolean): Self = StObject.set(x, "hasFooterToolbar", value.asInstanceOf[js.Any])
    
    inline def setHasFooterToolbarUndefined: Self = StObject.set(x, "hasFooterToolbar", js.undefined)
    
    inline def setHasFooterUndefined: Self = StObject.set(x, "hasFooter", js.undefined)
    
    inline def setHasHeader(value: Boolean): Self = StObject.set(x, "hasHeader", value.asInstanceOf[js.Any])
    
    inline def setHasHeaderUndefined: Self = StObject.set(x, "hasHeader", js.undefined)
    
    inline def setHasSiderMenu(value: Boolean): Self = StObject.set(x, "hasSiderMenu", value.asInstanceOf[js.Any])
    
    inline def setHasSiderMenuUndefined: Self = StObject.set(x, "hasSiderMenu", js.undefined)
    
    inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    inline def setHeaderTheme(value: MenuTheme): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
    
    inline def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
    
    inline def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
    
    inline def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
    
    inline def setIsChildrenLayout(value: Boolean): Self = StObject.set(x, "isChildrenLayout", value.asInstanceOf[js.Any])
    
    inline def setIsChildrenLayoutUndefined: Self = StObject.set(x, "isChildrenLayout", js.undefined)
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    inline def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLeftWidth(value: String): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
    
    inline def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
    
    inline def setMatchMenuKeys(value: js.Array[String]): Self = StObject.set(x, "matchMenuKeys", value.asInstanceOf[js.Any])
    
    inline def setMatchMenuKeysUndefined: Self = StObject.set(x, "matchMenuKeys", js.undefined)
    
    inline def setMatchMenuKeysVarargs(value: String*): Self = StObject.set(x, "matchMenuKeys", js.Array(value :_*))
    
    inline def setMatchMenus(value: js.Array[MenuDataItem]): Self = StObject.set(x, "matchMenus", value.asInstanceOf[js.Any])
    
    inline def setMatchMenusUndefined: Self = StObject.set(x, "matchMenus", js.undefined)
    
    inline def setMatchMenusVarargs(value: MenuDataItem*): Self = StObject.set(x, "matchMenus", js.Array(value :_*))
    
    inline def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
    
    inline def setMenuDataUndefined: Self = StObject.set(x, "menuData", js.undefined)
    
    inline def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
    
    inline def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
    
    inline def setPageTitleInfo(value: Id): Self = StObject.set(x, "pageTitleInfo", value.asInstanceOf[js.Any])
    
    inline def setPageTitleInfoUndefined: Self = StObject.set(x, "pageTitleInfo", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
    
    inline def setRenderContent(
      value: (/* props */ FooterToolbarPropsRouteCo & RouteContextType & LeftWidth, /* dom */ Element) => ReactNode
    ): Self = StObject.set(x, "renderContent", js.Any.fromFunction2(value))
    
    inline def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
    
    inline def setSetHasFooterToolbar(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setHasFooterToolbar", js.Any.fromFunction1(value))
    
    inline def setSetHasFooterToolbarUndefined: Self = StObject.set(x, "setHasFooterToolbar", js.undefined)
    
    inline def setSiderWidth(value: Double): Self = StObject.set(x, "siderWidth", value.asInstanceOf[js.Any])
    
    inline def setSiderWidthUndefined: Self = StObject.set(x, "siderWidth", js.undefined)
    
    inline def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
    
    inline def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
