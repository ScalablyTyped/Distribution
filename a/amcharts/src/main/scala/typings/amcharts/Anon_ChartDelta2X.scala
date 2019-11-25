package typings.amcharts

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDelta2X extends js.Object {
  var chart: default
  var delta2X: js.UndefOr[Double] = js.undefined
  var delta2Y: js.UndefOr[Double] = js.undefined
  var deltaX: js.UndefOr[Double] = js.undefined
  var deltaY: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var finalX: js.UndefOr[Double] = js.undefined
  var finalY: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var initialX: js.UndefOr[Double] = js.undefined
  var initialY: js.UndefOr[Double] = js.undefined
  var mostCloseGraph: js.UndefOr[typings.amcharts.amGraphMod.default] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[this.type] = js.undefined
  var `type`: String
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var zooming: js.UndefOr[Boolean] = js.undefined
}

object Anon_ChartDelta2X {
  @scala.inline
  def apply(
    chart: default,
    `type`: String,
    delta2X: Int | Double = null,
    delta2Y: Int | Double = null,
    deltaX: Int | Double = null,
    deltaY: Int | Double = null,
    end: Int | Double = null,
    finalX: Int | Double = null,
    finalY: Int | Double = null,
    index: Int | Double = null,
    initialX: Int | Double = null,
    initialY: Int | Double = null,
    mostCloseGraph: typings.amcharts.amGraphMod.default = null,
    start: Int | Double = null,
    target: Anon_ChartDelta2X = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zooming: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChartDelta2X = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delta2X != null) __obj.updateDynamic("delta2X")(delta2X.asInstanceOf[js.Any])
    if (delta2Y != null) __obj.updateDynamic("delta2Y")(delta2Y.asInstanceOf[js.Any])
    if (deltaX != null) __obj.updateDynamic("deltaX")(deltaX.asInstanceOf[js.Any])
    if (deltaY != null) __obj.updateDynamic("deltaY")(deltaY.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (finalX != null) __obj.updateDynamic("finalX")(finalX.asInstanceOf[js.Any])
    if (finalY != null) __obj.updateDynamic("finalY")(finalY.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (initialX != null) __obj.updateDynamic("initialX")(initialX.asInstanceOf[js.Any])
    if (initialY != null) __obj.updateDynamic("initialY")(initialY.asInstanceOf[js.Any])
    if (mostCloseGraph != null) __obj.updateDynamic("mostCloseGraph")(mostCloseGraph.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(zooming)) __obj.updateDynamic("zooming")(zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartDelta2X]
  }
}

