package typings
package atAntDashDesignReactDashNativeLib.libImageDashPickerCameraRollPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollPickerStyle extends js.Object {
  var marker: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var row: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var spinner: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object CameraRollPickerStyle {
  @scala.inline
  def apply(
    marker: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    row: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    spinner: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): CameraRollPickerStyle = {
    val __obj = js.Dynamic.literal(marker = marker, row = row, spinner = spinner, wrapper = wrapper)
  
    __obj.asInstanceOf[CameraRollPickerStyle]
  }
}

