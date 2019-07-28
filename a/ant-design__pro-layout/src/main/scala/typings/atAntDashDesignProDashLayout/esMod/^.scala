package typings.atAntDashDesignProDashLayout.esMod

import typings.atAntDashDesignProDashLayout.Anon_Breadcrumb
import typings.atAntDashDesignProDashLayout.Anon_Locale
import typings.atAntDashDesignProDashLayout.esBasicLayoutMod.BasicLayoutProps
import typings.atAntDashDesignProDashLayout.esFooterMod.FooterProps
import typings.atAntDashDesignProDashLayout.esGetPageTitleMod.GetPageTitleProps
import typings.atAntDashDesignProDashLayout.esGridContentMod.GridContentProps
import typings.atAntDashDesignProDashLayout.esPageHeaderWrapperMod.PageHeaderWrapperProps
import typings.atAntDashDesignProDashLayout.esRouteContextMod.RouteContextType
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
object ^ extends js.Object {
  val BasicLayout: FC[BasicLayoutProps] = js.native
  val DefaultFooter: FC[FooterProps] = js.native
  val GridContent: SFC[GridContentProps] = js.native
  val PageHeaderWrapper: SFC[PageHeaderWrapperProps] = js.native
  val RouteContext: Context[RouteContextType] = js.native
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
}

