package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlObjectSize extends js.Object

@JSGlobal("Excel.XlObjectSize")
@js.native
object XlObjectSize extends js.Object {
  @js.native
  sealed trait xlFitToPage
    extends activexDashExcelLib.ExcelNs.XlObjectSize
  
  @js.native
  sealed trait xlFullPage
    extends activexDashExcelLib.ExcelNs.XlObjectSize
  
  @js.native
  sealed trait xlScreenSize
    extends activexDashExcelLib.ExcelNs.XlObjectSize
  
  /* 2 */ val xlFitToPage: xlFitToPage with scala.Double = js.native
  /* 3 */ val xlFullPage: xlFullPage with scala.Double = js.native
  /* 1 */ val xlScreenSize: xlScreenSize with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlObjectSize with scala.Double] = js.native
}

