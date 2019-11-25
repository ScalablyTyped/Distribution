package typings.antdDashMobileDashRn.libTextareaDashItemStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextareaItemStyle extends js.Object {
  var container: ViewStyle
  var count: ViewStyle
  var errorIcon: ViewStyle
  var icon: ViewStyle
  var input: TextStyle
}

object ITextareaItemStyle {
  @scala.inline
  def apply(container: ViewStyle, count: ViewStyle, errorIcon: ViewStyle, icon: ViewStyle, input: TextStyle): ITextareaItemStyle = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITextareaItemStyle]
  }
}

