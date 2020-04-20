package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrows extends js.Object {
  var arrows: Boolean
  var autoplay: Boolean
  var cellAlign: String
  var dots: Boolean
  var infinite: Boolean
  var prefixCls: String
  var selectedIndex: Double
}

object AnonArrows {
  @scala.inline
  def apply(
    arrows: Boolean,
    autoplay: Boolean,
    cellAlign: String,
    dots: Boolean,
    infinite: Boolean,
    prefixCls: String,
    selectedIndex: Double
  ): AnonArrows = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], cellAlign = cellAlign.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrows]
  }
}

