package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearIcon extends js.Object {
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var menuItemSelectedIcon: js.UndefOr[ReactNode] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var removeIcon: js.UndefOr[ReactNode] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
}

object AnonClearIcon {
  @scala.inline
  def apply(
    clearIcon: ReactNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuItemSelectedIcon: ReactNode = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    removeIcon: ReactNode = null,
    suffixIcon: ReactNode = null
  ): AnonClearIcon = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClearIcon]
  }
}

