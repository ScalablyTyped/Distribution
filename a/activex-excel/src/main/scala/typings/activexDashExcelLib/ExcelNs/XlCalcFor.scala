package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCalcFor extends js.Object

@JSGlobal("Excel.XlCalcFor")
@js.native
object XlCalcFor extends js.Object {
  @js.native
  sealed trait xlAllValues
    extends activexDashExcelLib.ExcelNs.XlCalcFor
  
  @js.native
  sealed trait xlColGroups
    extends activexDashExcelLib.ExcelNs.XlCalcFor
  
  @js.native
  sealed trait xlRowGroups
    extends activexDashExcelLib.ExcelNs.XlCalcFor
  
  /* 0 */ val xlAllValues: xlAllValues with scala.Double = js.native
  /* 2 */ val xlColGroups: xlColGroups with scala.Double = js.native
  /* 1 */ val xlRowGroups: xlRowGroups with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCalcFor with scala.Double] = js.native
}

