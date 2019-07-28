package typings.atAntDashDesignProDashLayout.esUtilsGetBreadcrumbPropsMod

import org.scalablytyped.runtime.StringDictionary
import typings.antd.esBreadcrumbBreadcrumbMod.Route
import typings.atAntDashDesignProDashLayout.Anon_Href
import typings.atAntDashDesignProDashLayout.Anon_Locale
import typings.atAntDashDesignProDashLayout.Anon_Pathname
import typings.atAntDashDesignProDashLayout.esTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.esTypingsMod.MessageDescriptor
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
  var breadcrumbList: js.UndefOr[js.Array[Anon_Href]] = js.undefined
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
  var location: js.UndefOr[Location[LocationState] | Anon_Pathname] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem] = null,
    breadcrumbList: js.Array[Anon_Href] = null,
    breadcrumbRender: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]] = null,
    formatMessage: /* message */ MessageDescriptor => String = null,
    home: String = null,
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode = null,
    location: Location[LocationState] | Anon_Pathname = null,
    menu: Anon_Locale = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (breadcrumbList != null) __obj.updateDynamic("breadcrumbList")(breadcrumbList)
    if (breadcrumbRender != null) __obj.updateDynamic("breadcrumbRender")(js.Any.fromFunction1(breadcrumbRender))
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (home != null) __obj.updateDynamic("home")(home)
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu)
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

