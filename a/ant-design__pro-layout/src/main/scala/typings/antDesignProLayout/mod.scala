package typings.antDesignProLayout

import typings.antDesignProLayout.anon.Breadcrumb
import typings.antDesignProLayout.anon.Locale
import typings.antDesignProLayout.anon.Tip
import typings.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import typings.antDesignProLayout.footerMod.FooterProps
import typings.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typings.antDesignProLayout.gridContentMod.GridContentProps
import typings.antDesignProLayout.headerMod.HeaderView
import typings.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps
import typings.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps
import typings.antDesignProLayout.routeContextMod.RouteContextType
import typings.antDesignProLayout.topNavHeaderMod.TopNavHeaderProps
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antDesignProLayout.typingsMod.Route
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DefaultHeader () extends HeaderView
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val BasicLayout: FC[BasicLayoutProps] = js.native
  val DefaultFooter: FC[FooterProps] = js.native
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    * @param props
    */
  val GridContent: SFC[GridContentProps] = js.native
  val PageHeaderWrapper: SFC[PageHeaderWrapperProps] = js.native
  val PageLoading: FC[Tip] = js.native
  val RouteContext: Context[RouteContextType] = js.native
  /**
    * 可视化配置组件
    * @param props
    */
  val SettingDrawer: FC[SettingDrawerProps] = js.native
  val TopNavHeader: FC[TopNavHeaderProps] = js.native
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val default: FC[BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[Route]): Breadcrumb = js.native
  def getMenuData(routes: js.Array[Route], menu: Locale): Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
}

