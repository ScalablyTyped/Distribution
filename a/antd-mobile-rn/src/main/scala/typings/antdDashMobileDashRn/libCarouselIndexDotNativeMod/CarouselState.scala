package typings.antdDashMobileDashRn.libCarouselIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselState extends js.Object {
  var autoplayEnd: Boolean
  var height: Double
  var isScrolling: Boolean
  var loopJump: Boolean
  var offset: CarouselOffset
  var selectedIndex: Double
  var width: Double
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
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd, height = height, isScrolling = isScrolling, loopJump = loopJump, offset = offset, selectedIndex = selectedIndex, width = width)
  
    __obj.asInstanceOf[CarouselState]
  }
}

