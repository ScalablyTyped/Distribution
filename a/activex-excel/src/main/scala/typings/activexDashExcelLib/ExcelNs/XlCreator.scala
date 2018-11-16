package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCreator extends js.Object

@JSGlobal("Excel.XlCreator")
@js.native
object XlCreator extends js.Object {
  @js.native
  sealed trait xlCreatorCode
    extends activexDashExcelLib.ExcelNs.XlCreator
  
  /* 1480803660 */ val xlCreatorCode: xlCreatorCode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCreator with scala.Double] = js.native
}

