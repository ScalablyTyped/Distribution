package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem & {  isUrl  :boolean} */
trait MenuDataItemisUrlbooleanAuthority
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var authority: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var children: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]] = js.undefined
  var hideChildrenInMenu: js.UndefOr[scala.Boolean] = js.undefined
  var hideInMenu: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var isUrl: scala.Boolean
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
}

object MenuDataItemisUrlbooleanAuthority {
  @scala.inline
  def apply(
    isUrl: scala.Boolean,
    path: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    authority: js.Array[java.lang.String] | java.lang.String = null,
    children: js.Array[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[scala.Boolean] = js.undefined,
    hideInMenu: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null
  ): MenuDataItemisUrlbooleanAuthority = {
    val __obj = js.Dynamic.literal(isUrl = isUrl, path = path)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(hideChildrenInMenu)) __obj.updateDynamic("hideChildrenInMenu")(hideChildrenInMenu)
    if (!js.isUndefined(hideInMenu)) __obj.updateDynamic("hideInMenu")(hideInMenu)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MenuDataItemisUrlbooleanAuthority]
  }
}

