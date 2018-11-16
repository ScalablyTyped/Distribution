package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLookFor extends js.Object

@JSGlobal("Excel.XlLookFor")
@js.native
object XlLookFor extends js.Object {
  @js.native
  sealed trait xlLookForBlanks
    extends activexDashExcelLib.ExcelNs.XlLookFor
  
  @js.native
  sealed trait xlLookForErrors
    extends activexDashExcelLib.ExcelNs.XlLookFor
  
  @js.native
  sealed trait xlLookForFormulas
    extends activexDashExcelLib.ExcelNs.XlLookFor
  
  /* 0 */ val xlLookForBlanks: xlLookForBlanks with scala.Double = js.native
  /* 1 */ val xlLookForErrors: xlLookForErrors with scala.Double = js.native
  /* 2 */ val xlLookForFormulas: xlLookForFormulas with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLookFor with scala.Double] = js.native
}

