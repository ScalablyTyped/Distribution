package typings.amapJsApiHeatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDrawGridLine extends js.Object {
  var drawGridLine: js.UndefOr[Boolean] = js.undefined
  var gridSize: js.UndefOr[Double] = js.undefined
  var heightBezier: js.UndefOr[js.Array[Double]] = js.undefined
  var heightScale: js.UndefOr[Double] = js.undefined
}

object AnonDrawGridLine {
  @scala.inline
  def apply(
    drawGridLine: js.UndefOr[Boolean] = js.undefined,
    gridSize: Int | Double = null,
    heightBezier: js.Array[Double] = null,
    heightScale: Int | Double = null
  ): AnonDrawGridLine = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawGridLine)) __obj.updateDynamic("drawGridLine")(drawGridLine.asInstanceOf[js.Any])
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (heightBezier != null) __obj.updateDynamic("heightBezier")(heightBezier.asInstanceOf[js.Any])
    if (heightScale != null) __obj.updateDynamic("heightScale")(heightScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDrawGridLine]
  }
}

