package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartSplitType extends js.Object

@JSGlobal("Office.XlChartSplitType")
@js.native
object XlChartSplitType extends js.Object {
  @js.native
  sealed trait xlSplitByCustomSplit
    extends activexDashOfficeLib.OfficeNs.XlChartSplitType
  
  @js.native
  sealed trait xlSplitByPercentValue
    extends activexDashOfficeLib.OfficeNs.XlChartSplitType
  
  @js.native
  sealed trait xlSplitByPosition
    extends activexDashOfficeLib.OfficeNs.XlChartSplitType
  
  @js.native
  sealed trait xlSplitByValue
    extends activexDashOfficeLib.OfficeNs.XlChartSplitType
  
  /* 4 */ val xlSplitByCustomSplit: xlSplitByCustomSplit with scala.Double = js.native
  /* 3 */ val xlSplitByPercentValue: xlSplitByPercentValue with scala.Double = js.native
  /* 1 */ val xlSplitByPosition: xlSplitByPosition with scala.Double = js.native
  /* 2 */ val xlSplitByValue: xlSplitByValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlChartSplitType with scala.Double] = js.native
}

