package typings
package atAntDashDesignReactDashNativeLib.libCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselPropsType
  extends atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.libCarouselStyleMod.CarouselStyle] {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayInterval: js.UndefOr[scala.Double] = js.undefined
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  var initialSlideWidth: js.UndefOr[scala.Double] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object CarouselPropsType {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayInterval: scala.Int | scala.Double = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    initialSlideWidth: scala.Int | scala.Double = null,
    selectedIndex: scala.Int | scala.Double = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libCarouselStyleMod.CarouselStyle] = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
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

