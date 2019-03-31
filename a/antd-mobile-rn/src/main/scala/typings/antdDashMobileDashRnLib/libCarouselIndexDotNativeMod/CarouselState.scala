package typings
package antdDashMobileDashRnLib.libCarouselIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselState extends js.Object {
  var autoplayEnd: scala.Boolean
  var height: scala.Double
  var isScrolling: scala.Boolean
  var loopJump: scala.Boolean
  var offset: CarouselOffset
  var selectedIndex: scala.Double
  var width: scala.Double
}

object CarouselState {
  @scala.inline
  def apply(
    autoplayEnd: scala.Boolean,
    height: scala.Double,
    isScrolling: scala.Boolean,
    loopJump: scala.Boolean,
    offset: CarouselOffset,
    selectedIndex: scala.Double,
    width: scala.Double
  ): CarouselState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd, height = height, isScrolling = isScrolling, loopJump = loopJump, offset = offset, selectedIndex = selectedIndex, width = width)
  
    __obj.asInstanceOf[CarouselState]
  }
}

