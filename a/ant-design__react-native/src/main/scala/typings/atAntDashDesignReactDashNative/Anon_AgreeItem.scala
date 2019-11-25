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
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AgreeItem]
  }
}

