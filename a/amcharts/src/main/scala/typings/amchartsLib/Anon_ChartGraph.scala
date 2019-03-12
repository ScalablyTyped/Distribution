package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartGraph extends js.Object {
  var chart: amchartsLib.amChartMod.default
  var graph: amchartsLib.amGraphMod.default
  var index: scala.Double
  var item: amchartsLib.graphDataItemMod.default
  var `type`: java.lang.String
}

object Anon_ChartGraph {
  @scala.inline
  def apply(
    chart: amchartsLib.amChartMod.default,
    graph: amchartsLib.amGraphMod.default,
    index: scala.Double,
    item: amchartsLib.graphDataItemMod.default,
    `type`: java.lang.String
  ): Anon_ChartGraph = {
    val __obj = js.Dynamic.literal(chart = chart, graph = graph, index = index, item = item)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ChartGraph]
  }
}

