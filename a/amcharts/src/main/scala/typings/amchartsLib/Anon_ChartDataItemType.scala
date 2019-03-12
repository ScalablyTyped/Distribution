package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataItemType extends js.Object {
  var chart: amchartsLib.amChartMod.default
   // Always "rollOverSlice".
  var dataItem: amchartsLib.sliceMod.default
  var `type`: java.lang.String
}

object Anon_ChartDataItemType {
  @scala.inline
  def apply(
    chart: amchartsLib.amChartMod.default,
    dataItem: amchartsLib.sliceMod.default,
    `type`: java.lang.String
  ): Anon_ChartDataItemType = {
    val __obj = js.Dynamic.literal(chart = chart, dataItem = dataItem)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ChartDataItemType]
  }
}

