package typings.atAntDashDesignReactDashNative.libPopoverStyleMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverStyle extends js.Object {
  var arrow: ViewStyle
  var background: ViewStyle
  var content: ViewStyle
}

object PopoverStyle {
  @scala.inline
  def apply(arrow: ViewStyle, background: ViewStyle, content: ViewStyle): PopoverStyle = {
    val __obj = js.Dynamic.literal(arrow = arrow, background = background, content = content)
  
    __obj.asInstanceOf[PopoverStyle]
  }
}

