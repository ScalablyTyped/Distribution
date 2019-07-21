package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps> */
trait PartialBaseMenuPropsAutoHideHeader extends js.Object {
  var autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var computedMatch: js.UndefOr[
    reactDashRouterLib.reactDashRouterMod.`match`[atAntDashDesignProDashLayoutLib.libTypingsMod.Route]
  ] = js.undefined
  var contentWidth: js.UndefOr[atAntDashDesignProDashLayoutLib.libDefaultSettingsMod.ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var flatMenuKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var formatMessage: js.UndefOr[
    js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.libTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ] = js.undefined
  var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var history: js.UndefOr[historyLib.historyMod.History[historyLib.historyMod.LocationState]] = js.undefined
  var iconfontUrl: js.UndefOr[java.lang.String] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[
    atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu
  ] = js.undefined
  var location: js.UndefOr[
    historyLib.historyMod.Location[historyLib.historyMod.LocationState] | Anon_Pathname
  ] = js.undefined
  var `match`: js.UndefOr[reactDashRouterLib.reactDashRouterMod.`match`[js.Object]] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
  var menuData: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]] = js.undefined
  var menuItemRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function2[
        /* item */ MenuDataItemisUrlbooleanAuthority, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  var mode: js.UndefOr[antdLib.esMenuMod.MenuMode] = js.undefined
  var navTheme: js.UndefOr[antdLib.esMenuMod.MenuTheme] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ scala.Boolean, scala.Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var openKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var route: js.UndefOr[atAntDashDesignProDashLayoutLib.libTypingsMod.Route] = js.undefined
  var staticContext: js.UndefOr[reactDashRouterLib.reactDashRouterMod.StaticContext] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var theme: js.UndefOr[antdLib.esMenuMod.MenuTheme] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PartialBaseMenuPropsAutoHideHeader {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    computedMatch: reactDashRouterLib.reactDashRouterMod.`match`[atAntDashDesignProDashLayoutLib.libTypingsMod.Route] = null,
    contentWidth: atAntDashDesignProDashLayoutLib.libDefaultSettingsMod.ContentWidth = null,
    fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    flatMenuKeys: js.Array[java.lang.String] = null,
    formatMessage: /* message */ atAntDashDesignProDashLayoutLib.libTypingsMod.MessageDescriptor => java.lang.String = null,
    handleOpenChange: /* openKeys */ js.Array[java.lang.String] => scala.Unit = null,
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState] = null,
    iconfontUrl: java.lang.String = null,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    layout: atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu = null,
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] | Anon_Pathname = null,
    `match`: reactDashRouterLib.reactDashRouterMod.`match`[js.Object] = null,
    menu: Anon_Locale = null,
    menuData: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem] = null,
    menuItemRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function2[
        /* item */ MenuDataItemisUrlbooleanAuthority, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    mode: antdLib.esMenuMod.MenuMode = null,
    navTheme: antdLib.esMenuMod.MenuTheme = null,
    onCollapse: /* collapsed */ scala.Boolean => scala.Unit = null,
    onOpenChange: /* openKeys */ js.Array[java.lang.String] => scala.Unit = null,
    openKeys: js.Array[java.lang.String] = null,
    route: atAntDashDesignProDashLayoutLib.libTypingsMod.Route = null,
    staticContext: reactDashRouterLib.reactDashRouterMod.StaticContext = null,
    style: reactLib.reactMod.CSSProperties = null,
    theme: antdLib.esMenuMod.MenuTheme = null,
    title: java.lang.String = null
  ): PartialBaseMenuPropsAutoHideHeader = {
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
    __obj.asInstanceOf[PartialBaseMenuPropsAutoHideHeader]
  }
}

