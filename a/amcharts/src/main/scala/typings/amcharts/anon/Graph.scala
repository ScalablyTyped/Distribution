package typings.amcharts.anon

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  var chart: default
  var graph: typings.amcharts.amGraphMod.default
  var index: Double
  var item: typings.amcharts.graphDataItemMod.default
  var `type`: String
}

object Graph {
  @scala.inline
  def apply(
    chart: default,
    graph: typings.amcharts.amGraphMod.default,
    index: Double,
    item: typings.amcharts.graphDataItemMod.default,
    `type`: String
  ): Graph = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

