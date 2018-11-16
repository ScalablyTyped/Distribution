package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlHebrewModes extends js.Object

@JSGlobal("Excel.XlHebrewModes")
@js.native
object XlHebrewModes extends js.Object {
  @js.native
  sealed trait xlHebrewFullScript
    extends activexDashExcelLib.ExcelNs.XlHebrewModes
  
  @js.native
  sealed trait xlHebrewMixedAuthorizedScript
    extends activexDashExcelLib.ExcelNs.XlHebrewModes
  
  @js.native
  sealed trait xlHebrewMixedScript
    extends activexDashExcelLib.ExcelNs.XlHebrewModes
  
  @js.native
  sealed trait xlHebrewPartialScript
    extends activexDashExcelLib.ExcelNs.XlHebrewModes
  
  /* 0 */ val xlHebrewFullScript: xlHebrewFullScript with scala.Double = js.native
  /* 3 */ val xlHebrewMixedAuthorizedScript: xlHebrewMixedAuthorizedScript with scala.Double = js.native
  /* 2 */ val xlHebrewMixedScript: xlHebrewMixedScript with scala.Double = js.native
  /* 1 */ val xlHebrewPartialScript: xlHebrewPartialScript with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlHebrewModes with scala.Double] = js.native
}

