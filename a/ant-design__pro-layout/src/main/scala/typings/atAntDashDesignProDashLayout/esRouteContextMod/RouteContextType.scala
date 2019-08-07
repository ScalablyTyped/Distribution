package typings.atAntDashDesignProDashLayout.esRouteContextMod

import typings.antd.esMenuMenuContextMod.MenuTheme
import typings.atAntDashDesignProDashLayout.Anon_Locale
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import typings.atAntDashDesignProDashLayout.esDefaultSettingsMod.ContentWidth
import typings.atAntDashDesignProDashLayout.esTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.esUtilsGetBreadcrumbPropsMod.BreadcrumbListReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings> */
trait RouteContextType extends js.Object {
  var autoHideHeader: js.UndefOr[Boolean] = js.undefined
  var breadcrumb: js.UndefOr[BreadcrumbListReturn] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var iconfontUrl: js.UndefOr[String] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[sidemenu | topmenu] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var navTheme: js.UndefOr[MenuTheme] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object RouteContextType {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[Boolean] = js.undefined,
    breadcrumb: BreadcrumbListReturn = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    contentWidth: ContentWidth = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    iconfontUrl: String = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    layout: sidemenu | topmenu = null,
    menu: Anon_Locale = null,
    menuData: js.Array[MenuDataItem] = null,
    navTheme: MenuTheme = null,
    title: String = null
  ): RouteContextType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuData != null) __obj.updateDynamic("menuData")(menuData)
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[RouteContextType]
  }
}

