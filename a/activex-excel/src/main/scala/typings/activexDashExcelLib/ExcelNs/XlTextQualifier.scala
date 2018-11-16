package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTextQualifier extends js.Object

@JSGlobal("Excel.XlTextQualifier")
@js.native
object XlTextQualifier extends js.Object {
  @js.native
  sealed trait xlTextQualifierDoubleQuote
    extends activexDashExcelLib.ExcelNs.XlTextQualifier
  
  @js.native
  sealed trait xlTextQualifierNone
    extends activexDashExcelLib.ExcelNs.XlTextQualifier
  
  @js.native
  sealed trait xlTextQualifierSingleQuote
    extends activexDashExcelLib.ExcelNs.XlTextQualifier
  
  /* 1 */ val xlTextQualifierDoubleQuote: xlTextQualifierDoubleQuote with scala.Double = js.native
  /* -4142 */ val xlTextQualifierNone: xlTextQualifierNone with scala.Double = js.native
  /* 2 */ val xlTextQualifierSingleQuote: xlTextQualifierSingleQuote with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTextQualifier with scala.Double] = js.native
}

