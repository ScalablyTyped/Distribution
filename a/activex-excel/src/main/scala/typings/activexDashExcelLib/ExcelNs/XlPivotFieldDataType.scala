package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotFieldDataType extends js.Object

@JSGlobal("Excel.XlPivotFieldDataType")
@js.native
object XlPivotFieldDataType extends js.Object {
  @js.native
  sealed trait xlDate
    extends activexDashExcelLib.ExcelNs.XlPivotFieldDataType
  
  @js.native
  sealed trait xlNumber
    extends activexDashExcelLib.ExcelNs.XlPivotFieldDataType
  
  @js.native
  sealed trait xlText
    extends activexDashExcelLib.ExcelNs.XlPivotFieldDataType
  
  /* 2 */ val xlDate: xlDate with scala.Double = js.native
  /* -4145 */ val xlNumber: xlNumber with scala.Double = js.native
  /* -4158 */ val xlText: xlText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotFieldDataType with scala.Double] = js.native
}

