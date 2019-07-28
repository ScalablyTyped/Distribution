package typings.atAntDashDesignProDashLayout

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.history.historyMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreadcrumbLocationPath extends js.Object {
  var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
  var location: js.UndefOr[Location[_] | Anon_PathnameString] = js.undefined
}

object Anon_BreadcrumbLocationPath {
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem] = null,
    location: Location[_] | Anon_PathnameString = null
  ): Anon_BreadcrumbLocationPath = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BreadcrumbLocationPath]
  }
}

