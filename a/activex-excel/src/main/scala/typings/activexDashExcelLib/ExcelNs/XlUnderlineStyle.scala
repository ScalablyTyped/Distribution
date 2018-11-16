package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlUnderlineStyle extends js.Object

@JSGlobal("Excel.XlUnderlineStyle")
@js.native
object XlUnderlineStyle extends js.Object {
  @js.native
  sealed trait xlUnderlineStyleDouble
    extends activexDashExcelLib.ExcelNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleDoubleAccounting
    extends activexDashExcelLib.ExcelNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleNone
    extends activexDashExcelLib.ExcelNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingle
    extends activexDashExcelLib.ExcelNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingleAccounting
    extends activexDashExcelLib.ExcelNs.XlUnderlineStyle
  
  /* -4119 */ val xlUnderlineStyleDouble: xlUnderlineStyleDouble with scala.Double = js.native
  /* 5 */ val xlUnderlineStyleDoubleAccounting: xlUnderlineStyleDoubleAccounting with scala.Double = js.native
  /* -4142 */ val xlUnderlineStyleNone: xlUnderlineStyleNone with scala.Double = js.native
  /* 2 */ val xlUnderlineStyleSingle: xlUnderlineStyleSingle with scala.Double = js.native
  /* 4 */ val xlUnderlineStyleSingleAccounting: xlUnderlineStyleSingleAccounting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlUnderlineStyle with scala.Double] = js.native
}

