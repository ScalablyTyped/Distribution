package typings.amcharts

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataItem extends js.Object {
  var chart: default
  var dataItem: js.Object
  var `type`: String
}

object Anon_ChartDataItem {
  @scala.inline
  def apply(chart: default, dataItem: js.Object, `type`: String): Anon_ChartDataItem = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartDataItem]
  }
}

