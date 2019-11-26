package typings.atAntDashDesignProDashLayout

import typings.atAntDashDesignProDashLayout.esBasicLayoutMod.BasicLayoutProps
import typings.atAntDashDesignProDashLayout.esFooterMod.FooterProps
import typings.atAntDashDesignProDashLayout.esGetPageTitleMod.GetPageTitleProps
import typings.atAntDashDesignProDashLayout.esGridContentMod.GridContentProps
import typings.atAntDashDesignProDashLayout.esHeaderMod.HeaderView
import typings.atAntDashDesignProDashLayout.esPageHeaderWrapperMod.PageHeaderWrapperProps
import typings.atAntDashDesignProDashLayout.esRouteContextMod.RouteContextType
import typings.atAntDashDesignProDashLayout.esSettingDrawerMod.SettingDrawerProps
import typings.atAntDashDesignProDashLayout.esSettingDrawerMod.SettingDrawerState
import typings.atAntDashDesignProDashLayout.esTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.esTypingsMod.MessageDescriptor
import typings.atAntDashDesignProDashLayout.esTypingsMod.Route
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class DefaultHeader () extends HeaderView
  
  @js.native
  class SettingDrawer ()
    extends typings.atAntDashDesignProDashLayout.esSettingDrawerMod.default
  
  @js.native
  class TopNavHeader ()
    extends typings.atAntDashDesignProDashLayout.esTopNavHeaderMod.TopNavHeader
  
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
  val RouteContext: Context[RouteContextType] = js.native
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val default: FC[BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[Route]): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(routes: js.Array[Route], menu: Anon_Locale): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
  /* static members */
  @js.native
  object SettingDrawer extends js.Object {
    def getDerivedStateFromProps(props: SettingDrawerProps): SettingDrawerState | Null = js.native
  }
  
}

