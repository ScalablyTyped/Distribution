package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPieSliceIndex extends js.Object

@JSGlobal("Excel.XlPieSliceIndex")
@js.native
object XlPieSliceIndex extends js.Object {
  @js.native
  sealed trait xlCenterPoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlInnerCenterPoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlInnerClockwisePoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlInnerCounterClockwisePoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlMidClockwiseRadiusPoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlMidCounterClockwiseRadiusPoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlOuterCenterPoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlOuterClockwisePoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  @js.native
  sealed trait xlOuterCounterClockwisePoint
    extends activexDashExcelLib.ExcelNs.XlPieSliceIndex
  
  /* 5 */ val xlCenterPoint: xlCenterPoint with scala.Double = js.native
  /* 8 */ val xlInnerCenterPoint: xlInnerCenterPoint with scala.Double = js.native
  /* 7 */ val xlInnerClockwisePoint: xlInnerClockwisePoint with scala.Double = js.native
  /* 9 */ val xlInnerCounterClockwisePoint: xlInnerCounterClockwisePoint with scala.Double = js.native
  /* 4 */ val xlMidClockwiseRadiusPoint: xlMidClockwiseRadiusPoint with scala.Double = js.native
  /* 6 */ val xlMidCounterClockwiseRadiusPoint: xlMidCounterClockwiseRadiusPoint with scala.Double = js.native
  /* 2 */ val xlOuterCenterPoint: xlOuterCenterPoint with scala.Double = js.native
  /* 3 */ val xlOuterClockwisePoint: xlOuterClockwisePoint with scala.Double = js.native
  /* 1 */ val xlOuterCounterClockwisePoint: xlOuterCounterClockwisePoint with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPieSliceIndex with scala.Double] = js.native
}

