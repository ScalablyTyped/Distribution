package typings.atAntDashDesignProDashLayout

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignProDashLayout.esTypingsMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/es/typings.MenuDataItem & {  isUrl  :boolean} */
trait MenuDataItemisUrlboolean
  extends /* key */ StringDictionary[js.Any] {
  var authority: js.UndefOr[js.Array[String] | String] = js.undefined
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
  var hideInMenu: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var isUrl: Boolean
  var locale: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: String
}

object MenuDataItemisUrlboolean {
  @scala.inline
  def apply(
    isUrl: Boolean,
    path: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    authority: js.Array[String] | String = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined,
    hideInMenu: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    locale: String = null,
    name: String = null
  ): MenuDataItemisUrlboolean = {
    val __obj = js.Dynamic.literal(isUrl = isUrl, path = path)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(hideChildrenInMenu)) __obj.updateDynamic("hideChildrenInMenu")(hideChildrenInMenu)
    if (!js.isUndefined(hideInMenu)) __obj.updateDynamic("hideInMenu")(hideInMenu)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MenuDataItemisUrlboolean]
  }
}

