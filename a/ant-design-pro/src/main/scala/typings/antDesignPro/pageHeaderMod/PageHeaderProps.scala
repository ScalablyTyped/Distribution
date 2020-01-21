package typings.antDesignPro.pageHeaderMod

import typings.antDesignPro.AnonHrefTitle
import typings.antDesignPro.AnonKey
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps extends js.Object {
  var action: js.UndefOr[ReactNode | String] = js.undefined
  var breadcrumbList: js.UndefOr[js.Array[AnonHrefTitle]] = js.undefined
  var breadcrumbNameMap: js.UndefOr[js.Any] = js.undefined
  var breadcrumbSeparator: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[ReactNode] = js.undefined
  var extraContent: js.UndefOr[ReactNode] = js.undefined
  var hiddenBreadcrumb: js.UndefOr[Boolean] = js.undefined
  var home: js.UndefOr[ReactNode] = js.undefined
  var linkElement: js.UndefOr[ReactNode | String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var logo: js.UndefOr[ReactNode | String] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var routes: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabActiveKey: js.UndefOr[String] = js.undefined
  var tabBarExtraContent: js.UndefOr[ReactNode] = js.undefined
  var tabDefaultActiveKey: js.UndefOr[String] = js.undefined
  var tabList: js.UndefOr[js.Array[AnonKey]] = js.undefined
  var title: js.UndefOr[ReactNode | String | Double] = js.undefined
  var wide: js.UndefOr[Boolean] = js.undefined
  def itemRender(menuItem: js.Any): ReactNode
}

object PageHeaderProps {
  @scala.inline
  def apply(
    itemRender: js.Any => ReactNode,
    action: ReactNode | String = null,
    breadcrumbList: js.Array[AnonHrefTitle] = null,
    breadcrumbNameMap: js.Any = null,
    breadcrumbSeparator: ReactNode = null,
    className: String = null,
    content: ReactNode = null,
    extraContent: ReactNode = null,
    hiddenBreadcrumb: js.UndefOr[Boolean] = js.undefined,
    home: ReactNode = null,
    linkElement: ReactNode | String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    logo: ReactNode | String = null,
    onTabChange: /* key */ String => Unit = null,
    params: js.Any = null,
    routes: js.Array[_] = null,
    style: CSSProperties = null,
    tabActiveKey: String = null,
    tabBarExtraContent: ReactNode = null,
    tabDefaultActiveKey: String = null,
    tabList: js.Array[AnonKey] = null,
    title: ReactNode | String | Double = null,
    wide: js.UndefOr[Boolean] = js.undefined
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (breadcrumbList != null) __obj.updateDynamic("breadcrumbList")(breadcrumbList.asInstanceOf[js.Any])
    if (breadcrumbNameMap != null) __obj.updateDynamic("breadcrumbNameMap")(breadcrumbNameMap.asInstanceOf[js.Any])
    if (breadcrumbSeparator != null) __obj.updateDynamic("breadcrumbSeparator")(breadcrumbSeparator.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extraContent != null) __obj.updateDynamic("extraContent")(extraContent.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenBreadcrumb)) __obj.updateDynamic("hiddenBreadcrumb")(hiddenBreadcrumb.asInstanceOf[js.Any])
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (linkElement != null) __obj.updateDynamic("linkElement")(linkElement.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabDefaultActiveKey != null) __obj.updateDynamic("tabDefaultActiveKey")(tabDefaultActiveKey.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(wide)) __obj.updateDynamic("wide")(wide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
}

