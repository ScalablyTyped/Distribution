package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pagination extends js.Object {
  var pagination: RegisteredStyle[ViewStyle]
  var paginationX: RegisteredStyle[ViewStyle]
  var paginationY: RegisteredStyle[ViewStyle]
  var pointActiveStyle: RegisteredStyle[ViewStyle]
  var pointStyle: RegisteredStyle[ViewStyle]
  var spaceStyle: RegisteredStyle[ViewStyle]
}

object Anon_Pagination {
  @scala.inline
  def apply(
    pagination: RegisteredStyle[ViewStyle],
    paginationX: RegisteredStyle[ViewStyle],
    paginationY: RegisteredStyle[ViewStyle],
    pointActiveStyle: RegisteredStyle[ViewStyle],
    pointStyle: RegisteredStyle[ViewStyle],
    spaceStyle: RegisteredStyle[ViewStyle]
  ): Anon_Pagination = {
    val __obj = js.Dynamic.literal(pagination = pagination, paginationX = paginationX, paginationY = paginationY, pointActiveStyle = pointActiveStyle, pointStyle = pointStyle, spaceStyle = spaceStyle)
  
    __obj.asInstanceOf[Anon_Pagination]
  }
}

