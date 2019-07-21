package typings
package atAntDashDesignProDashLayoutLib.esUtilsGetBreadcrumbPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var breadcrumb: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
  ] = js.undefined
  var breadcrumbList: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.Anon_Href]] = js.undefined
  var breadcrumbRender: js.UndefOr[
    js.Function1[
      /* routers */ js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]], 
      js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]]
    ]
  ] = js.undefined
  var formatMessage: js.UndefOr[
    js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ] = js.undefined
  var home: js.UndefOr[java.lang.String] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ antdLib.esBreadcrumbBreadcrumbMod.Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route], 
      /* paths */ js.Array[java.lang.String], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var location: js.UndefOr[
    historyLib.historyMod.Location[historyLib.historyMod.LocationState] | atAntDashDesignProDashLayoutLib.Anon_Pathname
  ] = js.undefined
  var menu: js.UndefOr[atAntDashDesignProDashLayoutLib.Anon_Locale] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem] = null,
    breadcrumbList: js.Array[atAntDashDesignProDashLayoutLib.Anon_Href] = null,
    breadcrumbRender: /* routers */ js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]] => js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]] = null,
    formatMessage: /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor => java.lang.String = null,
    home: java.lang.String = null,
    itemRender: (/* route */ antdLib.esBreadcrumbBreadcrumbMod.Route, /* params */ js.Any, /* routes */ js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route], /* paths */ js.Array[java.lang.String]) => reactLib.reactMod.ReactNode = null,
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] | atAntDashDesignProDashLayoutLib.Anon_Pathname = null,
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale = null
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

