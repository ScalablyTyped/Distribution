package typings
package atAntDashDesignReactDashNativeLib.libProgressStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStyle extends js.Object {
  var progressBar: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var progressOuter: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object ProgressStyle {
  @scala.inline
  def apply(
    progressBar: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    progressOuter: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): ProgressStyle = {
    val __obj = js.Dynamic.literal(progressBar = progressBar, progressOuter = progressOuter)
  
    __obj.asInstanceOf[ProgressStyle]
  }
}

