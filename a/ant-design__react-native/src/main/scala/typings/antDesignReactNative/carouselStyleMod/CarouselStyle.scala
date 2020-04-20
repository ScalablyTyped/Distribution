package typings.antDesignReactNative.carouselStyleMod

import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], paginationX = paginationX.asInstanceOf[js.Any], paginationY = paginationY.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselStyle]
  }
}

