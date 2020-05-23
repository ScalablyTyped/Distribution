package typings.amcharts.anon

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndValue extends js.Object {
  var chart: default
  var endValue: js.UndefOr[typings.std.Date] = js.undefined
  var startValue: js.UndefOr[typings.std.Date] = js.undefined
  var `type`: String
}

object EndValue {
  @scala.inline
  def apply(
    chart: default,
    `type`: String,
    endValue: typings.std.Date = null,
    startValue: typings.std.Date = null
  ): EndValue = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndValue]
  }
}

