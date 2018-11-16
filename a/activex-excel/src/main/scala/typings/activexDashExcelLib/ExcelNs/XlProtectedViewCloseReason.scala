package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlProtectedViewCloseReason extends js.Object

@JSGlobal("Excel.XlProtectedViewCloseReason")
@js.native
object XlProtectedViewCloseReason extends js.Object {
  @js.native
  sealed trait xlProtectedViewCloseEdit
    extends activexDashExcelLib.ExcelNs.XlProtectedViewCloseReason
  
  @js.native
  sealed trait xlProtectedViewCloseForced
    extends activexDashExcelLib.ExcelNs.XlProtectedViewCloseReason
  
  @js.native
  sealed trait xlProtectedViewCloseNormal
    extends activexDashExcelLib.ExcelNs.XlProtectedViewCloseReason
  
  /* 1 */ val xlProtectedViewCloseEdit: xlProtectedViewCloseEdit with scala.Double = js.native
  /* 2 */ val xlProtectedViewCloseForced: xlProtectedViewCloseForced with scala.Double = js.native
  /* 0 */ val xlProtectedViewCloseNormal: xlProtectedViewCloseNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlProtectedViewCloseReason with scala.Double] = js.native
}

