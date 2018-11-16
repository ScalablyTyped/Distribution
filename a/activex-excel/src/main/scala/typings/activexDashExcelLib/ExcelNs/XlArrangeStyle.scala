package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlArrangeStyle extends js.Object

@JSGlobal("Excel.XlArrangeStyle")
@js.native
object XlArrangeStyle extends js.Object {
  @js.native
  sealed trait xlArrangeStyleCascade
    extends activexDashExcelLib.ExcelNs.XlArrangeStyle
  
  @js.native
  sealed trait xlArrangeStyleHorizontal
    extends activexDashExcelLib.ExcelNs.XlArrangeStyle
  
  @js.native
  sealed trait xlArrangeStyleTiled
    extends activexDashExcelLib.ExcelNs.XlArrangeStyle
  
  @js.native
  sealed trait xlArrangeStyleVertical
    extends activexDashExcelLib.ExcelNs.XlArrangeStyle
  
  /* 7 */ val xlArrangeStyleCascade: xlArrangeStyleCascade with scala.Double = js.native
  /* -4128 */ val xlArrangeStyleHorizontal: xlArrangeStyleHorizontal with scala.Double = js.native
  /* 1 */ val xlArrangeStyleTiled: xlArrangeStyleTiled with scala.Double = js.native
  /* -4166 */ val xlArrangeStyleVertical: xlArrangeStyleVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlArrangeStyle with scala.Double] = js.native
}

