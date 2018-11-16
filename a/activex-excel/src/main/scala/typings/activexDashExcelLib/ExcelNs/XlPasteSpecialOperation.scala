package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPasteSpecialOperation extends js.Object

@JSGlobal("Excel.XlPasteSpecialOperation")
@js.native
object XlPasteSpecialOperation extends js.Object {
  @js.native
  sealed trait xlPasteSpecialOperationAdd
    extends activexDashExcelLib.ExcelNs.XlPasteSpecialOperation
  
  @js.native
  sealed trait xlPasteSpecialOperationDivide
    extends activexDashExcelLib.ExcelNs.XlPasteSpecialOperation
  
  @js.native
  sealed trait xlPasteSpecialOperationMultiply
    extends activexDashExcelLib.ExcelNs.XlPasteSpecialOperation
  
  @js.native
  sealed trait xlPasteSpecialOperationNone
    extends activexDashExcelLib.ExcelNs.XlPasteSpecialOperation
  
  @js.native
  sealed trait xlPasteSpecialOperationSubtract
    extends activexDashExcelLib.ExcelNs.XlPasteSpecialOperation
  
  /* 2 */ val xlPasteSpecialOperationAdd: xlPasteSpecialOperationAdd with scala.Double = js.native
  /* 5 */ val xlPasteSpecialOperationDivide: xlPasteSpecialOperationDivide with scala.Double = js.native
  /* 4 */ val xlPasteSpecialOperationMultiply: xlPasteSpecialOperationMultiply with scala.Double = js.native
  /* -4142 */ val xlPasteSpecialOperationNone: xlPasteSpecialOperationNone with scala.Double = js.native
  /* 3 */ val xlPasteSpecialOperationSubtract: xlPasteSpecialOperationSubtract with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPasteSpecialOperation with scala.Double] = js.native
}

