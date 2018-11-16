package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartSplitType extends js.Object

@JSGlobal("Excel.XlChartSplitType")
@js.native
object XlChartSplitType extends js.Object {
  @js.native
  sealed trait xlSplitByCustomSplit
    extends activexDashExcelLib.ExcelNs.XlChartSplitType
  
  @js.native
  sealed trait xlSplitByPercentValue
    extends activexDashExcelLib.ExcelNs.XlChartSplitType
  
  @js.native
  sealed trait xlSplitByPosition
    extends activexDashExcelLib.ExcelNs.XlChartSplitType
  
  @js.native
  sealed trait xlSplitByValue
    extends activexDashExcelLib.ExcelNs.XlChartSplitType
  
  /* 4 */ val xlSplitByCustomSplit: xlSplitByCustomSplit with scala.Double = js.native
  /* 3 */ val xlSplitByPercentValue: xlSplitByPercentValue with scala.Double = js.native
  /* 1 */ val xlSplitByPosition: xlSplitByPosition with scala.Double = js.native
  /* 2 */ val xlSplitByValue: xlSplitByValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlChartSplitType with scala.Double] = js.native
}

