package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPlatform extends js.Object

@JSGlobal("Excel.XlPlatform")
@js.native
object XlPlatform extends js.Object {
  @js.native
  sealed trait xlMSDOS
    extends activexDashExcelLib.ExcelNs.XlPlatform
  
  @js.native
  sealed trait xlMacintosh
    extends activexDashExcelLib.ExcelNs.XlPlatform
  
  @js.native
  sealed trait xlWindows
    extends activexDashExcelLib.ExcelNs.XlPlatform
  
  /* 3 */ val xlMSDOS: xlMSDOS with scala.Double = js.native
  /* 1 */ val xlMacintosh: xlMacintosh with scala.Double = js.native
  /* 2 */ val xlWindows: xlWindows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPlatform with scala.Double] = js.native
}

