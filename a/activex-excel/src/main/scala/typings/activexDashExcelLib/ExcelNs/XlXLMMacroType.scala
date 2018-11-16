package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlXLMMacroType extends js.Object

@JSGlobal("Excel.XlXLMMacroType")
@js.native
object XlXLMMacroType extends js.Object {
  @js.native
  sealed trait xlCommand
    extends activexDashExcelLib.ExcelNs.XlXLMMacroType
  
  @js.native
  sealed trait xlFunction
    extends activexDashExcelLib.ExcelNs.XlXLMMacroType
  
  @js.native
  sealed trait xlNotXLM
    extends activexDashExcelLib.ExcelNs.XlXLMMacroType
  
  /* 2 */ val xlCommand: xlCommand with scala.Double = js.native
  /* 1 */ val xlFunction: xlFunction with scala.Double = js.native
  /* 3 */ val xlNotXLM: xlNotXLM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlXLMMacroType with scala.Double] = js.native
}

