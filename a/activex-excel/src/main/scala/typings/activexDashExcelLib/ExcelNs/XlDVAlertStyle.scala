package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDVAlertStyle extends js.Object

@JSGlobal("Excel.XlDVAlertStyle")
@js.native
object XlDVAlertStyle extends js.Object {
  @js.native
  sealed trait xlValidAlertInformation
    extends activexDashExcelLib.ExcelNs.XlDVAlertStyle
  
  @js.native
  sealed trait xlValidAlertStop
    extends activexDashExcelLib.ExcelNs.XlDVAlertStyle
  
  @js.native
  sealed trait xlValidAlertWarning
    extends activexDashExcelLib.ExcelNs.XlDVAlertStyle
  
  /* 3 */ val xlValidAlertInformation: xlValidAlertInformation with scala.Double = js.native
  /* 1 */ val xlValidAlertStop: xlValidAlertStop with scala.Double = js.native
  /* 2 */ val xlValidAlertWarning: xlValidAlertWarning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDVAlertStyle with scala.Double] = js.native
}

