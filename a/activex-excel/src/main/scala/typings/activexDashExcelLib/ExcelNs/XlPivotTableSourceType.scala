package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotTableSourceType extends js.Object

@JSGlobal("Excel.XlPivotTableSourceType")
@js.native
object XlPivotTableSourceType extends js.Object {
  @js.native
  sealed trait xlConsolidation
    extends activexDashExcelLib.ExcelNs.XlPivotTableSourceType
  
  @js.native
  sealed trait xlDatabase
    extends activexDashExcelLib.ExcelNs.XlPivotTableSourceType
  
  @js.native
  sealed trait xlExternal
    extends activexDashExcelLib.ExcelNs.XlPivotTableSourceType
  
  @js.native
  sealed trait xlPivotTable
    extends activexDashExcelLib.ExcelNs.XlPivotTableSourceType
  
  @js.native
  sealed trait xlScenario
    extends activexDashExcelLib.ExcelNs.XlPivotTableSourceType
  
  /* 3 */ val xlConsolidation: xlConsolidation with scala.Double = js.native
  /* 1 */ val xlDatabase: xlDatabase with scala.Double = js.native
  /* 2 */ val xlExternal: xlExternal with scala.Double = js.native
  /* -4148 */ val xlPivotTable: xlPivotTable with scala.Double = js.native
  /* 4 */ val xlScenario: xlScenario with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotTableSourceType with scala.Double] = js.native
}

