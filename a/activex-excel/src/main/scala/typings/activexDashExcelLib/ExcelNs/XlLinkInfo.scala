package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLinkInfo extends js.Object

@JSGlobal("Excel.XlLinkInfo")
@js.native
object XlLinkInfo extends js.Object {
  @js.native
  sealed trait xlEditionDate
    extends activexDashExcelLib.ExcelNs.XlLinkInfo
  
  @js.native
  sealed trait xlLinkInfoStatus
    extends activexDashExcelLib.ExcelNs.XlLinkInfo
  
  @js.native
  sealed trait xlUpdateState
    extends activexDashExcelLib.ExcelNs.XlLinkInfo
  
  /* 2 */ val xlEditionDate: xlEditionDate with scala.Double = js.native
  /* 3 */ val xlLinkInfoStatus: xlLinkInfoStatus with scala.Double = js.native
  /* 1 */ val xlUpdateState: xlUpdateState with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLinkInfo with scala.Double] = js.native
}

