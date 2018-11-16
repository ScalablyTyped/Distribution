package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlListConflict extends js.Object

@JSGlobal("Excel.XlListConflict")
@js.native
object XlListConflict extends js.Object {
  @js.native
  sealed trait xlListConflictDialog
    extends activexDashExcelLib.ExcelNs.XlListConflict
  
  @js.native
  sealed trait xlListConflictDiscardAllConflicts
    extends activexDashExcelLib.ExcelNs.XlListConflict
  
  @js.native
  sealed trait xlListConflictError
    extends activexDashExcelLib.ExcelNs.XlListConflict
  
  @js.native
  sealed trait xlListConflictRetryAllConflicts
    extends activexDashExcelLib.ExcelNs.XlListConflict
  
  /* 0 */ val xlListConflictDialog: xlListConflictDialog with scala.Double = js.native
  /* 2 */ val xlListConflictDiscardAllConflicts: xlListConflictDiscardAllConflicts with scala.Double = js.native
  /* 3 */ val xlListConflictError: xlListConflictError with scala.Double = js.native
  /* 1 */ val xlListConflictRetryAllConflicts: xlListConflictRetryAllConflicts with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlListConflict with scala.Double] = js.native
}

