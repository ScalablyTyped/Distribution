package typings.antdDashMobileDashRn.libCheckboxStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    val __obj = js.Dynamic.literal(agreeItem = agreeItem, agreeItemCheckbox = agreeItemCheckbox, checkboxItemCheckbox = checkboxItemCheckbox, icon = icon, iconRight = iconRight, wrapper = wrapper)
  
    __obj.asInstanceOf[ICheckboxStyle]
  }
}

