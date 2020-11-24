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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbRender extends js.Object {
  
  var breadcrumbRender: js.UndefOr[
    js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
  ] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * 兼用 content的 margin
    */
  var disableContentMargin: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否禁用移动端模式，有的管理系统不需要移动端模式，此属性设置为true即可
    */
  var disableMobile: js.UndefOr[Boolean] = js.native
  
  var footerRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.native
  
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
  
  var isChildrenLayout: js.UndefOr[Boolean] = js.native
  
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[LocaleType] = js.native
  
  /**
    *@name logo url
    */
  var logo: js.UndefOr[ReactNode | WithFalse[js.Function0[ReactNode]]] = js.native
  
  var menuDataRender: js.UndefOr[js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]] = js.native
  
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
    ]
  ] = js.native
  
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
  
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
  ] = js.native
  
  var pageTitleRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[Id], 
        String
      ]
    ]
  ] = js.native
  
  var pure: js.UndefOr[Boolean] = js.native
}
object BreadcrumbRender {
  
  @scala.inline
  def apply(): BreadcrumbRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbRender]
  }
  
  @scala.inline
  implicit class BreadcrumbRenderOps[Self <: BreadcrumbRender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBreadcrumbRender(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): Self = this.set("breadcrumbRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreadcrumbRender: Self = this.set("breadcrumbRender", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setDisableContentMargin(value: Boolean): Self = this.set("disableContentMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableContentMargin: Self = this.set("disableContentMargin", js.undefined)
    
    @scala.inline
    def setDisableMobile(value: Boolean): Self = this.set("disableMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobile: Self = this.set("disableMobile", js.undefined)
    
    @scala.inline
    def setFooterRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = this.set("footerRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFooterRender(value: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = this.set("footerRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterRender: Self = this.set("footerRender", js.undefined)
    
    @scala.inline
    def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatMessage: Self = this.set("formatMessage", js.undefined)
    
    @scala.inline
    def setIsChildrenLayout(value: Boolean): Self = this.set("isChildrenLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChildrenLayout: Self = this.set("isChildrenLayout", js.undefined)
    
    @scala.inline
    def setItemRender(
      value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
    ): Self = this.set("itemRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteItemRender: Self = this.set("itemRender", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleType): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLogoFunction0(value: () => ReactNode): Self = this.set("logo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogo(value: ReactNode | WithFalse[js.Function0[ReactNode]]): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setMenuDataRender(value: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem]): Self = this.set("menuDataRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuDataRender: Self = this.set("menuDataRender", js.undefined)
    
    @scala.inline
    def setMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode) => ReactNode): Self = this.set("menuItemRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactNode, ReactNode]
        ]
    ): Self = this.set("menuItemRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItemRender: Self = this.set("menuItemRender", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    
    @scala.inline
    def setOnPageChange(
      value: /* location */ js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>['location'] */ js.Any) | Pathname
        ] => Unit
    ): Self = this.set("onPageChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    
    @scala.inline
    def setPageTitleRenderFunction3(
      value: (/* props */ GetPageTitleProps, /* defaultPageTitle */ js.UndefOr[String], /* info */ js.UndefOr[Id]) => String
    ): Self = this.set("pageTitleRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPageTitleRender(
      value: WithFalse[
          js.Function3[
            /* props */ GetPageTitleProps, 
            /* defaultPageTitle */ js.UndefOr[String], 
            /* info */ js.UndefOr[Id], 
            String
          ]
        ]
    ): Self = this.set("pageTitleRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageTitleRender: Self = this.set("pageTitleRender", js.undefined)
    
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
  }
}
