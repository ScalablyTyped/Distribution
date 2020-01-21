package typings.amcharts

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChart extends js.Object {
  var chart: default
  var `type`: String
}

object AnonChart {
  @scala.inline
  def apply(chart: default, `type`: String): AnonChart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChart]
  }
}

