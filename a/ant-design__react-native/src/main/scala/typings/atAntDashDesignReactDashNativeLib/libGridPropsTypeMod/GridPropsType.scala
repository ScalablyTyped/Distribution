package typings
package atAntDashDesignReactDashNativeLib.libGridPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPropsType extends js.Object {
  var carouselMaxRow: scala.Double
  var columnNum: scala.Double
  var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.undefined
  var hasLine: js.UndefOr[scala.Boolean] = js.undefined
  var isCarousel: js.UndefOr[scala.Boolean] = js.undefined
  var onPress: js.UndefOr[
    js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  var renderItem: js.UndefOr[
    js.Function2[
      /* dataItem */ js.UndefOr[DataItem], 
      /* itemIndex */ scala.Double, 
      reactLib.reactMod.ReactElement
    ]
  ] = js.undefined
}

object GridPropsType {
  @scala.inline
  def apply(
    carouselMaxRow: scala.Double,
    columnNum: scala.Double,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[scala.Boolean] = js.undefined,
    isCarousel: js.UndefOr[scala.Boolean] = js.undefined,
    onPress: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ scala.Double) => scala.Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ scala.Double) => reactLib.reactMod.ReactElement = null
  ): GridPropsType = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow, columnNum = columnNum)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine)
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction2(onPress))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    __obj.asInstanceOf[GridPropsType]
  }
}

