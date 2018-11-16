package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataLabelPosition extends js.Object

@JSGlobal("Excel.XlDataLabelPosition")
@js.native
object XlDataLabelPosition extends js.Object {
  @js.native
  sealed trait xlLabelPositionAbove
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionBelow
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionBestFit
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionCenter
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionCustom
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionInsideBase
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionInsideEnd
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionLeft
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionMixed
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionOutsideEnd
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  @js.native
  sealed trait xlLabelPositionRight
    extends activexDashExcelLib.ExcelNs.XlDataLabelPosition
  
  /* 0 */ val xlLabelPositionAbove: xlLabelPositionAbove with scala.Double = js.native
  /* 1 */ val xlLabelPositionBelow: xlLabelPositionBelow with scala.Double = js.native
  /* 5 */ val xlLabelPositionBestFit: xlLabelPositionBestFit with scala.Double = js.native
  /* -4108 */ val xlLabelPositionCenter: xlLabelPositionCenter with scala.Double = js.native
  /* 7 */ val xlLabelPositionCustom: xlLabelPositionCustom with scala.Double = js.native
  /* 4 */ val xlLabelPositionInsideBase: xlLabelPositionInsideBase with scala.Double = js.native
  /* 3 */ val xlLabelPositionInsideEnd: xlLabelPositionInsideEnd with scala.Double = js.native
  /* -4131 */ val xlLabelPositionLeft: xlLabelPositionLeft with scala.Double = js.native
  /* 6 */ val xlLabelPositionMixed: xlLabelPositionMixed with scala.Double = js.native
  /* 2 */ val xlLabelPositionOutsideEnd: xlLabelPositionOutsideEnd with scala.Double = js.native
  /* -4152 */ val xlLabelPositionRight: xlLabelPositionRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataLabelPosition with scala.Double] = js.native
}

