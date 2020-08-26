package typings.amcharts.anon

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var chart: default = js.native
  var graph: typings.amcharts.amGraphMod.default = js.native
  var index: Double = js.native
  var item: typings.amcharts.graphDataItemMod.default = js.native
  var `type`: String = js.native
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
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChart(value: default): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraph(value: typings.amcharts.amGraphMod.default): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: typings.amcharts.graphDataItemMod.default): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

