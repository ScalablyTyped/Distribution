package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFileAccess extends js.Object

@JSGlobal("Excel.XlFileAccess")
@js.native
object XlFileAccess extends js.Object {
  @js.native
  sealed trait xlReadOnly
    extends activexDashExcelLib.ExcelNs.XlFileAccess
  
  @js.native
  sealed trait xlReadWrite
    extends activexDashExcelLib.ExcelNs.XlFileAccess
  
  /* 3 */ val xlReadOnly: xlReadOnly with scala.Double = js.native
  /* 2 */ val xlReadWrite: xlReadWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFileAccess with scala.Double] = js.native
}

