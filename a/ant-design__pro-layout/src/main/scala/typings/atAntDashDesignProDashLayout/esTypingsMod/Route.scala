package typings.atAntDashDesignProDashLayout.esTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends MenuDataItem {
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    path: String,
    authority: js.Array[String] | String = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined,
    hideInMenu: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    locale: String = null,
    name: String = null,
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

