package typings.atAntDashDesignProDashLayout.libSiderMenuBaseMenuMod

import typings.antd.esMenuMod.MenuMode
import typings.atAntDashDesignProDashLayout.Anon_Locale
import typings.atAntDashDesignProDashLayout.Anon_Pathname
import typings.atAntDashDesignProDashLayout.MenuDataItemisUrlbooleanAuthority
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import typings.atAntDashDesignProDashLayout.libDefaultSettingsMod.ContentWidth
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.libTypingsMod.MessageDescriptor
import typings.atAntDashDesignProDashLayout.libTypingsMod.Route
import typings.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>> */
/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings> */
trait BaseMenuProps extends js.Object {
  var autoHideHeader: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var computedMatch: js.UndefOr[`match`[Route]] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var flatMenuKeys: js.UndefOr[js.Array[String]] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
  var history: js.UndefOr[History[LocationState]] = js.undefined
  var iconfontUrl: js.UndefOr[String] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[sidemenu | topmenu] = js.undefined
  var location: js.UndefOr[Location[LocationState] | Anon_Pathname] = js.undefined
  var `match`: js.UndefOr[typings.reactDashRouter.reactDashRouterMod.`match`[js.Object]] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlbooleanAuthority, /* defaultDom */ ReactNode, ReactNode]
    ]
  ] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var navTheme: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  var route: js.UndefOr[Route] = js.undefined
  var staticContext: js.UndefOr[StaticContext] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var theme: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object BaseMenuProps {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    computedMatch: `match`[Route] = null,
    contentWidth: ContentWidth = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    flatMenuKeys: js.Array[String] = null,
    formatMessage: /* message */ MessageDescriptor => String = null,
    handleOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    history: History[LocationState] = null,
    iconfontUrl: String = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    layout: sidemenu | topmenu = null,
    location: Location[LocationState] | Anon_Pathname = null,
    `match`: `match`[js.Object] = null,
    menu: Anon_Locale = null,
    menuData: js.Array[MenuDataItem] = null,
    menuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlbooleanAuthority, /* defaultDom */ ReactNode, ReactNode]
    ] = null,
    mode: MenuMode = null,
    navTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    onOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    openKeys: js.Array[String] = null,
    route: Route = null,
    staticContext: StaticContext = null,
    style: CSSProperties = null,
    theme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    title: String = null
  ): BaseMenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (computedMatch != null) __obj.updateDynamic("computedMatch")(computedMatch)
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (flatMenuKeys != null) __obj.updateDynamic("flatMenuKeys")(flatMenuKeys)
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (handleOpenChange != null) __obj.updateDynamic("handleOpenChange")(js.Any.fromFunction1(handleOpenChange))
    if (history != null) __obj.updateDynamic("history")(history)
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuData != null) __obj.updateDynamic("menuData")(menuData)
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys)
    if (route != null) __obj.updateDynamic("route")(route)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BaseMenuProps]
  }
}

