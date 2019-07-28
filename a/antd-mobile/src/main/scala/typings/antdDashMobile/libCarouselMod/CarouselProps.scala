package typings.antdDashMobile.libCarouselMod

import typings.antdDashMobile.libCarouselPropsTypeMod.CarouselPropsType
import typings.react.reactMod.CSSProperties
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
    autoplayInterval: Int | Double = null,
    beforeChange: (/* from */ Double, /* to */ Double) => Unit = null,
    cellSpacing: Int | Double = null,
    className: String = null,
    dotActiveStyle: CSSProperties = null,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    easing: () => Unit = null,
    frameOverflow: IFrameOverFlow = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: Int | Double = null,
    prefixCls: String = null,
    selectedIndex: Int | Double = null,
    slideWidth: String | Double = null,
    style: CSSProperties = null,
    swipeSpeed: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2(beforeChange))
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle)
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction0(easing))
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (swipeSpeed != null) __obj.updateDynamic("swipeSpeed")(swipeSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[CarouselProps]
  }
}

