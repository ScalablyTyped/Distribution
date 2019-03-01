package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRefresh extends js.Object {
  val IsRefresh: scala.Boolean
  val Map: activexDashExcelLib.ExcelNs.XmlMap
  val Result: activexDashExcelLib.ExcelNs.XlXmlImportResult
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_IsRefresh {
  @scala.inline
  def apply(
    IsRefresh: scala.Boolean,
    Map: activexDashExcelLib.ExcelNs.XmlMap,
    Result: activexDashExcelLib.ExcelNs.XlXmlImportResult,
    Wb: activexDashExcelLib.ExcelNs.Workbook
  ): Anon_IsRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsRefresh")(IsRefresh)
    __obj.updateDynamic("Map")(Map)
    __obj.updateDynamic("Result")(Result)
    __obj.updateDynamic("Wb")(Wb)
    __obj.asInstanceOf[Anon_IsRefresh]
  }
}

