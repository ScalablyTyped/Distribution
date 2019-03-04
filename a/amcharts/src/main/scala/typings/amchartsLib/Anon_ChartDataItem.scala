package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataItem extends js.Object {
  var chart: amchartsLib.amchartMod.default
  var dataItem: js.Object
  var `type`: java.lang.String
}

object Anon_ChartDataItem {
  @scala.inline
  def apply(chart: amchartsLib.amchartMod.default, dataItem: js.Object, `type`: java.lang.String): Anon_ChartDataItem = {
    val __obj = js.Dynamic.literal(chart = chart, dataItem = dataItem)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ChartDataItem]
  }
}

