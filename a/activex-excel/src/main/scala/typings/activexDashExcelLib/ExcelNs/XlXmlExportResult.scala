package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlXmlExportResult extends js.Object

@JSGlobal("Excel.XlXmlExportResult")
@js.native
object XlXmlExportResult extends js.Object {
  @js.native
  sealed trait xlXmlExportSuccess
    extends activexDashExcelLib.ExcelNs.XlXmlExportResult
  
  @js.native
  sealed trait xlXmlExportValidationFailed
    extends activexDashExcelLib.ExcelNs.XlXmlExportResult
  
  /* 0 */ val xlXmlExportSuccess: xlXmlExportSuccess with scala.Double = js.native
  /* 1 */ val xlXmlExportValidationFailed: xlXmlExportValidationFailed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlXmlExportResult with scala.Double] = js.native
}

