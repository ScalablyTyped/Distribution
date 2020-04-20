package typings.antdMobileRn.checkboxStyleIndexNativeMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxStyle extends js.Object {
  var agreeItem: ViewStyle
  var agreeItemCheckbox: ViewStyle
  var checkboxItemCheckbox: ViewStyle
  var icon: ViewStyle
  var iconRight: ViewStyle
  var wrapper: ViewStyle
}

object ICheckboxStyle {
  @scala.inline
  def apply(
    agreeItem: ViewStyle,
    agreeItemCheckbox: ViewStyle,
    checkboxItemCheckbox: ViewStyle,
    icon: ViewStyle,
    iconRight: ViewStyle,
    wrapper: ViewStyle
  ): ICheckboxStyle = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxStyle]
  }
}

