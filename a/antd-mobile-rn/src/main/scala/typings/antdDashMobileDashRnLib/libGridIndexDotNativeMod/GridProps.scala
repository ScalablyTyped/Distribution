package typings
package antdDashMobileDashRnLib.libGridIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends antdDashMobileDashRnLib.libGridPropsTypeMod.GridPropsType {
  var carouselProps: js.UndefOr[antdDashMobileDashRnLib.libCarouselIndexDotNativeMod.CarouselProps] = js.undefined
  var itemStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    carouselMaxRow: scala.Int | scala.Double = null,
    carouselProps: antdDashMobileDashRnLib.libCarouselIndexDotNativeMod.CarouselProps = null,
    columnNum: scala.Int | scala.Double = null,
    data: js.Array[js.UndefOr[antdDashMobileDashRnLib.libGridPropsTypeMod.DataItem]] = null,
    hasLine: js.UndefOr[scala.Boolean] = js.undefined,
    isCarousel: js.UndefOr[scala.Boolean] = js.undefined,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onClick: (/* dataItem */ js.UndefOr[antdDashMobileDashRnLib.libGridPropsTypeMod.DataItem], /* itemIndex */ scala.Double) => scala.Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[antdDashMobileDashRnLib.libGridPropsTypeMod.DataItem], /* itemIndex */ scala.Double) => reactLib.reactMod.ReactNs.ReactElement[_] = null,
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

