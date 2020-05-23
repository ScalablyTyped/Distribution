package typings.antdMobile.carouselMod

import typings.antdMobile.carouselPropsTypeMod.CarouselPropsType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends CarouselPropsType {
  var afterChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
  var beforeChange: js.UndefOr[js.Function2[/* from */ Double, /* to */ Double, Unit]] = js.undefined
  var cellSpacing: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dotActiveStyle: js.UndefOr[CSSProperties] = js.undefined
  var dotStyle: js.UndefOr[CSSProperties] = js.undefined
  var easing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var frameOverflow: js.UndefOr[IFrameOverFlow] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var slideWidth: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swipeSpeed: js.UndefOr[Double] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    afterChange: /* current */ Double => Unit = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: js.UndefOr[Double] = js.undefined,
    beforeChange: (/* from */ Double, /* to */ Double) => Unit = null,
    cellSpacing: js.UndefOr[Double] = js.undefined,
    className: String = null,
    dotActiveStyle: CSSProperties = null,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    easing: () => Unit = null,
    frameOverflow: IFrameOverFlow = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: js.UndefOr[Double] = js.undefined,
    prefixCls: String = null,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    slideWidth: String | Double = null,
    style: CSSProperties = null,
    swipeSpeed: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayInterval)) __obj.updateDynamic("autoplayInterval")(autoplayInterval.get.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2(beforeChange))
    if (!js.isUndefined(cellSpacing)) __obj.updateDynamic("cellSpacing")(cellSpacing.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction0(easing))
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlideWidth)) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeSpeed)) __obj.updateDynamic("swipeSpeed")(swipeSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

