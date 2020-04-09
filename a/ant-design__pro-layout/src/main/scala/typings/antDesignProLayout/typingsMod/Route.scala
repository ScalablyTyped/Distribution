package typings.antDesignProLayout.typingsMod

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends MenuDataItem {
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    authority: js.Array[String] | String = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined,
    hideInMenu: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode = null,
    key: String = null,
    locale: String | `false` = null,
    name: String = null,
    parentKeys: js.Array[String] = null,
    path: String = null,
    routes: js.Array[Route] = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hideChildrenInMenu)) __obj.updateDynamic("hideChildrenInMenu")(hideChildrenInMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInMenu)) __obj.updateDynamic("hideInMenu")(hideInMenu.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentKeys != null) __obj.updateDynamic("parentKeys")(parentKeys.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

