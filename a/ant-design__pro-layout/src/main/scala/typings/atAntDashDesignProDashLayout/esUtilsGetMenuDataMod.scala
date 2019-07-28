package typings.atAntDashDesignProDashLayout

import typings.atAntDashDesignProDashLayout.esTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.esTypingsMod.MessageDescriptor
import typings.atAntDashDesignProDashLayout.esTypingsMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/es/utils/getMenuData", JSImport.Namespace)
@js.native
object esUtilsGetMenuDataMod extends js.Object {
  def default(routes: js.Array[Route]): Anon_Breadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def default(routes: js.Array[Route], menu: Anon_Locale): Anon_Breadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
}

