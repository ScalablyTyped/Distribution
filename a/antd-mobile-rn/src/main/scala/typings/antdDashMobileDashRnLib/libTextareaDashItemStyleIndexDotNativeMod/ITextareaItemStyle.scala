package typings
package antdDashMobileDashRnLib.libTextareaDashItemStyleIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextareaItemStyle extends js.Object {
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var count: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var errorIcon: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var icon: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var input: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object ITextareaItemStyle {
  @scala.inline
  def apply(
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    count: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    errorIcon: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    icon: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    input: reactDashNativeLib.reactDashNativeMod.TextStyle
  ): ITextareaItemStyle = {
    val __obj = js.Dynamic.literal(container = container, count = count, errorIcon = errorIcon, icon = icon, input = input)
  
    __obj.asInstanceOf[ITextareaItemStyle]
  }
}

