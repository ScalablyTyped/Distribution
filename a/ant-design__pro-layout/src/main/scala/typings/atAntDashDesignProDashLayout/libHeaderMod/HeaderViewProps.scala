package typings.atAntDashDesignProDashLayout.libHeaderMod

import typings.atAntDashDesignProDashLayout.Anon_DefaultOpenAll
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.realDark
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import typings.atAntDashDesignProDashLayout.libDefaultSettingsMod.ContentWidth
import typings.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings> */
/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/GlobalHeader.GlobalHeaderProps */
trait HeaderViewProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]] = js.undefined
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var hasSiderMenu: js.UndefOr[Boolean] = js.undefined
  var headerRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  var iconfontUrl: js.UndefOr[String] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[sidemenu | topmenu] = js.undefined
  var logo: js.UndefOr[ReactNode] = js.undefined
  var menu: js.UndefOr[Anon_DefaultOpenAll] = js.undefined
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[this.type], 
        ReactNode
      ]
    ]
  ] = js.undefined
  var menuRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  var navTheme: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.undefined
  var siderWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object HeaderViewProps {
  @scala.inline
  def apply(
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedButtonRender: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]] = null,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    contentWidth: ContentWidth = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    hasSiderMenu: js.UndefOr[Boolean] = js.undefined,
    headerRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]] = null,
    iconfontUrl: String = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    layout: sidemenu | topmenu = null,
    logo: ReactNode = null,
    menu: Anon_DefaultOpenAll = null,
    menuHeaderRender: WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[HeaderViewProps], 
        ReactNode
      ]
    ] = null,
    menuRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]] = null,
    navTheme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    primaryColor: String = null,
    rightContentRender: WithFalse[js.Function1[HeaderViewProps, ReactNode]] = null,
    siderWidth: Int | Double = null,
    style: CSSProperties = null,
    title: String = null
  ): HeaderViewProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSiderMenu)) __obj.updateDynamic("hasSiderMenu")(hasSiderMenu.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderViewProps]
  }
}

