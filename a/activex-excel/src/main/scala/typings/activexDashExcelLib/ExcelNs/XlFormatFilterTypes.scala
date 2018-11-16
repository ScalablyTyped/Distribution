package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFormatFilterTypes extends js.Object

@JSGlobal("Excel.XlFormatFilterTypes")
@js.native
object XlFormatFilterTypes extends js.Object {
  @js.native
  sealed trait xlFilterBottom
    extends activexDashExcelLib.ExcelNs.XlFormatFilterTypes
  
  @js.native
  sealed trait xlFilterBottomPercent
    extends activexDashExcelLib.ExcelNs.XlFormatFilterTypes
  
  @js.native
  sealed trait xlFilterTop
    extends activexDashExcelLib.ExcelNs.XlFormatFilterTypes
  
  @js.native
  sealed trait xlFilterTopPercent
    extends activexDashExcelLib.ExcelNs.XlFormatFilterTypes
  
  /* 0 */ val xlFilterBottom: xlFilterBottom with scala.Double = js.native
  /* 2 */ val xlFilterBottomPercent: xlFilterBottomPercent with scala.Double = js.native
  /* 1 */ val xlFilterTop: xlFilterTop with scala.Double = js.native
  /* 3 */ val xlFilterTopPercent: xlFilterTopPercent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFormatFilterTypes with scala.Double] = js.native
}

