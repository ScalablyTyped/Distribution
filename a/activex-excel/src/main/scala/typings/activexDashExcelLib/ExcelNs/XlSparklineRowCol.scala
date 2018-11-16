package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSparklineRowCol extends js.Object

@JSGlobal("Excel.XlSparklineRowCol")
@js.native
object XlSparklineRowCol extends js.Object {
  @js.native
  sealed trait xlSparklineColumnsSquare
    extends activexDashExcelLib.ExcelNs.XlSparklineRowCol
  
  @js.native
  sealed trait xlSparklineNonSquare
    extends activexDashExcelLib.ExcelNs.XlSparklineRowCol
  
  @js.native
  sealed trait xlSparklineRowsSquare
    extends activexDashExcelLib.ExcelNs.XlSparklineRowCol
  
  /* 2 */ val xlSparklineColumnsSquare: xlSparklineColumnsSquare with scala.Double = js.native
  /* 0 */ val xlSparklineNonSquare: xlSparklineNonSquare with scala.Double = js.native
  /* 1 */ val xlSparklineRowsSquare: xlSparklineRowsSquare with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSparklineRowCol with scala.Double] = js.native
}

