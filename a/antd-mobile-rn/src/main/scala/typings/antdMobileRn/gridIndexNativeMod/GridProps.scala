package typings.antdMobileRn.gridIndexNativeMod

import typings.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typings.antdMobileRn.gridPropsTypeMod.DataItem
import typings.antdMobileRn.gridPropsTypeMod.GridPropsType
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
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
    carouselMaxRow: js.UndefOr[Double] = js.undefined,
    carouselProps: CarouselProps = null,
    columnNum: js.UndefOr[Double] = js.undefined,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[Boolean] = js.undefined,
    isCarousel: js.UndefOr[Boolean] = js.undefined,
    itemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    onClick: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement = null,
    styles: js.Any = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(carouselMaxRow)) __obj.updateDynamic("carouselMaxRow")(carouselMaxRow.get.asInstanceOf[js.Any])
    if (carouselProps != null) __obj.updateDynamic("carouselProps")(carouselProps.asInstanceOf[js.Any])
    if (!js.isUndefined(columnNum)) __obj.updateDynamic("columnNum")(columnNum.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

