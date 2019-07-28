package typings.antdDashMobileDashRn.libPaginationStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaginationStyle extends js.Object {
  var activeTextStyle: TextStyle
  var container: ViewStyle
  var indicatorStyle: ViewStyle
  var numberStyle: ViewStyle
  var pointActiveStyle: ViewStyle
  var pointStyle: ViewStyle
  var spaceStyle: ViewStyle
  var totalStyle: TextStyle
}

object IPaginationStyle {
  @scala.inline
  def apply(
    activeTextStyle: TextStyle,
    container: ViewStyle,
    indicatorStyle: ViewStyle,
    numberStyle: ViewStyle,
    pointActiveStyle: ViewStyle,
    pointStyle: ViewStyle,
    spaceStyle: ViewStyle,
    totalStyle: TextStyle
  ): IPaginationStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle, container = container, indicatorStyle = indicatorStyle, numberStyle = numberStyle, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle, totalStyle = totalStyle)
  
    __obj.asInstanceOf[IPaginationStyle]
  }
}

