package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreadcrumbLocation extends js.Object {
  var breadcrumb: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
  ] = js.undefined
  var location: js.UndefOr[historyLib.historyMod.Location[_] | Anon_PathnameString] = js.undefined
}

object Anon_BreadcrumbLocation {
  @scala.inline
  def apply(
    breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem] = null,
    location: historyLib.historyMod.Location[_] | Anon_PathnameString = null
  ): Anon_BreadcrumbLocation = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BreadcrumbLocation]
  }
}

