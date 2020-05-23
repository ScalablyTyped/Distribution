package typings.amapJsApiHeatmap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawGridLine extends js.Object {
  var drawGridLine: js.UndefOr[Boolean] = js.undefined
  var gridSize: js.UndefOr[Double] = js.undefined
  var heightBezier: js.UndefOr[js.Array[Double]] = js.undefined
  var heightScale: js.UndefOr[Double] = js.undefined
}

object DrawGridLine {
  @scala.inline
  def apply(
    drawGridLine: js.UndefOr[Boolean] = js.undefined,
    gridSize: js.UndefOr[Double] = js.undefined,
    heightBezier: js.Array[Double] = null,
    heightScale: js.UndefOr[Double] = js.undefined
  ): DrawGridLine = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawGridLine)) __obj.updateDynamic("drawGridLine")(drawGridLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridSize)) __obj.updateDynamic("gridSize")(gridSize.get.asInstanceOf[js.Any])
    if (heightBezier != null) __obj.updateDynamic("heightBezier")(heightBezier.asInstanceOf[js.Any])
    if (!js.isUndefined(heightScale)) __obj.updateDynamic("heightScale")(heightScale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawGridLine]
  }
}

