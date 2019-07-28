package typings.atAntDashDesignReactDashNative.libCheckboxStyleMod

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
    val __obj = js.Dynamic.literal(agreeItem = agreeItem, agreeItemCheckbox = agreeItemCheckbox, checkboxItemCheckbox = checkboxItemCheckbox, icon = icon, iconRight = iconRight, wrapper = wrapper)
  
    __obj.asInstanceOf[CheckboxStyle]
  }
}

