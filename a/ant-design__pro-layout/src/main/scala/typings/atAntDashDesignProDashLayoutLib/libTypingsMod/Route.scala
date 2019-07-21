package typings
package atAntDashDesignProDashLayoutLib.libTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends MenuDataItem {
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    path: java.lang.String,
    authority: js.Array[java.lang.String] | java.lang.String = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[scala.Boolean] = js.undefined,
    hideInMenu: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null,
    routes: js.Array[Route] = null
  ): Route = {
    val __obj = js.Dynamic.literal(path = path)
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(hideChildrenInMenu)) __obj.updateDynamic("hideChildrenInMenu")(hideChildrenInMenu)
    if (!js.isUndefined(hideInMenu)) __obj.updateDynamic("hideInMenu")(hideInMenu)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[Route]
  }
}

