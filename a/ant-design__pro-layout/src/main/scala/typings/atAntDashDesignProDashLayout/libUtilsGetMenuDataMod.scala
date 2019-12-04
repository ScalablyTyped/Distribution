package typings.atAntDashDesignProDashLayout

import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.libTypingsMod.MessageDescriptor
import typings.atAntDashDesignProDashLayout.libTypingsMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/utils/getMenuData", JSImport.Namespace)
@js.native
object libUtilsGetMenuDataMod extends js.Object {
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

