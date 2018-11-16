package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlWindowType extends js.Object

@JSGlobal("Excel.XlWindowType")
@js.native
object XlWindowType extends js.Object {
  @js.native
  sealed trait xlChartAsWindow
    extends activexDashExcelLib.ExcelNs.XlWindowType
  
  @js.native
  sealed trait xlChartInPlace
    extends activexDashExcelLib.ExcelNs.XlWindowType
  
  @js.native
  sealed trait xlClipboard
    extends activexDashExcelLib.ExcelNs.XlWindowType
  
  @js.native
  sealed trait xlInfo
    extends activexDashExcelLib.ExcelNs.XlWindowType
  
  @js.native
  sealed trait xlWorkbook
    extends activexDashExcelLib.ExcelNs.XlWindowType
  
  /* 5 */ val xlChartAsWindow: xlChartAsWindow with scala.Double = js.native
  /* 4 */ val xlChartInPlace: xlChartInPlace with scala.Double = js.native
  /* 3 */ val xlClipboard: xlClipboard with scala.Double = js.native
  /* -4129 */ val xlInfo: xlInfo with scala.Double = js.native
  /* 1 */ val xlWorkbook: xlWorkbook with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlWindowType with scala.Double] = js.native
}

