package typings.amapDashJsDashApiDashHeatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DrawGridLine extends js.Object {
  var drawGridLine: js.UndefOr[Boolean] = js.undefined
  var gridSize: js.UndefOr[Double] = js.undefined
  var heightBezier: js.UndefOr[js.Array[Double]] = js.undefined
  var heightScale: js.UndefOr[Double] = js.undefined
}

object Anon_DrawGridLine {
  @scala.inline
  def apply(
    drawGridLine: js.UndefOr[Boolean] = js.undefined,
    gridSize: Int | Double = null,
    heightBezier: js.Array[Double] = null,
    heightScale: Int | Double = null
  ): Anon_DrawGridLine = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawGridLine)) __obj.updateDynamic("drawGridLine")(drawGridLine)
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (heightBezier != null) __obj.updateDynamic("heightBezier")(heightBezier)
    if (heightScale != null) __obj.updateDynamic("heightScale")(heightScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DrawGridLine]
  }
}

