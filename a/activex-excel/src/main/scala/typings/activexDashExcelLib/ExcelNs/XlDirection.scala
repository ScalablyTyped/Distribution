package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDirection extends js.Object

@JSGlobal("Excel.XlDirection")
@js.native
object XlDirection extends js.Object {
  @js.native
  sealed trait xlDown
    extends activexDashExcelLib.ExcelNs.XlDirection
  
  @js.native
  sealed trait xlToLeft
    extends activexDashExcelLib.ExcelNs.XlDirection
  
  @js.native
  sealed trait xlToRight
    extends activexDashExcelLib.ExcelNs.XlDirection
  
  @js.native
  sealed trait xlUp
    extends activexDashExcelLib.ExcelNs.XlDirection
  
  /* -4121 */ val xlDown: xlDown with scala.Double = js.native
  /* -4159 */ val xlToLeft: xlToLeft with scala.Double = js.native
  /* -4161 */ val xlToRight: xlToRight with scala.Double = js.native
  /* -4162 */ val xlUp: xlUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDirection with scala.Double] = js.native
}

