package typings.atAntDashDesignReactDashNative.esTextareaDashItemStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaItemStyle extends js.Object {
  var container: ViewStyle
  var count: ViewStyle
  var errorIcon: ViewStyle
  var icon: ViewStyle
  var input: TextStyle
}

object TextareaItemStyle {
  @scala.inline
  def apply(container: ViewStyle, count: ViewStyle, errorIcon: ViewStyle, icon: ViewStyle, input: TextStyle): TextareaItemStyle = {
    val __obj = js.Dynamic.literal(container = container, count = count, errorIcon = errorIcon, icon = icon, input = input)
  
    __obj.asInstanceOf[TextareaItemStyle]
  }
}

