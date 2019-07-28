package typings.antdDashMobileDashRn.libGridIndexDotNativeMod

import typings.antdDashMobileDashRn.libCarouselIndexDotNativeMod.CarouselProps
import typings.antdDashMobileDashRn.libGridPropsTypeMod.DataItem
import typings.antdDashMobileDashRn.libGridPropsTypeMod.GridPropsType
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends GridPropsType {
  var carouselProps: js.UndefOr[CarouselProps] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    carouselMaxRow: Int | Double = null,
    carouselProps: CarouselProps = null,
    columnNum: Int | Double = null,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[Boolean] = js.undefined,
    isCarousel: js.UndefOr[Boolean] = js.undefined,
    itemStyle: StyleProp[ViewStyle] = null,
    onClick: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement = null,
    styles: js.Any = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (carouselMaxRow != null) __obj.updateDynamic("carouselMaxRow")(carouselMaxRow.asInstanceOf[js.Any])
    if (carouselProps != null) __obj.updateDynamic("carouselProps")(carouselProps)
    if (columnNum != null) __obj.updateDynamic("columnNum")(columnNum.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine)
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[GridProps]
  }
}

