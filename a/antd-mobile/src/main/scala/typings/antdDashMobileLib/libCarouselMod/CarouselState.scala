package typings
package antdDashMobileLib.libCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselState extends js.Object {
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
}

object CarouselState {
  @scala.inline
  def apply(selectedIndex: scala.Int | scala.Double = null): CarouselState = {
    val __obj = js.Dynamic.literal()
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselState]
  }
}

