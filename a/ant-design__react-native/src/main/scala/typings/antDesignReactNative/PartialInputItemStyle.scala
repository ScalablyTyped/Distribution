package typings.antDesignReactNative

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/input-item/style.InputItemStyle> */
trait PartialInputItemStyle extends js.Object {
  var clear: js.UndefOr[ViewStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var errorIcon: js.UndefOr[ViewStyle] = js.undefined
  var extra: js.UndefOr[TextStyle] = js.undefined
  var input: js.UndefOr[TextStyle] = js.undefined
  var inputDisabled: js.UndefOr[TextStyle] = js.undefined
  var inputErrorColor: js.UndefOr[TextStyle] = js.undefined
  var text: js.UndefOr[TextStyle] = js.undefined
}

object PartialInputItemStyle {
  @scala.inline
  def apply(
    clear: ViewStyle = null,
    container: ViewStyle = null,
    errorIcon: ViewStyle = null,
    extra: TextStyle = null,
    input: TextStyle = null,
    inputDisabled: TextStyle = null,
    inputErrorColor: TextStyle = null,
    text: TextStyle = null
  ): PartialInputItemStyle = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (errorIcon != null) __obj.updateDynamic("errorIcon")(errorIcon.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputDisabled != null) __obj.updateDynamic("inputDisabled")(inputDisabled.asInstanceOf[js.Any])
    if (inputErrorColor != null) __obj.updateDynamic("inputErrorColor")(inputErrorColor.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInputItemStyle]
  }
}

