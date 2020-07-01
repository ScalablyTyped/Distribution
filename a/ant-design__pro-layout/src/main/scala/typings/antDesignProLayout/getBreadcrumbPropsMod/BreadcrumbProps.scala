package typings.antDesignProLayout.getBreadcrumbPropsMod

import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.anon.Href
import typings.antDesignProLayout.anon.Pathname
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antd.breadcrumbBreadcrumbMod.Route
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ReactNode
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var breadcrumbList: js.UndefOr[js.Array[Href]] = js.undefined
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
  var breadcrumbRender: js.UndefOr[
    js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
  ] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  var home: js.UndefOr[String] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.undefined
  var location: js.UndefOr[Location[LocationState] | Pathname] = js.undefined
  var menu: js.UndefOr[DefaultOpenAll] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    breadcrumbList: js.Array[Href] = null,
    breadcrumbMap: Map[String, MenuDataItem] = null,
    breadcrumbRender: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]] = null,
    formatMessage: /* message */ MessageDescriptor => String = null,
    home: String = null,
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode = null,
    location: Location[LocationState] | Pathname = null,
    menu: DefaultOpenAll = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (breadcrumbList != null) __obj.updateDynamic("breadcrumbList")(breadcrumbList.asInstanceOf[js.Any])
    if (breadcrumbMap != null) __obj.updateDynamic("breadcrumbMap")(breadcrumbMap.asInstanceOf[js.Any])
    if (breadcrumbRender != null) __obj.updateDynamic("breadcrumbRender")(js.Any.fromFunction1(breadcrumbRender))
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

