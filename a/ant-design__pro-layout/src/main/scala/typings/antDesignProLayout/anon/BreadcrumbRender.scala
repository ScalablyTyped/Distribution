package typings.antDesignProLayout.anon

import typings.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typings.antDesignProLayout.headerMod.HeaderViewProps
import typings.antDesignProLayout.localesMod.LocaleType
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.antd.breadcrumbBreadcrumbMod.Route
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbRender extends StObject {
  
  var breadcrumbRender: js.UndefOr[
    js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
  ] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * 兼用 content的 margin
    */
  var disableContentMargin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否禁用移动端模式，有的管理系统不需要移动端模式，此属性设置为true即可
    */
  var disableMobile: js.UndefOr[Boolean] = js.undefined
  
  var footerRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  
  var isChildrenLayout: js.UndefOr[Boolean] = js.undefined
  
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[LocaleType] = js.undefined
  
  /**
    *@name logo url
    */
  var logo: js.UndefOr[ReactNode | WithFalse[js.Function0[ReactNode]]] = js.undefined
  
  var menuDataRender: js.UndefOr[js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]] = js.undefined
  
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ]
  ] = js.undefined
  
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  
  /**
    *@name 页面切换的时候触发
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
  
  var pure: js.UndefOr[Boolean] = js.undefined
}
object BreadcrumbRender {
  
  inline def apply(): BreadcrumbRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbRender]
  }
  
  extension [Self <: BreadcrumbRender](x: Self) {
    
    inline def setBreadcrumbRender(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction1(value))
    
    inline def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setDisableContentMargin(value: Boolean): Self = StObject.set(x, "disableContentMargin", value.asInstanceOf[js.Any])
    
    inline def setDisableContentMarginUndefined: Self = StObject.set(x, "disableContentMargin", js.undefined)
    
    inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
    
    inline def setFooterRender(value: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
    
    inline def setFooterRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "footerRender", js.Any.fromFunction2(value))
    
    inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
    
    inline def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
    
    inline def setIsChildrenLayout(value: Boolean): Self = StObject.set(x, "isChildrenLayout", value.asInstanceOf[js.Any])
    
    inline def setIsChildrenLayoutUndefined: Self = StObject.set(x, "isChildrenLayout", js.undefined)
    
    inline def setItemRender(
      value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
    ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
    
    inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLocale(value: LocaleType): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLogo(value: ReactNode | WithFalse[js.Function0[ReactNode]]): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoFunction0(value: () => ReactNode): Self = StObject.set(x, "logo", js.Any.fromFunction0(value))
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setMenuDataRender(value: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem]): Self = StObject.set(x, "menuDataRender", js.Any.fromFunction1(value))
    
    inline def setMenuDataRenderUndefined: Self = StObject.set(x, "menuDataRender", js.undefined)
    
    inline def setMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
        ]
    ): Self = StObject.set(x, "menuItemRender", value.asInstanceOf[js.Any])
    
    inline def setMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "menuItemRender", js.Any.fromFunction2(value))
    
    inline def setMenuItemRenderUndefined: Self = StObject.set(x, "menuItemRender", js.undefined)
    
    inline def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
    
    inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
    
    inline def setOnPageChange(
      value: /* location */ js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>['location'] */ js.Any) | Pathname
        ] => Unit
    ): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
    
    inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
    
    inline def setPageTitleRender(
      value: WithFalse[
          js.Function3[
            /* props */ GetPageTitleProps, 
            /* defaultPageTitle */ js.UndefOr[String], 
            /* info */ js.UndefOr[Id], 
            String
          ]
        ]
    ): Self = StObject.set(x, "pageTitleRender", value.asInstanceOf[js.Any])
    
    inline def setPageTitleRenderFunction3(
      value: (/* props */ GetPageTitleProps, /* defaultPageTitle */ js.UndefOr[String], /* info */ js.UndefOr[Id]) => String
    ): Self = StObject.set(x, "pageTitleRender", js.Any.fromFunction3(value))
    
    inline def setPageTitleRenderUndefined: Self = StObject.set(x, "pageTitleRender", js.undefined)
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
  }
}
