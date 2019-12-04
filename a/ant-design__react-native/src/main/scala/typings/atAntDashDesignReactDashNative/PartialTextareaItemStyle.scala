package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/textarea-item/style.TextareaItemStyle> */
trait PartialTextareaItemStyle extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var count: js.UndefOr[ViewStyle] = js.undefined
  var errorIcon: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[ViewStyle] = js.undefined
  var input: js.UndefOr[TextStyle] = js.undefined
}

object PartialTextareaItemStyle {
  @scala.inline
  def apply(
    container: ViewStyle = null,
    count: ViewStyle = null,
    errorIcon: ViewStyle = null,
    icon: ViewStyle = null,
    input: TextStyle = null
  ): PartialTextareaItemStyle = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (errorIcon != null) __obj.updateDynamic("errorIcon")(errorIcon.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTextareaItemStyle]
  }
}

