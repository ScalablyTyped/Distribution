package typings.antDesignProLayout

import typings.antDesignProLayout.anon.Breadcrumb
import typings.antDesignProLayout.anon.Locale
import typings.antDesignProLayout.anon.ReadonlyArrayRoute
import typings.antDesignProLayout.esTypingMod.MenuDataItem
import typings.antDesignProLayout.esTypingMod.MessageDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsGetMenuDataMod {
  
  @JSImport("@ant-design/pro-layout/es/utils/getMenuData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
