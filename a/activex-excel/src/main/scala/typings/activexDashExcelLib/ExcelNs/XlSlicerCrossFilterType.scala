package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSlicerCrossFilterType extends js.Object

@JSGlobal("Excel.XlSlicerCrossFilterType")
@js.native
object XlSlicerCrossFilterType extends js.Object {
  @js.native
  sealed trait xlSlicerCrossFilterShowItemsWithDataAtTop
    extends activexDashExcelLib.ExcelNs.XlSlicerCrossFilterType
  
  @js.native
  sealed trait xlSlicerCrossFilterShowItemsWithNoData
    extends activexDashExcelLib.ExcelNs.XlSlicerCrossFilterType
  
  @js.native
  sealed trait xlSlicerNoCrossFilter
    extends activexDashExcelLib.ExcelNs.XlSlicerCrossFilterType
  
  /* 2 */ val xlSlicerCrossFilterShowItemsWithDataAtTop: xlSlicerCrossFilterShowItemsWithDataAtTop with scala.Double = js.native
  /* 3 */ val xlSlicerCrossFilterShowItemsWithNoData: xlSlicerCrossFilterShowItemsWithNoData with scala.Double = js.native
  /* 1 */ val xlSlicerNoCrossFilter: xlSlicerNoCrossFilter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSlicerCrossFilterType with scala.Double] = js.native
}

