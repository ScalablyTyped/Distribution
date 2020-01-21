package typings.antdMobile.carouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselState extends js.Object {
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object CarouselState {
  @scala.inline
  def apply(selectedIndex: Int | Double = null): CarouselState = {
    val __obj = js.Dynamic.literal()
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselState]
  }
}

