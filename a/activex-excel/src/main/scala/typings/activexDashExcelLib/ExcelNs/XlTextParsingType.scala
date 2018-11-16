package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTextParsingType extends js.Object

@JSGlobal("Excel.XlTextParsingType")
@js.native
object XlTextParsingType extends js.Object {
  @js.native
  sealed trait xlDelimited
    extends activexDashExcelLib.ExcelNs.XlTextParsingType
  
  @js.native
  sealed trait xlFixedWidth
    extends activexDashExcelLib.ExcelNs.XlTextParsingType
  
  /* 1 */ val xlDelimited: xlDelimited with scala.Double = js.native
  /* 2 */ val xlFixedWidth: xlFixedWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTextParsingType with scala.Double] = js.native
}

