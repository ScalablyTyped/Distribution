package typings.antdMobile.carouselPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselPropsType extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  var dots: js.UndefOr[Boolean] = js.undefined
  var infinite: js.UndefOr[Boolean] = js.undefined
  var initialSlideWidth: js.UndefOr[Double] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object CarouselPropsType {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: js.UndefOr[Double] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: js.UndefOr[Double] = js.undefined,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): CarouselPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayInterval)) __obj.updateDynamic("autoplayInterval")(autoplayInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlideWidth)) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselPropsType]
  }
}

