package typings.atAntDashDesignReactDashNative.libCarouselMod

import typings.atAntDashDesignReactDashNative.libCarouselStyleMod.CarouselStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselPropsType extends WithThemeStyles[CarouselStyle] {
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
    autoplayInterval: Int | Double = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: Int | Double = null,
    selectedIndex: Int | Double = null,
    styles: Partial[CarouselStyle] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): CarouselPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[CarouselPropsType]
  }
}

