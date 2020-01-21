package typings.amcharts

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChartDataItemType extends js.Object {
  var chart: default
   // Always "rollOverSlice".
  var dataItem: typings.amcharts.sliceMod.default
  var `type`: String
}

object AnonChartDataItemType {
  @scala.inline
  def apply(chart: default, dataItem: typings.amcharts.sliceMod.default, `type`: String): AnonChartDataItemType = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChartDataItemType]
  }
}

