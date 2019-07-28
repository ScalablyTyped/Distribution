package typings.antdDashMobile.esGridPropsTypeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataItem
  extends /* key */ StringDictionary[js.Any] {
  var icon: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
}

object DataItem {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    icon: js.Any = null,
    text: js.Any = null
  ): DataItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DataItem]
  }
}

