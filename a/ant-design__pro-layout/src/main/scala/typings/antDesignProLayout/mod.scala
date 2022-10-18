package typings.antDesignProLayout

import typings.antDesignProLayout.anon.Breadcrumb
import typings.antDesignProLayout.anon.Locale
import typings.antDesignProLayout.anon.PageContainerPropsprefixe
import typings.antDesignProLayout.anon.ReadonlyArrayRoute
import typings.antDesignProLayout.esComponentsFooterMod.FooterProps
import typings.antDesignProLayout.esComponentsFooterToolbarMod.FooterToolbarProps
import typings.antDesignProLayout.esComponentsGridContentMod.GridContentProps
import typings.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typings.antDesignProLayout.esComponentsPageContainerMod.PageContainerProps
import typings.antDesignProLayout.esComponentsPageHeaderMod.PageHeaderProps
import typings.antDesignProLayout.esComponentsSettingDrawerMod.SettingDrawerProps
import typings.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.PrivateSiderMenuProps
import typings.antDesignProLayout.esComponentsTopNavHeaderMod.TopNavHeaderProps
import typings.antDesignProLayout.esComponentsWaterMarkMod.WaterMarkProps
import typings.antDesignProLayout.esContextRouteContextMod.RouteContextType
import typings.antDesignProLayout.esGetPageTitleMod.GetPageTitleProps
import typings.antDesignProLayout.esProLayoutMod.ProLayoutProps
import typings.antDesignProLayout.esTypingsMod.MenuDataItem
import typings.antDesignProLayout.esTypingsMod.MessageDescriptor
import typings.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.antd.libSpinMod.SpinProps
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/pro-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout", JSImport.Default)
  @js.native
  val default: FC[ProLayoutProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultFooter")
  @js.native
  val DefaultFooter: FC[FooterProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultHeader")
  @js.native
  val DefaultHeader: FC[HeaderViewProps & PrivateSiderMenuProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "FooterToolbar")
  @js.native
  val FooterToolbar: FC[FooterToolbarProps] = js.native
  
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    *
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "GridContent")
  @js.native
  val GridContent: FC[GridContentProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageContainer")
  @js.native
  val PageContainer: FC[PageContainerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageHeader")
  @js.native
  val PageHeader: FC[PageHeaderProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageLoading")
  @js.native
  val PageLoading: FC[SpinProps & Any] = js.native
  
  /**
    * 配置与面包屑相同，只是增加了自动根据路由计算面包屑的功能。此功能必须要在 ProLayout 中使用。
    *
    * @param props
    * @returns
    */
  @JSImport("@ant-design/pro-layout", "ProBreadcrumb")
  @js.native
  val ProBreadcrumb: FC[BreadcrumbProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "ProLayout")
  @js.native
  val ProLayout: FC[ProLayoutProps] = js.native
  
  inline def ProPageHeader(props: PageContainerPropsprefixe): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ProPageHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("@ant-design/pro-layout", "RouteContext")
  @js.native
  val RouteContext: Context[RouteContextType] = js.native
  
  @JSImport("@ant-design/pro-layout", "SettingDrawer")
  @js.native
  val SettingDrawer: FC[SettingDrawerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "TopNavHeader")
  @js.native
  val TopNavHeader: FC[TopNavHeaderProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "WaterMark")
  @js.native
  val WaterMark: FC[WaterMarkProps] = js.native
  
  inline def getMenuData(routes: ReadonlyArrayRoute): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Unit,
    formatMessage: Unit,
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(routes: ReadonlyArrayRoute, menu: Locale): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Locale,
    formatMessage: Unit,
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  
  inline def getPageTitle(props: GetPageTitleProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitle")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPageTitle(props: GetPageTitleProps, ignoreTitle: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitle")(props.asInstanceOf[js.Any], ignoreTitle.asInstanceOf[js.Any])).asInstanceOf[String]
}
