package typings.amcharts.anon

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta2X extends js.Object {
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

object Delta2X {
  @scala.inline
  def apply(
    chart: default,
    `type`: String,
    delta2X: js.UndefOr[Double] = js.undefined,
    delta2Y: js.UndefOr[Double] = js.undefined,
    deltaX: js.UndefOr[Double] = js.undefined,
    deltaY: js.UndefOr[Double] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    finalX: js.UndefOr[Double] = js.undefined,
    finalY: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    initialX: js.UndefOr[Double] = js.undefined,
    initialY: js.UndefOr[Double] = js.undefined,
    mostCloseGraph: typings.amcharts.amGraphMod.default = null,
    start: js.UndefOr[Double] = js.undefined,
    target: Delta2X = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    zooming: js.UndefOr[Boolean] = js.undefined
  ): Delta2X = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(delta2X)) __obj.updateDynamic("delta2X")(delta2X.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delta2Y)) __obj.updateDynamic("delta2Y")(delta2Y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaX)) __obj.updateDynamic("deltaX")(deltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaY)) __obj.updateDynamic("deltaY")(deltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(finalX)) __obj.updateDynamic("finalX")(finalX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(finalY)) __obj.updateDynamic("finalY")(finalY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialX)) __obj.updateDynamic("initialX")(initialX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialY)) __obj.updateDynamic("initialY")(initialY.get.asInstanceOf[js.Any])
    if (mostCloseGraph != null) __obj.updateDynamic("mostCloseGraph")(mostCloseGraph.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zooming)) __obj.updateDynamic("zooming")(zooming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta2X]
  }
}

