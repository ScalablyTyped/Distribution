package typings.atAntDashDesignProDashLayout.libTypingsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuDataItem
  extends /* key */ StringDictionary[js.Any] {
  var authority: js.UndefOr[js.Array[String] | String] = js.undefined
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
  var hideInMenu: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: String
}

object MenuDataItem {
  @scala.inline
  def apply(
    path: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    authority: js.Array[String] | String = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined,
    hideInMenu: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    locale: String = null,
    name: String = null
  ): MenuDataItem = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hideChildrenInMenu)) __obj.updateDynamic("hideChildrenInMenu")(hideChildrenInMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInMenu)) __obj.updateDynamic("hideInMenu")(hideInMenu.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDataItem]
  }
}

