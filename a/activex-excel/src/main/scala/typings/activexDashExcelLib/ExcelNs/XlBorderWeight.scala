package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBorderWeight extends js.Object

@JSGlobal("Excel.XlBorderWeight")
@js.native
object XlBorderWeight extends js.Object {
  @js.native
  sealed trait xlHairline
    extends activexDashExcelLib.ExcelNs.XlBorderWeight
  
  @js.native
  sealed trait xlMedium
    extends activexDashExcelLib.ExcelNs.XlBorderWeight
  
  @js.native
  sealed trait xlThick
    extends activexDashExcelLib.ExcelNs.XlBorderWeight
  
  @js.native
  sealed trait xlThin
    extends activexDashExcelLib.ExcelNs.XlBorderWeight
  
  /* 1 */ val xlHairline: xlHairline with scala.Double = js.native
  /* -4138 */ val xlMedium: xlMedium with scala.Double = js.native
  /* 4 */ val xlThick: xlThick with scala.Double = js.native
  /* 2 */ val xlThin: xlThin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlBorderWeight with scala.Double] = js.native
}

