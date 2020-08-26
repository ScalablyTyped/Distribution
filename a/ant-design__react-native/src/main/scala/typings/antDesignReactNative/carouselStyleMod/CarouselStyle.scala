package typings.antDesignReactNative.carouselStyleMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselStyle extends js.Object {
  var pagination: ViewStyle = js.native
  var paginationX: ViewStyle = js.native
  var paginationY: ViewStyle = js.native
  var pointActiveStyle: ViewStyle = js.native
  var pointStyle: ViewStyle = js.native
  var spaceStyle: ViewStyle = js.native
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
  @scala.inline
  implicit class CarouselStyleOps[Self <: CarouselStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPagination(value: ViewStyle): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaginationX(value: ViewStyle): Self = this.set("paginationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaginationY(value: ViewStyle): Self = this.set("paginationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointActiveStyle(value: ViewStyle): Self = this.set("pointActiveStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointStyle(value: ViewStyle): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceStyle(value: ViewStyle): Self = this.set("spaceStyle", value.asInstanceOf[js.Any])
  }
  
}

