package typings.amcharts

import typings.amcharts.amChartMod.default
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndValue extends js.Object {
  var chart: default
  var endValue: js.UndefOr[Date] = js.undefined
  var startValue: js.UndefOr[Date] = js.undefined
  var `type`: String
}

object AnonEndValue {
  @scala.inline
  def apply(chart: default, `type`: String, endValue: Date = null, startValue: Date = null): AnonEndValue = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndValue]
  }
}

