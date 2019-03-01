package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRefreshMap extends js.Object {
  val IsRefresh: scala.Boolean
  val Map: activexDashExcelLib.ExcelNs.XmlMap
  val Result: activexDashExcelLib.ExcelNs.XlXmlImportResult
}

object Anon_IsRefreshMap {
  @scala.inline
  def apply(
    IsRefresh: scala.Boolean,
    Map: activexDashExcelLib.ExcelNs.XmlMap,
    Result: activexDashExcelLib.ExcelNs.XlXmlImportResult
  ): Anon_IsRefreshMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsRefresh")(IsRefresh)
    __obj.updateDynamic("Map")(Map)
    __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[Anon_IsRefreshMap]
  }
}

