package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlUpdateLinks extends js.Object

@JSGlobal("Excel.XlUpdateLinks")
@js.native
object XlUpdateLinks extends js.Object {
  @js.native
  sealed trait xlUpdateLinksAlways
    extends activexDashExcelLib.ExcelNs.XlUpdateLinks
  
  @js.native
  sealed trait xlUpdateLinksNever
    extends activexDashExcelLib.ExcelNs.XlUpdateLinks
  
  @js.native
  sealed trait xlUpdateLinksUserSetting
    extends activexDashExcelLib.ExcelNs.XlUpdateLinks
  
  /* 3 */ val xlUpdateLinksAlways: xlUpdateLinksAlways with scala.Double = js.native
  /* 2 */ val xlUpdateLinksNever: xlUpdateLinksNever with scala.Double = js.native
  /* 1 */ val xlUpdateLinksUserSetting: xlUpdateLinksUserSetting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlUpdateLinks with scala.Double] = js.native
}

