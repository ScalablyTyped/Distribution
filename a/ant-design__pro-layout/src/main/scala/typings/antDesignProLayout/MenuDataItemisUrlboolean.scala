package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem & {  isUrl  :boolean} */
trait MenuDataItemisUrlboolean
  extends /* key */ StringDictionary[js.Any] {
  var authority: js.UndefOr[js.Array[String] | String] = js.undefined
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
  var hideInMenu: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var isUrl: Boolean
  var key: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String | `false`] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object MenuDataItemisUrlboolean {
  @scala.inline
  def apply(
    isUrl: Boolean,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    authority: js.Array[String] | String = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined,
    hideInMenu: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode = null,
    key: String = null,
    locale: String | `false` = null,
    name: String = null,
    parentKeys: js.Array[String] = null,
    path: String = null
  ): MenuDataItemisUrlboolean = {
    val __obj = js.Dynamic.literal(isUrl = isUrl.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[MenuDataItemisUrlboolean]
  }
}

