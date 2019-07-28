package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTextStyle extends js.Object {
  var activeTextStyle: RegisteredStyle[TextStyle]
  var container: RegisteredStyle[ViewStyle]
  var indicatorStyle: RegisteredStyle[ViewStyle]
  var numberStyle: RegisteredStyle[ViewStyle]
  var pointActiveStyle: RegisteredStyle[ViewStyle]
  var pointStyle: RegisteredStyle[ViewStyle]
  var spaceStyle: RegisteredStyle[ViewStyle]
  var totalStyle: RegisteredStyle[TextStyle]
}

object Anon_ActiveTextStyle {
  @scala.inline
  def apply(
    activeTextStyle: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    indicatorStyle: RegisteredStyle[ViewStyle],
    numberStyle: RegisteredStyle[ViewStyle],
    pointActiveStyle: RegisteredStyle[ViewStyle],
    pointStyle: RegisteredStyle[ViewStyle],
    spaceStyle: RegisteredStyle[ViewStyle],
    totalStyle: RegisteredStyle[TextStyle]
  ): Anon_ActiveTextStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle, container = container, indicatorStyle = indicatorStyle, numberStyle = numberStyle, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle, totalStyle = totalStyle)
  
    __obj.asInstanceOf[Anon_ActiveTextStyle]
  }
}

