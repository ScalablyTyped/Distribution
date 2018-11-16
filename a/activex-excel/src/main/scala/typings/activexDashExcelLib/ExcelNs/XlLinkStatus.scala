package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLinkStatus extends js.Object

@JSGlobal("Excel.XlLinkStatus")
@js.native
object XlLinkStatus extends js.Object {
  @js.native
  sealed trait xlLinkStatusCopiedValues
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusIndeterminate
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusInvalidName
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusMissingFile
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusMissingSheet
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusNotStarted
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusOK
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusOld
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusSourceNotCalculated
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusSourceNotOpen
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  @js.native
  sealed trait xlLinkStatusSourceOpen
    extends activexDashExcelLib.ExcelNs.XlLinkStatus
  
  /* 10 */ val xlLinkStatusCopiedValues: xlLinkStatusCopiedValues with scala.Double = js.native
  /* 5 */ val xlLinkStatusIndeterminate: xlLinkStatusIndeterminate with scala.Double = js.native
  /* 7 */ val xlLinkStatusInvalidName: xlLinkStatusInvalidName with scala.Double = js.native
  /* 1 */ val xlLinkStatusMissingFile: xlLinkStatusMissingFile with scala.Double = js.native
  /* 2 */ val xlLinkStatusMissingSheet: xlLinkStatusMissingSheet with scala.Double = js.native
  /* 6 */ val xlLinkStatusNotStarted: xlLinkStatusNotStarted with scala.Double = js.native
  /* 0 */ val xlLinkStatusOK: xlLinkStatusOK with scala.Double = js.native
  /* 3 */ val xlLinkStatusOld: xlLinkStatusOld with scala.Double = js.native
  /* 4 */ val xlLinkStatusSourceNotCalculated: xlLinkStatusSourceNotCalculated with scala.Double = js.native
  /* 8 */ val xlLinkStatusSourceNotOpen: xlLinkStatusSourceNotOpen with scala.Double = js.native
  /* 9 */ val xlLinkStatusSourceOpen: xlLinkStatusSourceOpen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLinkStatus with scala.Double] = js.native
}

