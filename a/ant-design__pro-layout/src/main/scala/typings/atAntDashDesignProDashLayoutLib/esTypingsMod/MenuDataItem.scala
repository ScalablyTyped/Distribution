package typings
package atAntDashDesignProDashLayoutLib.esTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuDataItem
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var authority: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var hideChildrenInMenu: js.UndefOr[scala.Boolean] = js.undefined
  var hideInMenu: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
}

object MenuDataItem {
  @scala.inline
  def apply(
    path: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    authority: js.Array[java.lang.String] | java.lang.String = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[scala.Boolean] = js.undefined,
    hideInMenu: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null
  ): MenuDataItem = {
    val __obj = js.Dynamic.literal(path = path)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(hideChildrenInMenu)) __obj.updateDynamic("hideChildrenInMenu")(hideChildrenInMenu)
    if (!js.isUndefined(hideInMenu)) __obj.updateDynamic("hideInMenu")(hideInMenu)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MenuDataItem]
  }
}

