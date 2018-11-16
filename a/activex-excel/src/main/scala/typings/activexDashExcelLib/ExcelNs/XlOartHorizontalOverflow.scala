package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlOartHorizontalOverflow extends js.Object

@JSGlobal("Excel.XlOartHorizontalOverflow")
@js.native
object XlOartHorizontalOverflow extends js.Object {
  @js.native
  sealed trait xlOartHorizontalOverflowClip
    extends activexDashExcelLib.ExcelNs.XlOartHorizontalOverflow
  
  @js.native
  sealed trait xlOartHorizontalOverflowOverflow
    extends activexDashExcelLib.ExcelNs.XlOartHorizontalOverflow
  
  /* 1 */ val xlOartHorizontalOverflowClip: xlOartHorizontalOverflowClip with scala.Double = js.native
  /* 0 */ val xlOartHorizontalOverflowOverflow: xlOartHorizontalOverflowOverflow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlOartHorizontalOverflow with scala.Double] = js.native
}

