package typings.amcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChartType extends js.Object {
   // Either "dataUpdated" or "init".
  var chart: this.type
  var `type`: String
}

object AnonChartType {
  @scala.inline
  def apply(chart: AnonChartType, `type`: String): AnonChartType = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChartType]
  }
}

