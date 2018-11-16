package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEditionFormat extends js.Object

@JSGlobal("Excel.XlEditionFormat")
@js.native
object XlEditionFormat extends js.Object {
  @js.native
  sealed trait xlBIFF
    extends activexDashExcelLib.ExcelNs.XlEditionFormat
  
  @js.native
  sealed trait xlPICT
    extends activexDashExcelLib.ExcelNs.XlEditionFormat
  
  @js.native
  sealed trait xlRTF
    extends activexDashExcelLib.ExcelNs.XlEditionFormat
  
  @js.native
  sealed trait xlVALU
    extends activexDashExcelLib.ExcelNs.XlEditionFormat
  
  /* 2 */ val xlBIFF: xlBIFF with scala.Double = js.native
  /* 1 */ val xlPICT: xlPICT with scala.Double = js.native
  /* 4 */ val xlRTF: xlRTF with scala.Double = js.native
  /* 8 */ val xlVALU: xlVALU with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlEditionFormat with scala.Double] = js.native
}

