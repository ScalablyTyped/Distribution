package typings.antd.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemIcon extends js.Object {
  var clearIcon: ReactNode
  var itemIcon: js.Object | Null
  var removeIcon: js.Object | Null
  var suffixIcon: js.Object | Null
}

object ItemIcon {
  @scala.inline
  def apply(
    clearIcon: ReactNode = null,
    itemIcon: js.Object = null,
    removeIcon: js.Object = null,
    suffixIcon: js.Object = null
  ): ItemIcon = {
    val __obj = js.Dynamic.literal(itemIcon = itemIcon.asInstanceOf[js.Any], removeIcon = removeIcon.asInstanceOf[js.Any], suffixIcon = suffixIcon.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIcon]
  }
}

