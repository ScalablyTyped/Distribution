package typings
package atAntDashDesignProDashLayoutLib.libHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings> */
/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/GlobalHeader.GlobalHeaderProps */
trait HeaderViewProps extends js.Object {
  var autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsedButtonRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function1[/* collapsed */ js.UndefOr[scala.Boolean], reactLib.reactMod.ReactNode]
    ]
  ] = js.undefined
  var contentWidth: js.UndefOr[atAntDashDesignProDashLayoutLib.libDefaultSettingsMod.ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var headerRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[/* props */ HeaderViewProps, reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var iconfontUrl: js.UndefOr[java.lang.String] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[
    atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu
  ] = js.undefined
  var logo: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var menu: js.UndefOr[atAntDashDesignProDashLayoutLib.Anon_Locale] = js.undefined
  var menuRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function2[
        /* props */ HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  var navTheme: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ scala.Boolean, scala.Unit]] = js.undefined
  var rightContentRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[/* props */ this.type, reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var siderWidth: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderViewProps {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedButtonRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function1[/* collapsed */ js.UndefOr[scala.Boolean], reactLib.reactMod.ReactNode]
    ] = null,
    contentWidth: atAntDashDesignProDashLayoutLib.libDefaultSettingsMod.ContentWidth = null,
    fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    headerRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[/* props */ HeaderViewProps, reactLib.reactMod.ReactNode]] = null,
    iconfontUrl: java.lang.String = null,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    layout: atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu = null,
    logo: reactLib.reactMod.ReactNode = null,
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale = null,
    menuRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function2[
        /* props */ HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    navTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    onCollapse: /* collapsed */ scala.Boolean => scala.Unit = null,
    rightContentRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[HeaderViewProps, reactLib.reactMod.ReactNode]] = null,
    siderWidth: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): HeaderViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HeaderViewProps]
  }
}

