package typings
package atAntDashDesignReactDashNativeLib.libPaginationStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationStyle extends js.Object {
  var activeTextStyle: reactDashNativeLib.reactDashNativeMod.TextStyle
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var indicatorStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var numberStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var pointActiveStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var pointStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var spaceStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var totalStyle: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object PaginationStyle {
  @scala.inline
  def apply(
    activeTextStyle: reactDashNativeLib.reactDashNativeMod.TextStyle,
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    numberStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    pointActiveStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    pointStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    spaceStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    totalStyle: reactDashNativeLib.reactDashNativeMod.TextStyle
  ): PaginationStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle, container = container, indicatorStyle = indicatorStyle, numberStyle = numberStyle, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle, totalStyle = totalStyle)
  
    __obj.asInstanceOf[PaginationStyle]
  }
}

