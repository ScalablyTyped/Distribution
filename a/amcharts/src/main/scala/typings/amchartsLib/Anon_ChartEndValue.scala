package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartEndValue extends js.Object {
  var chart: amchartsLib.amChartMod.default
  var endValue: js.UndefOr[stdLib.Date] = js.undefined
  var startValue: js.UndefOr[stdLib.Date] = js.undefined
  var `type`: java.lang.String
}

object Anon_ChartEndValue {
  @scala.inline
  def apply(
    chart: amchartsLib.amChartMod.default,
    `type`: java.lang.String,
    endValue: stdLib.Date = null,
    startValue: stdLib.Date = null
  ): Anon_ChartEndValue = {
    val __obj = js.Dynamic.literal(chart = chart)
    __obj.updateDynamic("type")(`type`)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue)
    if (startValue != null) __obj.updateDynamic("startValue")(startValue)
    __obj.asInstanceOf[Anon_ChartEndValue]
  }
}

