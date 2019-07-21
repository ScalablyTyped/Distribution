package typings
package atAntDashDesignReactDashNativeLib.libCarouselStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselStyle extends js.Object {
  var pagination: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var paginationX: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var paginationY: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var pointActiveStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var pointStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var spaceStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object CarouselStyle {
  @scala.inline
  def apply(
    pagination: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    paginationX: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    paginationY: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    pointActiveStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    pointStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    spaceStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): CarouselStyle = {
    val __obj = js.Dynamic.literal(pagination = pagination, paginationX = paginationX, paginationY = paginationY, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle)
  
    __obj.asInstanceOf[CarouselStyle]
  }
}

