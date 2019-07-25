package typings
package atAntDashDesignProDashLayoutLib.esBasicLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/es/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route> ]:? @ant-design/pro-layout.@ant-design/pro-layout/es/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route>[P]}
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings[P]} */ /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atAntDashDesignProDashLayoutLib.esHeaderMod.HeaderViewProps because var conflicts: logo, siderWidth. Inlined isMobile, collapsed, autoHideHeader, menuRender, headerRender, rightContentRender, menu, navTheme, contentWidth, layout, title, fixedHeader, iconfontUrl, fixSiderbar, collapsedButtonRender, onCollapse */ trait BasicLayoutProps
  extends atAntDashDesignProDashLayoutLib.esSiderMenuSiderMenuMod.SiderMenuProps {
  var autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined
  var breadcrumbRender: js.UndefOr[
    js.Function1[
      /* routers */ js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]], 
      js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]]
    ]
  ] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsedButtonRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function1[/* collapsed */ js.UndefOr[scala.Boolean], reactLib.reactMod.ReactNode]
    ]
  ] = js.undefined
  var contentWidth: js.UndefOr[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var footerRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* props */ atAntDashDesignProDashLayoutLib.esHeaderMod.HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  var formatMessage: js.UndefOr[
    js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ] = js.undefined
  var headerRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function1[
        /* props */ atAntDashDesignProDashLayoutLib.esHeaderMod.HeaderViewProps, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  var iconfontUrl: js.UndefOr[java.lang.String] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ antdLib.esBreadcrumbBreadcrumbMod.Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route], 
      /* paths */ js.Array[java.lang.String], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var layout: js.UndefOr[
    atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu
  ] = js.undefined
  var locale: js.UndefOr[atAntDashDesignProDashLayoutLib.esLocalesMod.localeType] = js.undefined
  @JSName("logo")
  var logo_BasicLayoutProps: js.UndefOr[
    reactLib.reactMod.ReactNode | atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[js.Function0[reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var menu: js.UndefOr[atAntDashDesignProDashLayoutLib.Anon_Locale] = js.undefined
  var menuDataRender: js.UndefOr[
    js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
    ]
  ] = js.undefined
  var menuItemRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* item */ atAntDashDesignProDashLayoutLib.MenuDataItemisUrlboolean, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  var menuRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* props */ atAntDashDesignProDashLayoutLib.esHeaderMod.HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  var navTheme: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ scala.Boolean, scala.Unit]] = js.undefined
  var pageTitleRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* props */ atAntDashDesignProDashLayoutLib.esGetPageTitleMod.GetPageTitleProps, 
        /* ignoreTile */ js.UndefOr[scala.Boolean], 
        java.lang.String
      ]
    ]
  ] = js.undefined
  var rightContentRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[js.Function1[/* props */ this.type, reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object BasicLayoutProps {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined,
    breadcrumbRender: /* routers */ js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]] => js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]] = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedButtonRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function1[/* collapsed */ js.UndefOr[scala.Boolean], reactLib.reactMod.ReactNode]
    ] = null,
    contentWidth: atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth = null,
    fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    footerRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* props */ atAntDashDesignProDashLayoutLib.esHeaderMod.HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    formatMessage: /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor => java.lang.String = null,
    headerRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function1[
        /* props */ atAntDashDesignProDashLayoutLib.esHeaderMod.HeaderViewProps, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    iconfontUrl: java.lang.String = null,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    itemRender: (/* route */ antdLib.esBreadcrumbBreadcrumbMod.Route, /* params */ js.Any, /* routes */ js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route], /* paths */ js.Array[java.lang.String]) => reactLib.reactMod.ReactNode = null,
    layout: atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu = null,
    locale: atAntDashDesignProDashLayoutLib.esLocalesMod.localeType = null,
    logo: reactLib.reactMod.ReactNode | atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[js.Function0[reactLib.reactMod.ReactNode]] = null,
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale = null,
    menuDataRender: /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem] => js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem] = null,
    menuItemRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* item */ atAntDashDesignProDashLayoutLib.MenuDataItemisUrlboolean, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    menuRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* props */ atAntDashDesignProDashLayoutLib.esHeaderMod.HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    navTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    onCollapse: /* collapsed */ scala.Boolean => scala.Unit = null,
    pageTitleRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* props */ atAntDashDesignProDashLayoutLib.esGetPageTitleMod.GetPageTitleProps, 
        /* ignoreTile */ js.UndefOr[scala.Boolean], 
        java.lang.String
      ]
    ] = null,
    rightContentRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[js.Function1[BasicLayoutProps, reactLib.reactMod.ReactNode]] = null,
    siderWidth: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): BasicLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (breadcrumbRender != null) __obj.updateDynamic("breadcrumbRender")(js.Any.fromFunction1(breadcrumbRender))
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (footerRender != null) __obj.updateDynamic("footerRender")(footerRender.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuDataRender != null) __obj.updateDynamic("menuDataRender")(js.Any.fromFunction1(menuDataRender))
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (pageTitleRender != null) __obj.updateDynamic("pageTitleRender")(pageTitleRender.asInstanceOf[js.Any])
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BasicLayoutProps]
  }
}

