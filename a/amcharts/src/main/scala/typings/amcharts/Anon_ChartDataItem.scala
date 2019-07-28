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
    val __obj = js.Dynamic.literal(chart = chart, dataItem = dataItem)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ChartDataItem]
  }
}

