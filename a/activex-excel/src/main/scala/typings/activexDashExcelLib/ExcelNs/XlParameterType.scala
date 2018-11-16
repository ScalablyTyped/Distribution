package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlParameterType extends js.Object

@JSGlobal("Excel.XlParameterType")
@js.native
object XlParameterType extends js.Object {
  @js.native
  sealed trait xlConstant
    extends activexDashExcelLib.ExcelNs.XlParameterType
  
  @js.native
  sealed trait xlPrompt
    extends activexDashExcelLib.ExcelNs.XlParameterType
  
  @js.native
  sealed trait xlRange
    extends activexDashExcelLib.ExcelNs.XlParameterType
  
  /* 1 */ val xlConstant: xlConstant with scala.Double = js.native
  /* 0 */ val xlPrompt: xlPrompt with scala.Double = js.native
  /* 2 */ val xlRange: xlRange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlParameterType with scala.Double] = js.native
}

