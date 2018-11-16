package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSaveAction extends js.Object

@JSGlobal("Excel.XlSaveAction")
@js.native
object XlSaveAction extends js.Object {
  @js.native
  sealed trait xlDoNotSaveChanges
    extends activexDashExcelLib.ExcelNs.XlSaveAction
  
  @js.native
  sealed trait xlSaveChanges
    extends activexDashExcelLib.ExcelNs.XlSaveAction
  
  /* 2 */ val xlDoNotSaveChanges: xlDoNotSaveChanges with scala.Double = js.native
  /* 1 */ val xlSaveChanges: xlSaveChanges with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSaveAction with scala.Double] = js.native
}

