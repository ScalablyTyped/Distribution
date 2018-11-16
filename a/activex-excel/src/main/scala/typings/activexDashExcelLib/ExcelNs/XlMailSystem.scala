package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlMailSystem extends js.Object

@JSGlobal("Excel.XlMailSystem")
@js.native
object XlMailSystem extends js.Object {
  @js.native
  sealed trait xlMAPI
    extends activexDashExcelLib.ExcelNs.XlMailSystem
  
  @js.native
  sealed trait xlNoMailSystem
    extends activexDashExcelLib.ExcelNs.XlMailSystem
  
  @js.native
  sealed trait xlPowerTalk
    extends activexDashExcelLib.ExcelNs.XlMailSystem
  
  /* 1 */ val xlMAPI: xlMAPI with scala.Double = js.native
  /* 0 */ val xlNoMailSystem: xlNoMailSystem with scala.Double = js.native
  /* 2 */ val xlPowerTalk: xlPowerTalk with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlMailSystem with scala.Double] = js.native
}

