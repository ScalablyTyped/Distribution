package typings.amcharts

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chart extends js.Object {
  var chart: default
  var `type`: String
}

object Anon_Chart {
  @scala.inline
  def apply(chart: default, `type`: String): Anon_Chart = {
    val __obj = js.Dynamic.literal(chart = chart)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Chart]
  }
}

