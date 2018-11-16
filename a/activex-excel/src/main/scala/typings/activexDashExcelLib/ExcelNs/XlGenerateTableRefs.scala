package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlGenerateTableRefs extends js.Object

@JSGlobal("Excel.XlGenerateTableRefs")
@js.native
object XlGenerateTableRefs extends js.Object {
  @js.native
  sealed trait xlGenerateTableRefA1
    extends activexDashExcelLib.ExcelNs.XlGenerateTableRefs
  
  @js.native
  sealed trait xlGenerateTableRefStruct
    extends activexDashExcelLib.ExcelNs.XlGenerateTableRefs
  
  /* 0 */ val xlGenerateTableRefA1: xlGenerateTableRefA1 with scala.Double = js.native
  /* 1 */ val xlGenerateTableRefStruct: xlGenerateTableRefStruct with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlGenerateTableRefs with scala.Double] = js.native
}

