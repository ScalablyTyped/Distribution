package typings.antdMobileRn.carouselIndexNativeMod

import typings.antdMobileRn.carouselPropsTypeMod.CarouselPropsType
import typings.react.mod.ReactNode
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends CarouselPropsType {
  var afterChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var bounces: js.UndefOr[Boolean] = js.undefined
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var onMomentumScrollEnd: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ CarouselState, 
      /* carousel */ Carousel, 
      Unit
    ]
  ] = js.undefined
  var onScrollBeginDrag: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ CarouselState, 
      /* carousel */ Carousel, 
      Unit
    ]
  ] = js.undefined
  var pagination: js.UndefOr[js.Function1[/* props */ PaginationProps, ReactNode]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    afterChange: /* index */ Double => Unit = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: js.UndefOr[Double] = js.undefined,
    bounces: js.UndefOr[Boolean] = js.undefined,
    dotActiveStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    dotStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: js.UndefOr[Double] = js.undefined,
    onMomentumScrollEnd: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit = null,
    onScrollBeginDrag: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit = null,
    pagination: /* props */ PaginationProps => ReactNode = null,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: js.Any = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayInterval)) __obj.updateDynamic("autoplayInterval")(autoplayInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dotActiveStyle)) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dotStyle)) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlideWidth)) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.get.asInstanceOf[js.Any])
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3(onMomentumScrollEnd))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3(onScrollBeginDrag))
    if (pagination != null) __obj.updateDynamic("pagination")(js.Any.fromFunction1(pagination))
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

