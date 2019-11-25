package typings.amcharts

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartGraph extends js.Object {
  var chart: default
  var graph: typings.amcharts.amGraphMod.default
  var index: Double
  var item: typings.amcharts.graphDataItemMod.default
  var `type`: String
}

object Anon_ChartGraph {
  @scala.inline
  def apply(
    chart: default,
    graph: typings.amcharts.amGraphMod.default,
    index: Double,
    item: typings.amcharts.graphDataItemMod.default,
    `type`: String
  ): Anon_ChartGraph = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartGraph]
  }
}

