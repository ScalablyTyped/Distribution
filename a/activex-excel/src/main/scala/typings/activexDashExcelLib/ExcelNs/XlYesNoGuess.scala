package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlYesNoGuess extends js.Object

@JSGlobal("Excel.XlYesNoGuess")
@js.native
object XlYesNoGuess extends js.Object {
  @js.native
  sealed trait xlGuess
    extends activexDashExcelLib.ExcelNs.XlYesNoGuess
  
  @js.native
  sealed trait xlNo
    extends activexDashExcelLib.ExcelNs.XlYesNoGuess
  
  @js.native
  sealed trait xlYes
    extends activexDashExcelLib.ExcelNs.XlYesNoGuess
  
  /* 0 */ val xlGuess: xlGuess with scala.Double = js.native
  /* 2 */ val xlNo: xlNo with scala.Double = js.native
  /* 1 */ val xlYes: xlYes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlYesNoGuess with scala.Double] = js.native
}

