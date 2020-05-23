package typings.antDesignProLayout.basicLayoutMod

import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.anon.Id
import typings.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typings.antDesignProLayout.anon.Pathname
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typings.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import typings.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typings.antDesignProLayout.headerMod.HeaderViewProps
import typings.antDesignProLayout.localesMod.localeType
import typings.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route> ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>[P]}
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings[P]} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.antDesignProLayout.headerMod.HeaderViewProps because var conflicts: className, logo, menuHeaderRender, siderWidth, style. Inlined isMobile, collapsed, menuRender, headerRender, rightContentRender, hasSiderMenu, fixSiderbar, layout, fixedHeader, menu, contentWidth, iconfontUrl, primaryColor, colorWeak, navTheme, title, collapsedButtonRender, onCollapse */ trait BasicLayoutProps extends SiderMenuProps {
  var breadcrumbRender: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any
    ]
  ] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]] = js.undefined
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  /**
    * 兼用 content的 margin
    */
  var disableContentMargin: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否禁用移动端模式，有的管理系统不需要移动端模式，此属性设置为true即可
    */
  var disableMobile: js.UndefOr[Boolean] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var footerRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  var hasSiderMenu: js.UndefOr[Boolean] = js.undefined
  var headerRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  var iconfontUrl: js.UndefOr[String] = js.undefined
  var isChildrenLayout: js.UndefOr[Boolean] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var itemRender: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any
  ] = js.undefined
  var layout: js.UndefOr[sidemenu | topmenu] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[localeType] = js.undefined
  /**
    * logo url
    */
  @JSName("logo")
  var logo_BasicLayoutProps: js.UndefOr[ReactNode | WithFalse[js.Function0[ReactNode]]] = js.undefined
  var menu: js.UndefOr[DefaultOpenAll] = js.undefined
  var menuDataRender: js.UndefOr[js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]] = js.undefined
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ]
  ] = js.undefined
  var menuRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  var navTheme: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  /**
    * 页面切换的时候触发
    */
  var onPageChange: js.UndefOr[
    js.Function1[
      /* location */ js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>['location'] */ js.Any) | Pathname
      ], 
      Unit
    ]
  ] = js.undefined
  var pageTitleRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[Id], 
        String
      ]
    ]
  ] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var pure: js.UndefOr[Boolean] = js.undefined
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object BasicLayoutProps {
  @scala.inline
  def apply(
    breadcrumbRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any = null,
    breakpoint: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false` = null,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedButtonRender: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]] = null,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    contentStyle: CSSProperties = null,
    contentWidth: ContentWidth = null,
    disableContentMargin: js.UndefOr[Boolean] = js.undefined,
    disableMobile: js.UndefOr[Boolean] = js.undefined,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]] = null,
    formatMessage: /* message */ MessageDescriptor => String = null,
    hasSiderMenu: js.UndefOr[Boolean] = js.undefined,
    headerRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]] = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    iconfontUrl: String = null,
    isChildrenLayout: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    itemRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any = null,
    layout: sidemenu | topmenu = null,
    links: js.Array[ReactNode] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    locale: localeType = null,
    logo: ReactNode | WithFalse[js.Function0[ReactNode]] = null,
    menu: DefaultOpenAll = null,
    menuDataRender: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem] = null,
    menuHeaderRender: WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[BasicLayoutProps], 
        ReactNode
      ]
    ] = null,
    menuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ] = null,
    menuRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]] = null,
    navTheme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    onMenuHeaderClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onOpenChange: /* openKeys */ WithFalse[js.Array[String]] => Unit = null,
    onPageChange: /* location */ js.UndefOr[
      (/* import warning: importer.ImportType#apply Failed type conversion: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>['location'] */ js.Any) | Pathname
    ] => Unit = null,
    pageTitleRender: WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[Id], 
        String
      ]
    ] = null,
    primaryColor: String = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    rightContentRender: WithFalse[js.Function1[BasicLayoutProps, ReactNode]] = null,
    siderWidth: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    title: String = null
  ): BasicLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (breadcrumbRender != null) __obj.updateDynamic("breadcrumbRender")(js.Any.fromFunction1(breadcrumbRender))
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.get.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContentMargin)) __obj.updateDynamic("disableContentMargin")(disableContentMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobile)) __obj.updateDynamic("disableMobile")(disableMobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.get.asInstanceOf[js.Any])
    if (footerRender != null) __obj.updateDynamic("footerRender")(footerRender.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (!js.isUndefined(hasSiderMenu)) __obj.updateDynamic("hasSiderMenu")(hasSiderMenu.get.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLayout)) __obj.updateDynamic("isChildrenLayout")(isChildrenLayout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.get.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(itemRender.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuDataRender != null) __obj.updateDynamic("menuDataRender")(js.Any.fromFunction1(menuDataRender))
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (pageTitleRender != null) __obj.updateDynamic("pageTitleRender")(pageTitleRender.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (!js.isUndefined(siderWidth)) __obj.updateDynamic("siderWidth")(siderWidth.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicLayoutProps]
  }
}

