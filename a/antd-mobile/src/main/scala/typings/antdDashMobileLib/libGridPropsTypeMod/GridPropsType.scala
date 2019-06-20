package typings
package antdDashMobileLib.libGridPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPropsType extends js.Object {
  var carouselMaxRow: js.UndefOr[scala.Double] = js.undefined
  var columnNum: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.undefined
  var hasLine: js.UndefOr[scala.Boolean] = js.undefined
  var isCarousel: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[
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
    carouselMaxRow: scala.Int | scala.Double = null,
    columnNum: scala.Int | scala.Double = null,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[scala.Boolean] = js.undefined,
    isCarousel: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ scala.Double) => scala.Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ scala.Double) => reactLib.reactMod.ReactElement = null
  ): GridPropsType = {
    val __obj = js.Dynamic.literal()
    if (carouselMaxRow != null) __obj.updateDynamic("carouselMaxRow")(carouselMaxRow.asInstanceOf[js.Any])
    if (columnNum != null) __obj.updateDynamic("columnNum")(columnNum.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine)
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    __obj.asInstanceOf[GridPropsType]
  }
}

