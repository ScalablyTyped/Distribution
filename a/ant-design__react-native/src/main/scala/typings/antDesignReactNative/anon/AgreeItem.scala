package typings.antDesignReactNative.anon

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgreeItem extends js.Object {
  var agreeItem: RegisteredStyle[ViewStyle]
  var agreeItemCheckbox: RegisteredStyle[TextStyle]
  var checkboxItemCheckbox: RegisteredStyle[TextStyle]
  var icon: RegisteredStyle[TextStyle]
  var iconRight: RegisteredStyle[TextStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object AgreeItem {
  @scala.inline
  def apply(
    agreeItem: RegisteredStyle[ViewStyle],
    agreeItemCheckbox: RegisteredStyle[TextStyle],
    checkboxItemCheckbox: RegisteredStyle[TextStyle],
    icon: RegisteredStyle[TextStyle],
    iconRight: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): AgreeItem = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgreeItem]
  }
}

