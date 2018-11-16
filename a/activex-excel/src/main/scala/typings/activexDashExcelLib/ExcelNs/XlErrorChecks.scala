package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorChecks extends js.Object

@JSGlobal("Excel.XlErrorChecks")
@js.native
object XlErrorChecks extends js.Object {
  @js.native
  sealed trait xlEmptyCellReferences
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlEvaluateToError
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlInconsistentFormula
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlInconsistentListFormula
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlListDataValidation
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlNumberAsText
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlOmittedCells
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlTextDate
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  @js.native
  sealed trait xlUnlockedFormulaCells
    extends activexDashExcelLib.ExcelNs.XlErrorChecks
  
  /* 7 */ val xlEmptyCellReferences: xlEmptyCellReferences with scala.Double = js.native
  /* 1 */ val xlEvaluateToError: xlEvaluateToError with scala.Double = js.native
  /* 4 */ val xlInconsistentFormula: xlInconsistentFormula with scala.Double = js.native
  /* 9 */ val xlInconsistentListFormula: xlInconsistentListFormula with scala.Double = js.native
  /* 8 */ val xlListDataValidation: xlListDataValidation with scala.Double = js.native
  /* 3 */ val xlNumberAsText: xlNumberAsText with scala.Double = js.native
  /* 5 */ val xlOmittedCells: xlOmittedCells with scala.Double = js.native
  /* 2 */ val xlTextDate: xlTextDate with scala.Double = js.native
  /* 6 */ val xlUnlockedFormulaCells: xlUnlockedFormulaCells with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlErrorChecks with scala.Double] = js.native
}

