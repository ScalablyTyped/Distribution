package typings.atAntDashDesignReactDashNative.esCheckboxStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxStyle extends js.Object {
  var agreeItem: ViewStyle
  var agreeItemCheckbox: TextStyle
  var checkboxItemCheckbox: TextStyle
  var icon: TextStyle
  var iconRight: TextStyle
  var wrapper: ViewStyle
}

object CheckboxStyle {
  @scala.inline
  def apply(
    agreeItem: ViewStyle,
    agreeItemCheckbox: TextStyle,
    checkboxItemCheckbox: TextStyle,
    icon: TextStyle,
    iconRight: TextStyle,
    wrapper: ViewStyle
  ): CheckboxStyle = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckboxStyle]
  }
}

