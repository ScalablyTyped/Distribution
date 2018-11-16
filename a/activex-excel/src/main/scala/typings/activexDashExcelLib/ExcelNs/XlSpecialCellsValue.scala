package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSpecialCellsValue extends js.Object

@JSGlobal("Excel.XlSpecialCellsValue")
@js.native
object XlSpecialCellsValue extends js.Object {
  @js.native
  sealed trait xlErrors
    extends activexDashExcelLib.ExcelNs.XlSpecialCellsValue
  
  @js.native
  sealed trait xlLogical
    extends activexDashExcelLib.ExcelNs.XlSpecialCellsValue
  
  @js.native
  sealed trait xlNumbers
    extends activexDashExcelLib.ExcelNs.XlSpecialCellsValue
  
  @js.native
  sealed trait xlTextValues
    extends activexDashExcelLib.ExcelNs.XlSpecialCellsValue
  
  /* 16 */ val xlErrors: xlErrors with scala.Double = js.native
  /* 4 */ val xlLogical: xlLogical with scala.Double = js.native
  /* 1 */ val xlNumbers: xlNumbers with scala.Double = js.native
  /* 2 */ val xlTextValues: xlTextValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSpecialCellsValue with scala.Double] = js.native
}

