package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotConditionScope extends js.Object

@JSGlobal("Excel.XlPivotConditionScope")
@js.native
object XlPivotConditionScope extends js.Object {
  @js.native
  sealed trait xlDataFieldScope
    extends activexDashExcelLib.ExcelNs.XlPivotConditionScope
  
  @js.native
  sealed trait xlFieldsScope
    extends activexDashExcelLib.ExcelNs.XlPivotConditionScope
  
  @js.native
  sealed trait xlSelectionScope
    extends activexDashExcelLib.ExcelNs.XlPivotConditionScope
  
  /* 2 */ val xlDataFieldScope: xlDataFieldScope with scala.Double = js.native
  /* 1 */ val xlFieldsScope: xlFieldsScope with scala.Double = js.native
  /* 0 */ val xlSelectionScope: xlSelectionScope with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotConditionScope with scala.Double] = js.native
}

