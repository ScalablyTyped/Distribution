package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlMousePointer extends js.Object

@JSGlobal("Excel.XlMousePointer")
@js.native
object XlMousePointer extends js.Object {
  @js.native
  sealed trait xlDefault
    extends activexDashExcelLib.ExcelNs.XlMousePointer
  
  @js.native
  sealed trait xlIBeam
    extends activexDashExcelLib.ExcelNs.XlMousePointer
  
  @js.native
  sealed trait xlNorthwestArrow
    extends activexDashExcelLib.ExcelNs.XlMousePointer
  
  @js.native
  sealed trait xlWait
    extends activexDashExcelLib.ExcelNs.XlMousePointer
  
  /* -4143 */ val xlDefault: xlDefault with scala.Double = js.native
  /* 3 */ val xlIBeam: xlIBeam with scala.Double = js.native
  /* 1 */ val xlNorthwestArrow: xlNorthwestArrow with scala.Double = js.native
  /* 2 */ val xlWait: xlWait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlMousePointer with scala.Double] = js.native
}

