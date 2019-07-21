package typings
package atAntDashDesignProDashLayoutLib.libRouteContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings[P]} */ trait RouteContextType extends js.Object {
  var breadcrumb: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libUtilsGetBreadcrumbPropsMod.BreadcrumbListReturn
  ] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var menuData: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]] = js.undefined
}

object RouteContextType {
  @scala.inline
  def apply(
    breadcrumb: atAntDashDesignProDashLayoutLib.libUtilsGetBreadcrumbPropsMod.BreadcrumbListReturn = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    menuData: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem] = null
  ): RouteContextType = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (menuData != null) __obj.updateDynamic("menuData")(menuData)
    __obj.asInstanceOf[RouteContextType]
  }
}

