package typings
package atAntDashDesignProDashLayoutLib.esRouteContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings> */
trait RouteContextType extends js.Object {
  var autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined
  var breadcrumb: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esUtilsGetBreadcrumbPropsMod.BreadcrumbListReturn
  ] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var contentWidth: js.UndefOr[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var iconfontUrl: js.UndefOr[java.lang.String] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[
    atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu
  ] = js.undefined
  var menu: js.UndefOr[atAntDashDesignProDashLayoutLib.Anon_Locale] = js.undefined
  var menuData: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]] = js.undefined
  var navTheme: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object RouteContextType {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined,
    breadcrumb: atAntDashDesignProDashLayoutLib.esUtilsGetBreadcrumbPropsMod.BreadcrumbListReturn = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    contentWidth: atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth = null,
    fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    iconfontUrl: java.lang.String = null,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    layout: atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu = null,
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale = null,
    menuData: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem] = null,
    navTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    title: java.lang.String = null
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

