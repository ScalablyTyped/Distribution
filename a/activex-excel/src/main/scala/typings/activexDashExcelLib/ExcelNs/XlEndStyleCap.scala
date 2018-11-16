package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEndStyleCap extends js.Object

@JSGlobal("Excel.XlEndStyleCap")
@js.native
object XlEndStyleCap extends js.Object {
  @js.native
  sealed trait xlCap
    extends activexDashExcelLib.ExcelNs.XlEndStyleCap
  
  @js.native
  sealed trait xlNoCap
    extends activexDashExcelLib.ExcelNs.XlEndStyleCap
  
  /* 1 */ val xlCap: xlCap with scala.Double = js.native
  /* 2 */ val xlNoCap: xlNoCap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlEndStyleCap with scala.Double] = js.native
}

