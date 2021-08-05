package typings.antDesignProLayout

import typings.antDesignProLayout.anon.Breadcrumb
import typings.antDesignProLayout.anon.Locale
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antDesignProLayout.typingsMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMenuDataMod {
  
  @JSImport("@ant-design/pro-layout/lib/utils/getMenuData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(routes: js.Array[Route]): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
  inline def default(
    routes: js.Array[Route],
    menu: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routes: js.Array[Route],
    menu: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routes: js.Array[Route],
    menu: Unit,
    formatMessage: Unit,
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(routes: js.Array[Route], menu: Locale): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: Unit,
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
}
