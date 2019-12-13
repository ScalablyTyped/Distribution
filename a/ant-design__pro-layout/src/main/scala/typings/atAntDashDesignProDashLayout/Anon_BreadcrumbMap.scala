package typings.atAntDashDesignProDashLayout

import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.history.historyMod.Location
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreadcrumbMap extends js.Object {
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
  var location: js.UndefOr[Location[_] | Anon_PathnameString] = js.undefined
}

object Anon_BreadcrumbMap {
  @scala.inline
  def apply(
    breadcrumbMap: Map[String, MenuDataItem] = null,
    location: Location[_] | Anon_PathnameString = null
  ): Anon_BreadcrumbMap = {
    val __obj = js.Dynamic.literal()
    if (breadcrumbMap != null) __obj.updateDynamic("breadcrumbMap")(breadcrumbMap.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BreadcrumbMap]
  }
}

