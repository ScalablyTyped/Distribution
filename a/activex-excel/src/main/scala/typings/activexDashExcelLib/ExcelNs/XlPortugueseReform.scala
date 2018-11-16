package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPortugueseReform extends js.Object

@JSGlobal("Excel.XlPortugueseReform")
@js.native
object XlPortugueseReform extends js.Object {
  @js.native
  sealed trait xlPortugueseBoth
    extends activexDashExcelLib.ExcelNs.XlPortugueseReform
  
  @js.native
  sealed trait xlPortuguesePostReform
    extends activexDashExcelLib.ExcelNs.XlPortugueseReform
  
  @js.native
  sealed trait xlPortuguesePreReform
    extends activexDashExcelLib.ExcelNs.XlPortugueseReform
  
  /* 3 */ val xlPortugueseBoth: xlPortugueseBoth with scala.Double = js.native
  /* 2 */ val xlPortuguesePostReform: xlPortuguesePostReform with scala.Double = js.native
  /* 1 */ val xlPortuguesePreReform: xlPortuguesePreReform with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPortugueseReform with scala.Double] = js.native
}

