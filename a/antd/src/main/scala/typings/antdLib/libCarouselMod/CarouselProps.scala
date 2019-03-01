package typings
package antdLib.libCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  var accessibility: js.UndefOr[scala.Boolean] = js.undefined
  var adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined
  var afterChange: js.UndefOr[js.Function1[/* current */ scala.Double, scala.Unit]] = js.undefined
  var arrows: js.UndefOr[scala.Boolean] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var autoplaySpeed: js.UndefOr[scala.Double] = js.undefined
  var beforeChange: js.UndefOr[js.Function2[/* from */ scala.Double, /* to */ scala.Double, scala.Unit]] = js.undefined
  var centerMode: js.UndefOr[scala.Boolean] = js.undefined
  var centerPadding: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssEase: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  var dotsClass: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var effect: js.UndefOr[CarouselEffect] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  var initialSlide: js.UndefOr[scala.Double] = js.undefined
  var lazyLoad: js.UndefOr[scala.Boolean] = js.undefined
  var nextArrow: js.UndefOr[reactLib.HTMLElement | js.Any] = js.undefined
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var prevArrow: js.UndefOr[reactLib.HTMLElement | js.Any] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var slickGoTo: js.UndefOr[scala.Double] = js.undefined
  var slide: js.UndefOr[java.lang.String] = js.undefined
  var slidesToScroll: js.UndefOr[scala.Double] = js.undefined
  var slidesToShow: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var swipe: js.UndefOr[scala.Boolean] = js.undefined
  var swipeToSlide: js.UndefOr[scala.Boolean] = js.undefined
  var touchMove: js.UndefOr[scala.Boolean] = js.undefined
  var touchThreshold: js.UndefOr[scala.Double] = js.undefined
  var useCSS: js.UndefOr[scala.Boolean] = js.undefined
  var variableWidth: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    accessibility: js.UndefOr[scala.Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined,
    afterChange: js.Function1[/* current */ scala.Double, scala.Unit] = null,
    arrows: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplaySpeed: scala.Int | scala.Double = null,
    beforeChange: js.Function2[/* from */ scala.Double, /* to */ scala.Double, scala.Unit] = null,
    centerMode: js.UndefOr[scala.Boolean] = js.undefined,
    centerPadding: java.lang.String | js.Any = null,
    className: java.lang.String = null,
    cssEase: java.lang.String | js.Any = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    dotsClass: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    easing: java.lang.String = null,
    effect: CarouselEffect = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    initialSlide: scala.Int | scala.Double = null,
    lazyLoad: js.UndefOr[scala.Boolean] = js.undefined,
    nextArrow: reactLib.HTMLElement | js.Any = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    prevArrow: reactLib.HTMLElement | js.Any = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    slickGoTo: scala.Int | scala.Double = null,
    slide: java.lang.String = null,
    slidesToScroll: scala.Int | scala.Double = null,
    slidesToShow: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    swipe: js.UndefOr[scala.Boolean] = js.undefined,
    swipeToSlide: js.UndefOr[scala.Boolean] = js.undefined,
    touchMove: js.UndefOr[scala.Boolean] = js.undefined,
    touchThreshold: scala.Int | scala.Double = null,
    useCSS: js.UndefOr[scala.Boolean] = js.undefined,
    variableWidth: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight)
    if (afterChange != null) __obj.updateDynamic("afterChange")(afterChange)
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(beforeChange)
    if (!js.isUndefined(centerMode)) __obj.updateDynamic("centerMode")(centerMode)
    if (centerPadding != null) __obj.updateDynamic("centerPadding")(centerPadding.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssEase != null) __obj.updateDynamic("cssEase")(cssEase.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (slickGoTo != null) __obj.updateDynamic("slickGoTo")(slickGoTo.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe)
    if (!js.isUndefined(swipeToSlide)) __obj.updateDynamic("swipeToSlide")(swipeToSlide)
    if (!js.isUndefined(touchMove)) __obj.updateDynamic("touchMove")(touchMove)
    if (touchThreshold != null) __obj.updateDynamic("touchThreshold")(touchThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS)
    if (!js.isUndefined(variableWidth)) __obj.updateDynamic("variableWidth")(variableWidth)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[CarouselProps]
  }
}

