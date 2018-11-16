package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartLocation extends js.Object

@JSGlobal("Excel.XlChartLocation")
@js.native
object XlChartLocation extends js.Object {
  @js.native
  sealed trait xlLocationAsNewSheet
    extends activexDashExcelLib.ExcelNs.XlChartLocation
  
  @js.native
  sealed trait xlLocationAsObject
    extends activexDashExcelLib.ExcelNs.XlChartLocation
  
  @js.native
  sealed trait xlLocationAutomatic
    extends activexDashExcelLib.ExcelNs.XlChartLocation
  
  /* 1 */ val xlLocationAsNewSheet: xlLocationAsNewSheet with scala.Double = js.native
  /* 2 */ val xlLocationAsObject: xlLocationAsObject with scala.Double = js.native
  /* 3 */ val xlLocationAutomatic: xlLocationAutomatic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlChartLocation with scala.Double] = js.native
}

