package typings
package atAntDashDesignProDashLayoutLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/es", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BasicLayout: reactLib.reactMod.FC[atAntDashDesignProDashLayoutLib.esBasicLayoutMod.BasicLayoutProps] = js.native
  val DefaultFooter: reactLib.reactMod.FC[atAntDashDesignProDashLayoutLib.esFooterMod.FooterProps] = js.native
  val GridContent: reactLib.reactMod.SFC[atAntDashDesignProDashLayoutLib.esGridContentMod.GridContentProps] = js.native
  val PageHeaderWrapper: reactLib.reactMod.SFC[atAntDashDesignProDashLayoutLib.esPageHeaderWrapperMod.PageHeaderWrapperProps] = js.native
  val RouteContext: reactLib.reactMod.Context[atAntDashDesignProDashLayoutLib.esRouteContextMod.RouteContextType] = js.native
  val default: reactLib.reactMod.FC[atAntDashDesignProDashLayoutLib.esBasicLayoutMod.BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route]): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor, 
      java.lang.String
    ],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale
  ): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale,
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.Route],
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale,
    formatMessage: js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor, 
      java.lang.String
    ],
    menuDataRender: js.Function1[
      /* menuData */ js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem], 
      js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
    ]
  ): atAntDashDesignProDashLayoutLib.Anon_Breadcrumb = js.native
  def getPageTitle(props: atAntDashDesignProDashLayoutLib.esGetPageTitleMod.GetPageTitleProps): java.lang.String = js.native
  def getPageTitle(
    props: atAntDashDesignProDashLayoutLib.esGetPageTitleMod.GetPageTitleProps,
    ignoreTile: scala.Boolean
  ): java.lang.String = js.native
}

