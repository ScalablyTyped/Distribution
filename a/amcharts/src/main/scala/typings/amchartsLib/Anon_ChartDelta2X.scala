package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDelta2X extends js.Object {
  var chart: amchartsLib.amChartMod.default
  var delta2X: js.UndefOr[scala.Double] = js.undefined
  var delta2Y: js.UndefOr[scala.Double] = js.undefined
  var deltaX: js.UndefOr[scala.Double] = js.undefined
  var deltaY: js.UndefOr[scala.Double] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var finalX: js.UndefOr[scala.Double] = js.undefined
  var finalY: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var initialX: js.UndefOr[scala.Double] = js.undefined
  var initialY: js.UndefOr[scala.Double] = js.undefined
  var mostCloseGraph: js.UndefOr[amchartsLib.amGraphMod.default] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[this.type] = js.undefined
  var `type`: java.lang.String
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
  var zooming: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ChartDelta2X {
  @scala.inline
  def apply(
    chart: amchartsLib.amChartMod.default,
    `type`: java.lang.String,
    delta2X: scala.Int | scala.Double = null,
    delta2Y: scala.Int | scala.Double = null,
    deltaX: scala.Int | scala.Double = null,
    deltaY: scala.Int | scala.Double = null,
    end: scala.Int | scala.Double = null,
    finalX: scala.Int | scala.Double = null,
    finalY: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    initialX: scala.Int | scala.Double = null,
    initialY: scala.Int | scala.Double = null,
    mostCloseGraph: amchartsLib.amGraphMod.default = null,
    start: scala.Int | scala.Double = null,
    target: Anon_ChartDelta2X = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    zooming: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ChartDelta2X = {
    val __obj = js.Dynamic.literal(chart = chart)
    __obj.updateDynamic("type")(`type`)
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
    if (mostCloseGraph != null) __obj.updateDynamic("mostCloseGraph")(mostCloseGraph)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(zooming)) __obj.updateDynamic("zooming")(zooming)
    __obj.asInstanceOf[Anon_ChartDelta2X]
  }
}

