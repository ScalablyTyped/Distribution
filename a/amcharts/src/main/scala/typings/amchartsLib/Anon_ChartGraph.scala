package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartGraph extends js.Object {
  var chart: amchartsLib.amchartMod.default
  var graph: amchartsLib.amgraphMod.default
  var index: scala.Double
  var item: amchartsLib.graphdataitemMod.default
  var `type`: java.lang.String
}

object Anon_ChartGraph {
  @scala.inline
  def apply(
    chart: amchartsLib.amchartMod.default,
    graph: amchartsLib.amgraphMod.default,
    index: scala.Double,
    item: amchartsLib.graphdataitemMod.default,
    `type`: java.lang.String
  ): Anon_ChartGraph = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("graph")(graph)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[Anon_ChartGraph]
  }
}

