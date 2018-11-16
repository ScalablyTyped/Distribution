package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlXmlImportResult extends js.Object

@JSGlobal("Excel.XlXmlImportResult")
@js.native
object XlXmlImportResult extends js.Object {
  @js.native
  sealed trait xlXmlImportElementsTruncated
    extends activexDashExcelLib.ExcelNs.XlXmlImportResult
  
  @js.native
  sealed trait xlXmlImportSuccess
    extends activexDashExcelLib.ExcelNs.XlXmlImportResult
  
  @js.native
  sealed trait xlXmlImportValidationFailed
    extends activexDashExcelLib.ExcelNs.XlXmlImportResult
  
  /* 1 */ val xlXmlImportElementsTruncated: xlXmlImportElementsTruncated with scala.Double = js.native
  /* 0 */ val xlXmlImportSuccess: xlXmlImportSuccess with scala.Double = js.native
  /* 2 */ val xlXmlImportValidationFailed: xlXmlImportValidationFailed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlXmlImportResult with scala.Double] = js.native
}

