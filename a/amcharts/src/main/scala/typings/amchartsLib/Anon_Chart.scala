package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chart extends js.Object {
  var chart: amchartsLib.amChartMod.default
  var `type`: java.lang.String
}

object Anon_Chart {
  @scala.inline
  def apply(chart: amchartsLib.amChartMod.default, `type`: java.lang.String): Anon_Chart = {
    val __obj = js.Dynamic.literal(chart = chart)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Chart]
  }
}

