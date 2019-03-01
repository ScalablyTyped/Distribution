package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chart extends js.Object {
  var chart: amchartsLib.amchartMod.default
  var `type`: java.lang.String
}

object Anon_Chart {
  @scala.inline
  def apply(chart: amchartsLib.amchartMod.default, `type`: java.lang.String): Anon_Chart = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("chart")(chart)
    __obj.asInstanceOf[Anon_Chart]
  }
}

