package typings
package atAntDashDesignReactDashNativeLib.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends atAntDashDesignReactDashNativeLib.esGridPropsTypeMod.GridPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esGridStyleMod.GridStyle] {
  var carouselProps: js.UndefOr[atAntDashDesignReactDashNativeLib.esCarouselMod.CarouselProps] = js.undefined
  var itemStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    carouselMaxRow: scala.Double,
    columnNum: scala.Double,
    carouselProps: atAntDashDesignReactDashNativeLib.esCarouselMod.CarouselProps = null,
    data: js.Array[js.UndefOr[atAntDashDesignReactDashNativeLib.esGridPropsTypeMod.DataItem]] = null,
    hasLine: js.UndefOr[scala.Boolean] = js.undefined,
    isCarousel: js.UndefOr[scala.Boolean] = js.undefined,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onPress: (/* dataItem */ js.UndefOr[atAntDashDesignReactDashNativeLib.esGridPropsTypeMod.DataItem], /* itemIndex */ scala.Double) => scala.Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[atAntDashDesignReactDashNativeLib.esGridPropsTypeMod.DataItem], /* itemIndex */ scala.Double) => reactLib.reactMod.ReactElement = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esGridStyleMod.GridStyle] = null
  ): GridProps = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow, columnNum = columnNum)
    if (carouselProps != null) __obj.updateDynamic("carouselProps")(carouselProps)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine)
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction2(onPress))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[GridProps]
  }
}

