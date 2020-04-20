package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagination extends js.Object {
  var pagination: RegisteredStyle[ViewStyle]
  var paginationX: RegisteredStyle[ViewStyle]
  var paginationY: RegisteredStyle[ViewStyle]
  var pointActiveStyle: RegisteredStyle[ViewStyle]
  var pointStyle: RegisteredStyle[ViewStyle]
  var spaceStyle: RegisteredStyle[ViewStyle]
}

object AnonPagination {
  @scala.inline
  def apply(
    pagination: RegisteredStyle[ViewStyle],
    paginationX: RegisteredStyle[ViewStyle],
    paginationY: RegisteredStyle[ViewStyle],
    pointActiveStyle: RegisteredStyle[ViewStyle],
    pointStyle: RegisteredStyle[ViewStyle],
    spaceStyle: RegisteredStyle[ViewStyle]
  ): AnonPagination = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], paginationX = paginationX.asInstanceOf[js.Any], paginationY = paginationY.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPagination]
  }
}

