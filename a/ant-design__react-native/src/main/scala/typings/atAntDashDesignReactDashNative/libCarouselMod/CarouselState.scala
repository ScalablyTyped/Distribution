package typings.atAntDashDesignReactDashNative.libCarouselMod

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
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CarouselState]
  }
}

