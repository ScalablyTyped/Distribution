package typings.antd.libCarouselMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import typings.reactDashSlick.reactDashSlickMod.LazyLoadTypes
import typings.reactDashSlick.reactDashSlickMod.ResponsiveObject
import typings.reactDashSlick.reactDashSlickMod.Settings
import typings.reactDashSlick.reactDashSlickMod.Slider
import typings.reactDashSlick.reactDashSlickMod.SwipeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends Settings {
  var children: js.UndefOr[ReactNode] = js.undefined
  var dotPosition: js.UndefOr[DotPosition] = js.undefined
  var effect: js.UndefOr[CarouselEffect] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var slickGoTo: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    accessibility: js.UndefOr[Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[Boolean] = js.undefined,
    afterChange: /* currentSlide */ Double => Unit = null,
    appendDots: /* dots */ ReactNode => Element = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    asNavFor: Slider = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Int | Double = null,
    beforeChange: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit = null,
    centerMode: js.UndefOr[Boolean] = js.undefined,
    centerPadding: String = null,
    children: ReactNode = null,
    className: String = null,
    cssEase: String = null,
    customPaging: /* index */ Double => Element = null,
    dotPosition: DotPosition = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeFriction: Int | Double = null,
    effect: CarouselEffect = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlide: Int | Double = null,
    lazyLoad: LazyLoadTypes = null,
    nextArrow: Element = null,
    onEdge: /* swipeDirection */ SwipeDirection => Unit = null,
    onInit: () => Unit = null,
    onLazyLoad: /* slidesToLoad */ js.Array[Double] => Unit = null,
    onReInit: () => Unit = null,
    onSwipe: /* swipeDirection */ SwipeDirection => Unit = null,
    pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined,
    pauseOnFocus: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    prevArrow: Element = null,
    responsive: js.Array[ResponsiveObject] = null,
    rows: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    slickGoTo: Int | Double = null,
    slide: String = null,
    slidesPerRow: Int | Double = null,
    slidesToScroll: Int | Double = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    style: CSSProperties = null,
    swipe: js.UndefOr[Boolean] = js.undefined,
    swipeEvent: /* swipeDirection */ SwipeDirection => Unit = null,
    swipeToSlide: js.UndefOr[Boolean] = js.undefined,
    touchMove: js.UndefOr[Boolean] = js.undefined,
    touchThreshold: Int | Double = null,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    useTransform: js.UndefOr[Boolean] = js.undefined,
    variableWidth: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    verticalSwiping: js.UndefOr[Boolean] = js.undefined,
    waitForAnimate: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight)
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (appendDots != null) __obj.updateDynamic("appendDots")(js.Any.fromFunction1(appendDots))
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2(beforeChange))
    if (!js.isUndefined(centerMode)) __obj.updateDynamic("centerMode")(centerMode)
    if (centerPadding != null) __obj.updateDynamic("centerPadding")(centerPadding)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssEase != null) __obj.updateDynamic("cssEase")(cssEase)
    if (customPaging != null) __obj.updateDynamic("customPaging")(js.Any.fromFunction1(customPaging))
    if (dotPosition != null) __obj.updateDynamic("dotPosition")(dotPosition)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (edgeFriction != null) __obj.updateDynamic("edgeFriction")(edgeFriction.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow)
    if (onEdge != null) __obj.updateDynamic("onEdge")(js.Any.fromFunction1(onEdge))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1(onLazyLoad))
    if (onReInit != null) __obj.updateDynamic("onReInit")(js.Any.fromFunction0(onReInit))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1(onSwipe))
    if (!js.isUndefined(pauseOnDotsHover)) __obj.updateDynamic("pauseOnDotsHover")(pauseOnDotsHover)
    if (!js.isUndefined(pauseOnFocus)) __obj.updateDynamic("pauseOnFocus")(pauseOnFocus)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (slickGoTo != null) __obj.updateDynamic("slickGoTo")(slickGoTo.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (slidesPerRow != null) __obj.updateDynamic("slidesPerRow")(slidesPerRow.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe)
    if (swipeEvent != null) __obj.updateDynamic("swipeEvent")(js.Any.fromFunction1(swipeEvent))
    if (!js.isUndefined(swipeToSlide)) __obj.updateDynamic("swipeToSlide")(swipeToSlide)
    if (!js.isUndefined(touchMove)) __obj.updateDynamic("touchMove")(touchMove)
    if (touchThreshold != null) __obj.updateDynamic("touchThreshold")(touchThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS)
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform)
    if (!js.isUndefined(variableWidth)) __obj.updateDynamic("variableWidth")(variableWidth)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (!js.isUndefined(verticalSwiping)) __obj.updateDynamic("verticalSwiping")(verticalSwiping)
    if (!js.isUndefined(waitForAnimate)) __obj.updateDynamic("waitForAnimate")(waitForAnimate)
    __obj.asInstanceOf[CarouselProps]
  }
}

