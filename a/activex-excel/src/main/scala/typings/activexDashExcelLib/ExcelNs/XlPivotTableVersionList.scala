package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotTableVersionList extends js.Object

@JSGlobal("Excel.XlPivotTableVersionList")
@js.native
object XlPivotTableVersionList extends js.Object {
  @js.native
  sealed trait xlPivotTableVersion10
    extends activexDashExcelLib.ExcelNs.XlPivotTableVersionList
  
  @js.native
  sealed trait xlPivotTableVersion11
    extends activexDashExcelLib.ExcelNs.XlPivotTableVersionList
  
  @js.native
  sealed trait xlPivotTableVersion12
    extends activexDashExcelLib.ExcelNs.XlPivotTableVersionList
  
  @js.native
  sealed trait xlPivotTableVersion14
    extends activexDashExcelLib.ExcelNs.XlPivotTableVersionList
  
  @js.native
  sealed trait xlPivotTableVersion2000
    extends activexDashExcelLib.ExcelNs.XlPivotTableVersionList
  
  @js.native
  sealed trait xlPivotTableVersionCurrent
    extends activexDashExcelLib.ExcelNs.XlPivotTableVersionList
  
  /* 1 */ val xlPivotTableVersion10: xlPivotTableVersion10 with scala.Double = js.native
  /* 2 */ val xlPivotTableVersion11: xlPivotTableVersion11 with scala.Double = js.native
  /* 3 */ val xlPivotTableVersion12: xlPivotTableVersion12 with scala.Double = js.native
  /* 4 */ val xlPivotTableVersion14: xlPivotTableVersion14 with scala.Double = js.native
  /* 0 */ val xlPivotTableVersion2000: xlPivotTableVersion2000 with scala.Double = js.native
  /* -1 */ val xlPivotTableVersionCurrent: xlPivotTableVersionCurrent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotTableVersionList with scala.Double] = js.native
}

