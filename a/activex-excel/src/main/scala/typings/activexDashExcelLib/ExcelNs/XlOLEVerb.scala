package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlOLEVerb extends js.Object

@JSGlobal("Excel.XlOLEVerb")
@js.native
object XlOLEVerb extends js.Object {
  @js.native
  sealed trait xlVerbOpen
    extends activexDashExcelLib.ExcelNs.XlOLEVerb
  
  @js.native
  sealed trait xlVerbPrimary
    extends activexDashExcelLib.ExcelNs.XlOLEVerb
  
  /* 2 */ val xlVerbOpen: xlVerbOpen with scala.Double = js.native
  /* 1 */ val xlVerbPrimary: xlVerbPrimary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlOLEVerb with scala.Double] = js.native
}

