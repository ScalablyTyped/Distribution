package typings
package atAntDashDesignReactDashNativeLib.esTextareaDashItemStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaItemStyle extends js.Object {
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var count: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var errorIcon: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var icon: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var input: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object TextareaItemStyle {
  @scala.inline
  def apply(
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    count: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    errorIcon: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    icon: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    input: reactDashNativeLib.reactDashNativeMod.TextStyle
  ): TextareaItemStyle = {
    val __obj = js.Dynamic.literal(container = container, count = count, errorIcon = errorIcon, icon = icon, input = input)
  
    __obj.asInstanceOf[TextareaItemStyle]
  }
}

