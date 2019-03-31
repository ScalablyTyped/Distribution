package typings
package antdDashMobileDashRnLib.libPaginationStyleIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaginationStyle extends js.Object {
  var activeTextStyle: reactDashNativeLib.reactDashNativeMod.TextStyle
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var indicatorStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var numberStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var pointActiveStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var pointStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var spaceStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var totalStyle: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object IPaginationStyle {
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
  ): IPaginationStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle, container = container, indicatorStyle = indicatorStyle, numberStyle = numberStyle, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle, totalStyle = totalStyle)
  
    __obj.asInstanceOf[IPaginationStyle]
  }
}

