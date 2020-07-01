package typings.antDesignProLayout.baseMenuMod

import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typings.antDesignProLayout.anon.Pathname
import typings.antDesignProLayout.antDesignProLayoutStrings.click
import typings.antDesignProLayout.antDesignProLayoutStrings.hover
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typings.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antDesignProLayout.typingsMod.Route
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.antd.menuContextMod.MenuTheme
import typings.antd.menuMod.ClickParam
import typings.antd.menuMod.MenuMode
import typings.antd.menuMod.MenuProps
import typings.antd.menuMod.SelectParam
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.`match`
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>> */
/* Inlined parent std.Omit<antd.antd/lib/menu.MenuProps, 'openKeys' | 'onOpenChange'> */
/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings> */
trait BaseMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  var computedMatch: js.UndefOr[`match`[Route]] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
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
  var location: js.UndefOr[Location[LocationState] | Pathname] = js.undefined
  var `match`: js.UndefOr[typings.reactRouter.mod.`match`[js.Object]] = js.undefined
  var menu: js.UndefOr[DefaultOpenAll] = js.undefined
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ]
  ] = js.undefined
  /**
    * 要给菜单的props, 参考antd-menu的属性。https://ant.design/components/menu-cn/
    */
  var menuProps: js.UndefOr[MenuProps] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var motion: js.UndefOr[js.Object] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var openAnimation: js.UndefOr[String] = js.undefined
  var openKeys: js.UndefOr[WithFalse[js.Array[String]]] = js.undefined
  var openTransitionName: js.UndefOr[String] = js.undefined
  var overflowedIndicator: js.UndefOr[ReactNode] = js.undefined
  var postMenuData: js.UndefOr[
    js.Function1[/* menusData */ js.UndefOr[js.Array[MenuDataItem]], js.Array[MenuDataItem]]
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[Route] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var staticContext: js.UndefOr[StaticContext] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ]
  ] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[MenuTheme] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var triggerSubMenuAction: js.UndefOr[hover | click] = js.undefined
}

object BaseMenuProps {
  @scala.inline
  def apply(
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    computedMatch: `match`[Route] = null,
    contentWidth: ContentWidth = null,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    formatMessage: /* message */ MessageDescriptor => String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    handleOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    history: History[LocationState] = null,
    iconfontUrl: String = null,
    id: String = null,
    inlineCollapsed: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: js.UndefOr[Double] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    layout: sidemenu | topmenu = null,
    location: Location[LocationState] | Pathname = null,
    `match`: `match`[js.Object] = null,
    menu: DefaultOpenAll = null,
    menuData: js.Array[MenuDataItem] = null,
    menuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ] = null,
    menuProps: MenuProps = null,
    mode: MenuMode = null,
    motion: js.Object = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    navTheme: MenuTheme | realDark = null,
    onClick: /* param */ ClickParam => Unit = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    onDeselect: /* param */ SelectParam => Unit = null,
    onMouseEnter: /* e */ MouseEvent => Unit = null,
    onSelect: /* param */ SelectParam => Unit = null,
    openAnimation: String = null,
    openKeys: WithFalse[js.Array[String]] = null,
    openTransitionName: String = null,
    overflowedIndicator: ReactNode = null,
    postMenuData: /* menusData */ js.UndefOr[js.Array[MenuDataItem]] => js.Array[MenuDataItem] = null,
    prefixCls: String = null,
    primaryColor: String = null,
    route: Route = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    staticContext: StaticContext = null,
    style: CSSProperties = null,
    subMenuCloseDelay: js.UndefOr[Double] = js.undefined,
    subMenuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ] = null,
    subMenuOpenDelay: js.UndefOr[Double] = js.undefined,
    theme: MenuTheme = null,
    title: String = null,
    triggerSubMenuAction: hover | click = null
  ): BaseMenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.get.asInstanceOf[js.Any])
    if (computedMatch != null) __obj.updateDynamic("computedMatch")(computedMatch.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.get.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (handleOpenChange != null) __obj.updateDynamic("handleOpenChange")(js.Any.fromFunction1(handleOpenChange))
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineCollapsed)) __obj.updateDynamic("inlineCollapsed")(inlineCollapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineIndent)) __obj.updateDynamic("inlineIndent")(inlineIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuData != null) __obj.updateDynamic("menuData")(menuData.asInstanceOf[js.Any])
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (postMenuData != null) __obj.updateDynamic("postMenuData")(js.Any.fromFunction1(postMenuData))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(subMenuCloseDelay)) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.get.asInstanceOf[js.Any])
    if (subMenuItemRender != null) __obj.updateDynamic("subMenuItemRender")(subMenuItemRender.asInstanceOf[js.Any])
    if (!js.isUndefined(subMenuOpenDelay)) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuProps]
  }
}

