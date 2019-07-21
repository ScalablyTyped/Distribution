package typings
package atAntDashDesignReactDashNativeLib.esGridStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridStyle extends js.Object {
  var grayBorderBox: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var icon: reactDashNativeLib.reactDashNativeMod.ImageStyle
  var text: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object GridStyle {
  @scala.inline
  def apply(
    grayBorderBox: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    icon: reactDashNativeLib.reactDashNativeMod.ImageStyle,
    text: reactDashNativeLib.reactDashNativeMod.TextStyle
  ): GridStyle = {
    val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox, icon = icon, text = text)
  
    __obj.asInstanceOf[GridStyle]
  }
}

