package typings.antDesignReactNative.carouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselState extends js.Object {
  var isScrolling: Boolean = js.native
  var selectedIndex: Double = js.native
}

object CarouselState {
  @scala.inline
  def apply(isScrolling: Boolean, selectedIndex: Double): CarouselState = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselState]
  }
  @scala.inline
  implicit class CarouselStateOps[Self <: CarouselState] (val x: Self) extends AnyVal {
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
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
  }
  
}

