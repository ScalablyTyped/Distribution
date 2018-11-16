package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSpanishModes extends js.Object

@JSGlobal("Excel.XlSpanishModes")
@js.native
object XlSpanishModes extends js.Object {
  @js.native
  sealed trait xlSpanishTuteoAndVoseo
    extends activexDashExcelLib.ExcelNs.XlSpanishModes
  
  @js.native
  sealed trait xlSpanishTuteoOnly
    extends activexDashExcelLib.ExcelNs.XlSpanishModes
  
  @js.native
  sealed trait xlSpanishVoseoOnly
    extends activexDashExcelLib.ExcelNs.XlSpanishModes
  
  /* 1 */ val xlSpanishTuteoAndVoseo: xlSpanishTuteoAndVoseo with scala.Double = js.native
  /* 0 */ val xlSpanishTuteoOnly: xlSpanishTuteoOnly with scala.Double = js.native
  /* 2 */ val xlSpanishVoseoOnly: xlSpanishVoseoOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSpanishModes with scala.Double] = js.native
}

