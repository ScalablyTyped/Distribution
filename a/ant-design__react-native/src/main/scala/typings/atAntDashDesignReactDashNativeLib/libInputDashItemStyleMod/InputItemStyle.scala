package typings
package atAntDashDesignReactDashNativeLib.libInputDashItemStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputItemStyle extends js.Object {
  var clear: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var errorIcon: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var extra: reactDashNativeLib.reactDashNativeMod.TextStyle
  var input: reactDashNativeLib.reactDashNativeMod.TextStyle
  var inputDisabled: reactDashNativeLib.reactDashNativeMod.TextStyle
  var inputErrorColor: reactDashNativeLib.reactDashNativeMod.TextStyle
  var text: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object InputItemStyle {
  @scala.inline
  def apply(
    clear: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    errorIcon: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    extra: reactDashNativeLib.reactDashNativeMod.TextStyle,
    input: reactDashNativeLib.reactDashNativeMod.TextStyle,
    inputDisabled: reactDashNativeLib.reactDashNativeMod.TextStyle,
    inputErrorColor: reactDashNativeLib.reactDashNativeMod.TextStyle,
    text: reactDashNativeLib.reactDashNativeMod.TextStyle
  ): InputItemStyle = {
    val __obj = js.Dynamic.literal(clear = clear, container = container, errorIcon = errorIcon, extra = extra, input = input, inputDisabled = inputDisabled, inputErrorColor = inputErrorColor, text = text)
  
    __obj.asInstanceOf[InputItemStyle]
  }
}

