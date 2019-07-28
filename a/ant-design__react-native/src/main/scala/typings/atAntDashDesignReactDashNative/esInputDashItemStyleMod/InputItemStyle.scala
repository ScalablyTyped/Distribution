package typings.atAntDashDesignReactDashNative.esInputDashItemStyleMod

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
    val __obj = js.Dynamic.literal(clear = clear, container = container, errorIcon = errorIcon, extra = extra, input = input, inputDisabled = inputDisabled, inputErrorColor = inputErrorColor, text = text)
  
    __obj.asInstanceOf[InputItemStyle]
  }
}

