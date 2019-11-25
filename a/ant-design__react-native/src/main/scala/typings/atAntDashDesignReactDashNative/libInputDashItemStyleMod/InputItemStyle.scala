package typings.atAntDashDesignReactDashNative.libInputDashItemStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputItemStyle extends js.Object {
  var clear: ViewStyle
  var container: ViewStyle
  var errorIcon: ViewStyle
  var extra: TextStyle
  var input: TextStyle
  var inputDisabled: TextStyle
  var inputErrorColor: TextStyle
  var text: TextStyle
}

object InputItemStyle {
  @scala.inline
  def apply(
    clear: ViewStyle,
    container: ViewStyle,
    errorIcon: ViewStyle,
    extra: TextStyle,
    input: TextStyle,
    inputDisabled: TextStyle,
    inputErrorColor: TextStyle,
    text: TextStyle
  ): InputItemStyle = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], inputErrorColor = inputErrorColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputItemStyle]
  }
}

