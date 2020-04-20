package typings.antdMobileRn.paginationStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaginationStyle]
  }
}

