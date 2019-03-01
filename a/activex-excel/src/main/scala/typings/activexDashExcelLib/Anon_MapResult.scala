package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MapResult extends js.Object {
  val Map: activexDashExcelLib.ExcelNs.XmlMap
  val Result: activexDashExcelLib.ExcelNs.XlXmlExportResult
  val Url: java.lang.String
}

object Anon_MapResult {
  @scala.inline
  def apply(
    Map: activexDashExcelLib.ExcelNs.XmlMap,
    Result: activexDashExcelLib.ExcelNs.XlXmlExportResult,
    Url: java.lang.String
  ): Anon_MapResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Map")(Map)
    __obj.updateDynamic("Result")(Result)
    __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Anon_MapResult]
  }
}

