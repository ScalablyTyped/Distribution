package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgreeItem extends js.Object {
  var agreeItem: RegisteredStyle[ViewStyle]
  var agreeItemCheckbox: RegisteredStyle[TextStyle]
  var checkboxItemCheckbox: RegisteredStyle[TextStyle]
  var icon: RegisteredStyle[TextStyle]
  var iconRight: RegisteredStyle[TextStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object Anon_AgreeItem {
  @scala.inline
  def apply(
    agreeItem: RegisteredStyle[ViewStyle],
    agreeItemCheckbox: RegisteredStyle[TextStyle],
    checkboxItemCheckbox: RegisteredStyle[TextStyle],
    icon: RegisteredStyle[TextStyle],
    iconRight: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): Anon_AgreeItem = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem, agreeItemCheckbox = agreeItemCheckbox, checkboxItemCheckbox = checkboxItemCheckbox, icon = icon, iconRight = iconRight, wrapper = wrapper)
  
    __obj.asInstanceOf[Anon_AgreeItem]
  }
}

