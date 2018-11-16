package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFormulaLabel extends js.Object

@JSGlobal("Excel.XlFormulaLabel")
@js.native
object XlFormulaLabel extends js.Object {
  @js.native
  sealed trait xlColumnLabels
    extends activexDashExcelLib.ExcelNs.XlFormulaLabel
  
  @js.native
  sealed trait xlMixedLabels
    extends activexDashExcelLib.ExcelNs.XlFormulaLabel
  
  @js.native
  sealed trait xlNoLabels
    extends activexDashExcelLib.ExcelNs.XlFormulaLabel
  
  @js.native
  sealed trait xlRowLabels
    extends activexDashExcelLib.ExcelNs.XlFormulaLabel
  
  /* 2 */ val xlColumnLabels: xlColumnLabels with scala.Double = js.native
  /* 3 */ val xlMixedLabels: xlMixedLabels with scala.Double = js.native
  /* -4142 */ val xlNoLabels: xlNoLabels with scala.Double = js.native
  /* 1 */ val xlRowLabels: xlRowLabels with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFormulaLabel with scala.Double] = js.native
}

