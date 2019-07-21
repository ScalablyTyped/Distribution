package typings
package atAntDashDesignReactDashNativeLib.libPopoverStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverStyle extends js.Object {
  var arrow: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var background: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var content: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object PopoverStyle {
  @scala.inline
  def apply(
    arrow: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    background: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    content: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): PopoverStyle = {
    val __obj = js.Dynamic.literal(arrow = arrow, background = background, content = content)
  
    __obj.asInstanceOf[PopoverStyle]
  }
}

