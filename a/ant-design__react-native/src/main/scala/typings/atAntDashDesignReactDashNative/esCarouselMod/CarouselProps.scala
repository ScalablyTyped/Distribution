package typings.atAntDashDesignReactDashNative.esCarouselMod

import typings.atAntDashDesignReactDashNative.esCarouselStyleMod.CarouselStyle
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.NativeScrollEvent
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
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
}

object CarouselProps {
  @scala.inline
  def apply(
    afterChange: /* index */ Double => Unit = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    dotActiveStyle: StyleProp[ViewStyle] = null,
    dotStyle: StyleProp[ViewStyle] = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: Int | Double = null,
    onMomentumScrollEnd: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit = null,
    onScrollBeginDrag: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit = null,
    pagination: /* props */ PaginationProps => ReactNode = null,
    selectedIndex: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[CarouselStyle] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces)
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3(onMomentumScrollEnd))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3(onScrollBeginDrag))
    if (pagination != null) __obj.updateDynamic("pagination")(js.Any.fromFunction1(pagination))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[CarouselProps]
  }
}

