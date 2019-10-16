package typings.atAntDashDesignProDashLayout

import typings.antd.esMenuMenuContextMod.MenuTheme
import typings.antd.esMenuMod.ClickParam
import typings.antd.esMenuMod.MenuMode
import typings.antd.esMenuMod.SelectParam
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import typings.atAntDashDesignProDashLayout.esDefaultSettingsMod.ContentWidth
import typings.atAntDashDesignProDashLayout.esTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.esTypingsMod.MessageDescriptor
import typings.atAntDashDesignProDashLayout.esTypingsMod.Route
import typings.atAntDashDesignProDashLayout.esTypingsMod.WithFalse
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.`match`
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/es/SiderMenu/BaseMenu.BaseMenuProps> */
trait PartialBaseMenuProps extends js.Object {
  var autoHideHeader: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var computedMatch: js.UndefOr[`match`[Route]] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var flatMenuKeys: js.UndefOr[js.Array[String]] = js.undefined
  var focusable: js.UndefOr[Boolean] = js.undefined
  var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
  var history: js.UndefOr[History[LocationState]] = js.undefined
  var iconfontUrl: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlineCollapsed: js.UndefOr[Boolean] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[sidemenu | topmenu] = js.undefined
  var location: js.UndefOr[Location[LocationState] | Anon_Pathname] = js.undefined
  var `match`: js.UndefOr[typings.reactDashRouter.reactDashRouterMod.`match`[js.Object]] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ]
  ] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var motion: js.UndefOr[js.Object] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var navTheme: js.UndefOr[MenuTheme] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var openAnimation: js.UndefOr[String] = js.undefined
  var openKeys: js.UndefOr[WithFalse[js.Array[String]]] = js.undefined
  var openTransitionName: js.UndefOr[String] = js.undefined
  var overflowedIndicator: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[Route] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var staticContext: js.UndefOr[StaticContext] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[MenuTheme] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialBaseMenuProps {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    computedMatch: `match`[Route] = null,
    contentWidth: ContentWidth = null,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    flatMenuKeys: js.Array[String] = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    formatMessage: /* message */ MessageDescriptor => String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    handleOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    history: History[LocationState] = null,
    iconfontUrl: String = null,
    id: String = null,
    inlineCollapsed: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: Int | Double = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    layout: sidemenu | topmenu = null,
    location: Location[LocationState] | Anon_Pathname = null,
    `match`: `match`[js.Object] = null,
    menu: Anon_Locale = null,
    menuData: js.Array[MenuDataItem] = null,
    menuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ] = null,
    mode: MenuMode = null,
    motion: js.Object = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    navTheme: MenuTheme = null,
    onClick: /* param */ ClickParam => Unit = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    onDeselect: /* param */ SelectParam => Unit = null,
    onMouseEnter: /* e */ MouseEvent => Unit = null,
    onOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    onSelect: /* param */ SelectParam => Unit = null,
    openAnimation: String = null,
    openKeys: WithFalse[js.Array[String]] = null,
    openTransitionName: String = null,
    overflowedIndicator: ReactNode = null,
    prefixCls: String = null,
    route: Route = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    staticContext: StaticContext = null,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    theme: MenuTheme = null,
    title: String = null
  ): PartialBaseMenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (computedMatch != null) __obj.updateDynamic("computedMatch")(computedMatch)
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys)
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys)
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (flatMenuKeys != null) __obj.updateDynamic("flatMenuKeys")(flatMenuKeys)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender)
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (handleOpenChange != null) __obj.updateDynamic("handleOpenChange")(js.Any.fromFunction1(handleOpenChange))
    if (history != null) __obj.updateDynamic("history")(history)
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inlineCollapsed)) __obj.updateDynamic("inlineCollapsed")(inlineCollapsed)
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuData != null) __obj.updateDynamic("menuData")(menuData)
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (motion != null) __obj.updateDynamic("motion")(motion)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation)
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName)
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (route != null) __obj.updateDynamic("route")(route)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PartialBaseMenuProps]
  }
}

