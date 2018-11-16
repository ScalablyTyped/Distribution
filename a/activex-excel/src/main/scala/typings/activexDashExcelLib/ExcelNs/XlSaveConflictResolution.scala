package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSaveConflictResolution extends js.Object

@JSGlobal("Excel.XlSaveConflictResolution")
@js.native
object XlSaveConflictResolution extends js.Object {
  @js.native
  sealed trait xlLocalSessionChanges
    extends activexDashExcelLib.ExcelNs.XlSaveConflictResolution
  
  @js.native
  sealed trait xlOtherSessionChanges
    extends activexDashExcelLib.ExcelNs.XlSaveConflictResolution
  
  @js.native
  sealed trait xlUserResolution
    extends activexDashExcelLib.ExcelNs.XlSaveConflictResolution
  
  /* 2 */ val xlLocalSessionChanges: xlLocalSessionChanges with scala.Double = js.native
  /* 3 */ val xlOtherSessionChanges: xlOtherSessionChanges with scala.Double = js.native
  /* 1 */ val xlUserResolution: xlUserResolution with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSaveConflictResolution with scala.Double] = js.native
}

