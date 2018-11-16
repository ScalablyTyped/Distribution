package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlContainsOperator extends js.Object

@JSGlobal("Excel.XlContainsOperator")
@js.native
object XlContainsOperator extends js.Object {
  @js.native
  sealed trait xlBeginsWith
    extends activexDashExcelLib.ExcelNs.XlContainsOperator
  
  @js.native
  sealed trait xlContains
    extends activexDashExcelLib.ExcelNs.XlContainsOperator
  
  @js.native
  sealed trait xlDoesNotContain
    extends activexDashExcelLib.ExcelNs.XlContainsOperator
  
  @js.native
  sealed trait xlEndsWith
    extends activexDashExcelLib.ExcelNs.XlContainsOperator
  
  /* 2 */ val xlBeginsWith: xlBeginsWith with scala.Double = js.native
  /* 0 */ val xlContains: xlContains with scala.Double = js.native
  /* 1 */ val xlDoesNotContain: xlDoesNotContain with scala.Double = js.native
  /* 3 */ val xlEndsWith: xlEndsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlContainsOperator with scala.Double] = js.native
}

