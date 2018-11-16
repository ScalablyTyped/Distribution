package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFindLookIn extends js.Object

@JSGlobal("Excel.XlFindLookIn")
@js.native
object XlFindLookIn extends js.Object {
  @js.native
  sealed trait xlComments
    extends activexDashExcelLib.ExcelNs.XlFindLookIn
  
  @js.native
  sealed trait xlFormulas
    extends activexDashExcelLib.ExcelNs.XlFindLookIn
  
  @js.native
  sealed trait xlValues
    extends activexDashExcelLib.ExcelNs.XlFindLookIn
  
  /* -4144 */ val xlComments: xlComments with scala.Double = js.native
  /* -4123 */ val xlFormulas: xlFormulas with scala.Double = js.native
  /* -4163 */ val xlValues: xlValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFindLookIn with scala.Double] = js.native
}

