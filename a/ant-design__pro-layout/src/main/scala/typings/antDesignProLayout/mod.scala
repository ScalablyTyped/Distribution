package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.Breadcrumb
import typings.antDesignProLayout.anon.Locale
import typings.antDesignProLayout.anon.Tip
import typings.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import typings.antDesignProLayout.footerMod.FooterProps
import typings.antDesignProLayout.footerToolbarMod.FooterToolbarProps
import typings.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typings.antDesignProLayout.gridContentMod.GridContentProps
import typings.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps
import typings.antDesignProLayout.pageContainerMod.PageContainerProps
import typings.antDesignProLayout.routeContextMod.RouteContextType
import typings.antDesignProLayout.topNavHeaderMod.TopNavHeaderProps
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antDesignProLayout.typingsMod.Route
import typings.react.mod.Context
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  @JSImport("@ant-design/pro-layout", JSImport.Default)
  @js.native
  val default: FC[BasicLayoutProps] = js.native
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "BasicLayout")
  @js.native
  val BasicLayout: FC[BasicLayoutProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultFooter")
  @js.native
  val DefaultFooter: FC[FooterProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultHeader")
  @js.native
  class DefaultHeader ()
    extends typings.antDesignProLayout.headerMod.default
  
  @JSImport("@ant-design/pro-layout", "FooterToolbar")
  @js.native
  val FooterToolbar: FC[FooterToolbarProps] = js.native
  
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "GridContent")
  @js.native
  val GridContent: FC[GridContentProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageContainer")
  @js.native
  val PageContainer: FC[PageContainerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageHeaderWrapper")
  @js.native
  val PageHeaderWrapper: FC[PageContainerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageLoading")
  @js.native
  val PageLoading: FC[Tip] = js.native
  
  @JSImport("@ant-design/pro-layout", "RouteContext")
  @js.native
  val RouteContext: Context[RouteContextType] = js.native
  
  /**
    * 可视化配置组件
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "SettingDrawer")
  @js.native
  val SettingDrawer: FC[SettingDrawerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "TopNavHeader")
  @js.native
  val TopNavHeader: FC[TopNavHeaderProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(routes: js.Array[Route]): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(routes: js.Array[Route], menu: Locale): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  
  @JSImport("@ant-design/pro-layout", "getPageTitle")
  @js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  @JSImport("@ant-design/pro-layout", "getPageTitle")
  @js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
  
  type _To = FC[BasicLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[BasicLayoutProps] = default
}
