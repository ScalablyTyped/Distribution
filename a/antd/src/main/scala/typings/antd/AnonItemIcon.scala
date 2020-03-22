package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemIcon extends js.Object {
  var clearIcon: ReactNode
  var itemIcon: js.Object | Null
  var removeIcon: js.Object | Null
  var suffixIcon: js.Object | Null
}

object AnonItemIcon {
  @scala.inline
  def apply(
    clearIcon: ReactNode = null,
    itemIcon: js.Object = null,
    removeIcon: js.Object = null,
    suffixIcon: js.Object = null
  ): AnonItemIcon = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemIcon]
  }
}

