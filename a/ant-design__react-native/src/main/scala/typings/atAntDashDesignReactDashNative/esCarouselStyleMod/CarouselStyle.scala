package typings.atAntDashDesignReactDashNative.esCarouselStyleMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselStyle extends js.Object {
  var pagination: ViewStyle
  var paginationX: ViewStyle
  var paginationY: ViewStyle
  var pointActiveStyle: ViewStyle
  var pointStyle: ViewStyle
  var spaceStyle: ViewStyle
}

object CarouselStyle {
  @scala.inline
  def apply(
    pagination: ViewStyle,
    paginationX: ViewStyle,
    paginationY: ViewStyle,
    pointActiveStyle: ViewStyle,
    pointStyle: ViewStyle,
    spaceStyle: ViewStyle
  ): CarouselStyle = {
    val __obj = js.Dynamic.literal(pagination = pagination, paginationX = paginationX, paginationY = paginationY, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle)
  
    __obj.asInstanceOf[CarouselStyle]
  }
}

