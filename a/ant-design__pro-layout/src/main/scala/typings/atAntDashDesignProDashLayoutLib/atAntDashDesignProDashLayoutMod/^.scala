package typings
package atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BasicLayout: reactLib.reactMod.FC[atAntDashDesignProDashLayoutLib.libBasicLayoutMod.BasicLayoutProps] = js.native
  val DefaultFooter: reactLib.reactMod.FC[atAntDashDesignProDashLayoutLib.libFooterMod.FooterProps] = js.native
  val GridContent: reactLib.reactMod.SFC[atAntDashDesignProDashLayoutLib.libGridContentMod.GridContentProps] = js.native
  val PageHeaderWrapper: reactLib.reactMod.SFC[atAntDashDesignProDashLayoutLib.libPageHeaderWrapperMod.PageHeaderWrapperProps] = js.native
  val RouteContext: reactLib.reactMod.Context[atAntDashDesignProDashLayoutLib.libRouteContextMod.RouteContextType] = js.native
  val default: reactLib.reactMod.FC[atAntDashDesignProDashLayoutLib.libBasicLayoutMod.BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route]): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.libTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.libTypingsMod.MessageDescriptor, 
      java.lang.String
    ],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale
  ): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale,
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.libTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale,
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.libTypingsMod.MessageDescriptor, 
      java.lang.String
    ],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbKey = js.native
  def getPageTitle(props: atAntDashDesignProDashLayoutLib.libGetPageTitleMod.GetPageTitleProps): java.lang.String = js.native
  def getPageTitle(
    props: atAntDashDesignProDashLayoutLib.libGetPageTitleMod.GetPageTitleProps,
    ignoreTile: scala.Boolean
  ): java.lang.String = js.native
}

