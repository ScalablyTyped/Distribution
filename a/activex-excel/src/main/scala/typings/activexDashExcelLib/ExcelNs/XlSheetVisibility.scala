package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSheetVisibility extends js.Object

@JSGlobal("Excel.XlSheetVisibility")
@js.native
object XlSheetVisibility extends js.Object {
  @js.native
  sealed trait xlSheetHidden
    extends activexDashExcelLib.ExcelNs.XlSheetVisibility
  
  @js.native
  sealed trait xlSheetVeryHidden
    extends activexDashExcelLib.ExcelNs.XlSheetVisibility
  
  @js.native
  sealed trait xlSheetVisible
    extends activexDashExcelLib.ExcelNs.XlSheetVisibility
  
  /* 0 */ val xlSheetHidden: xlSheetHidden with scala.Double = js.native
  /* 2 */ val xlSheetVeryHidden: xlSheetVeryHidden with scala.Double = js.native
  /* -1 */ val xlSheetVisible: xlSheetVisible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSheetVisibility with scala.Double] = js.native
}

