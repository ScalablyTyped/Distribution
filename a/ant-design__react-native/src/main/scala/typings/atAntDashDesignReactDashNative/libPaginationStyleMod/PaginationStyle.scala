package typings.atAntDashDesignReactDashNative.libPaginationStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationStyle extends js.Object {
  var activeTextStyle: TextStyle
  var container: ViewStyle
  var indicatorStyle: ViewStyle
  var numberStyle: ViewStyle
  var pointActiveStyle: ViewStyle
  var pointStyle: ViewStyle
  var spaceStyle: ViewStyle
  var totalStyle: TextStyle
}

object PaginationStyle {
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
  ): PaginationStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle, container = container, indicatorStyle = indicatorStyle, numberStyle = numberStyle, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle, totalStyle = totalStyle)
  
    __obj.asInstanceOf[PaginationStyle]
  }
}

