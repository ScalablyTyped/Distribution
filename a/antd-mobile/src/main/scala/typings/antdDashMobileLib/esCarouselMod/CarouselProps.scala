package typings
package antdDashMobileLib.esCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps
  extends antdDashMobileLib.esCarouselPropsTypeMod.CarouselPropsType {
  var afterChange: js.UndefOr[js.Function1[/* current */ scala.Double, scala.Unit]] = js.undefined
  var beforeChange: js.UndefOr[js.Function2[/* from */ scala.Double, /* to */ scala.Double, scala.Unit]] = js.undefined
  var cellSpacing: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dotActiveStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var dotStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var easing: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var frameOverflow: js.UndefOr[IFrameOverFlow] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var slideWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var swipeSpeed: js.UndefOr[scala.Double] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    afterChange: /* current */ scala.Double => scala.Unit = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayInterval: scala.Int | scala.Double = null,
    beforeChange: (/* from */ scala.Double, /* to */ scala.Double) => scala.Unit = null,
    cellSpacing: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    dotActiveStyle: reactLib.reactMod.CSSProperties = null,
    dotStyle: reactLib.reactMod.CSSProperties = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    easing: () => scala.Unit = null,
    frameOverflow: IFrameOverFlow = null,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    initialSlideWidth: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    selectedIndex: scala.Int | scala.Double = null,
    slideWidth: java.lang.String | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    swipeSpeed: scala.Int | scala.Double = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
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

