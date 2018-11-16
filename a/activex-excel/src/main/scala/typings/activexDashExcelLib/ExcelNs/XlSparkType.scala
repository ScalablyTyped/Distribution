package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSparkType extends js.Object

@JSGlobal("Excel.XlSparkType")
@js.native
object XlSparkType extends js.Object {
  @js.native
  sealed trait xlSparkColumn
    extends activexDashExcelLib.ExcelNs.XlSparkType
  
  @js.native
  sealed trait xlSparkColumnStacked100
    extends activexDashExcelLib.ExcelNs.XlSparkType
  
  @js.native
  sealed trait xlSparkLine
    extends activexDashExcelLib.ExcelNs.XlSparkType
  
  /* 2 */ val xlSparkColumn: xlSparkColumn with scala.Double = js.native
  /* 3 */ val xlSparkColumnStacked100: xlSparkColumnStacked100 with scala.Double = js.native
  /* 1 */ val xlSparkLine: xlSparkLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSparkType with scala.Double] = js.native
}

