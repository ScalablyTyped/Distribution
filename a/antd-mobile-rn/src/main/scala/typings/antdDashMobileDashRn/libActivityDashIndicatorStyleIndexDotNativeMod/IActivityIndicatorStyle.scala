package typings.antdDashMobileDashRn.libActivityDashIndicatorStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivityIndicatorStyle extends js.Object {
  var container: ViewStyle
  var innerContainer: ViewStyle
  var spinner: ViewStyle
  var tip: TextStyle
  var toast: TextStyle
  var wrapper: ViewStyle
}

object IActivityIndicatorStyle {
  @scala.inline
  def apply(
    container: ViewStyle,
    innerContainer: ViewStyle,
    spinner: ViewStyle,
    tip: TextStyle,
    toast: TextStyle,
    wrapper: ViewStyle
  ): IActivityIndicatorStyle = {
    val __obj = js.Dynamic.literal(container = container, innerContainer = innerContainer, spinner = spinner, tip = tip, toast = toast, wrapper = wrapper)
  
    __obj.asInstanceOf[IActivityIndicatorStyle]
  }
}

