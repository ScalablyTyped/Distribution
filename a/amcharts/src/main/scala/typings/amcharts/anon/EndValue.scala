package typings.amcharts.anon

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndValue extends js.Object {
  var chart: default = js.native
  var endValue: js.UndefOr[typings.std.Date] = js.native
  var startValue: js.UndefOr[typings.std.Date] = js.native
  var `type`: String = js.native
}

object EndValue {
  @scala.inline
  def apply(chart: default, `type`: String): EndValue = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndValue]
  }
  @scala.inline
  implicit class EndValueOps[Self <: EndValue] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndValue(value: typings.std.Date): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    @scala.inline
    def setStartValue(value: typings.std.Date): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
  }
  
}

