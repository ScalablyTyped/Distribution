package typings
package atAntDashDesignReactDashNativeLib.libCheckboxStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxStyle extends js.Object {
  var agreeItem: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var agreeItemCheckbox: reactDashNativeLib.reactDashNativeMod.TextStyle
  var checkboxItemCheckbox: reactDashNativeLib.reactDashNativeMod.TextStyle
  var icon: reactDashNativeLib.reactDashNativeMod.TextStyle
  var iconRight: reactDashNativeLib.reactDashNativeMod.TextStyle
  var wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object CheckboxStyle {
  @scala.inline
  def apply(
    agreeItem: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    agreeItemCheckbox: reactDashNativeLib.reactDashNativeMod.TextStyle,
    checkboxItemCheckbox: reactDashNativeLib.reactDashNativeMod.TextStyle,
    icon: reactDashNativeLib.reactDashNativeMod.TextStyle,
    iconRight: reactDashNativeLib.reactDashNativeMod.TextStyle,
    wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): CheckboxStyle = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem, agreeItemCheckbox = agreeItemCheckbox, checkboxItemCheckbox = checkboxItemCheckbox, icon = icon, iconRight = iconRight, wrapper = wrapper)
  
    __obj.asInstanceOf[CheckboxStyle]
  }
}

