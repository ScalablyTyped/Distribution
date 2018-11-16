package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlOartVerticalOverflow extends js.Object

@JSGlobal("Excel.XlOartVerticalOverflow")
@js.native
object XlOartVerticalOverflow extends js.Object {
  @js.native
  sealed trait xlOartVerticalOverflowClip
    extends activexDashExcelLib.ExcelNs.XlOartVerticalOverflow
  
  @js.native
  sealed trait xlOartVerticalOverflowEllipsis
    extends activexDashExcelLib.ExcelNs.XlOartVerticalOverflow
  
  @js.native
  sealed trait xlOartVerticalOverflowOverflow
    extends activexDashExcelLib.ExcelNs.XlOartVerticalOverflow
  
  /* 1 */ val xlOartVerticalOverflowClip: xlOartVerticalOverflowClip with scala.Double = js.native
  /* 2 */ val xlOartVerticalOverflowEllipsis: xlOartVerticalOverflowEllipsis with scala.Double = js.native
  /* 0 */ val xlOartVerticalOverflowOverflow: xlOartVerticalOverflowOverflow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlOartVerticalOverflow with scala.Double] = js.native
}

