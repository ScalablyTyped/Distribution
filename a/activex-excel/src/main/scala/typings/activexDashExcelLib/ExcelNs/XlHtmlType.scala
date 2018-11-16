package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlHtmlType extends js.Object

@JSGlobal("Excel.XlHtmlType")
@js.native
object XlHtmlType extends js.Object {
  @js.native
  sealed trait xlHtmlCalc
    extends activexDashExcelLib.ExcelNs.XlHtmlType
  
  @js.native
  sealed trait xlHtmlChart
    extends activexDashExcelLib.ExcelNs.XlHtmlType
  
  @js.native
  sealed trait xlHtmlList
    extends activexDashExcelLib.ExcelNs.XlHtmlType
  
  @js.native
  sealed trait xlHtmlStatic
    extends activexDashExcelLib.ExcelNs.XlHtmlType
  
  /* 1 */ val xlHtmlCalc: xlHtmlCalc with scala.Double = js.native
  /* 3 */ val xlHtmlChart: xlHtmlChart with scala.Double = js.native
  /* 2 */ val xlHtmlList: xlHtmlList with scala.Double = js.native
  /* 0 */ val xlHtmlStatic: xlHtmlStatic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlHtmlType with scala.Double] = js.native
}

