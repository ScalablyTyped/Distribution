package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSparkScale extends js.Object

@JSGlobal("Excel.XlSparkScale")
@js.native
object XlSparkScale extends js.Object {
  @js.native
  sealed trait xlSparkScaleCustom
    extends activexDashExcelLib.ExcelNs.XlSparkScale
  
  @js.native
  sealed trait xlSparkScaleGroup
    extends activexDashExcelLib.ExcelNs.XlSparkScale
  
  @js.native
  sealed trait xlSparkScaleSingle
    extends activexDashExcelLib.ExcelNs.XlSparkScale
  
  /* 3 */ val xlSparkScaleCustom: xlSparkScaleCustom with scala.Double = js.native
  /* 1 */ val xlSparkScaleGroup: xlSparkScaleGroup with scala.Double = js.native
  /* 2 */ val xlSparkScaleSingle: xlSparkScaleSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSparkScale with scala.Double] = js.native
}

