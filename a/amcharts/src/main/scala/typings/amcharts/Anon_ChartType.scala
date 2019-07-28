package typings.amcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartType extends js.Object {
   // Either "dataUpdated" or "init".
  var chart: this.type
  var `type`: String
}

object Anon_ChartType {
  @scala.inline
  def apply(chart: Anon_ChartType, `type`: String): Anon_ChartType = {
    val __obj = js.Dynamic.literal(chart = chart)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ChartType]
  }
}

