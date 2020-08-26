package typings.antdMobileRn.carouselIndexNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselState extends js.Object {
  var autoplayEnd: Boolean = js.native
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var loopJump: Boolean = js.native
  var offset: CarouselOffset = js.native
  var selectedIndex: Double = js.native
  var width: Double = js.native
}

object CarouselState {
  @scala.inline
  def apply(
    autoplayEnd: Boolean,
    height: Double,
    isScrolling: Boolean,
    loopJump: Boolean,
    offset: CarouselOffset,
    selectedIndex: Double,
    width: Double
  ): CarouselState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def setAutoplayEnd(value: Boolean): Self = this.set("autoplayEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoopJump(value: Boolean): Self = this.set("loopJump", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: CarouselOffset): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

