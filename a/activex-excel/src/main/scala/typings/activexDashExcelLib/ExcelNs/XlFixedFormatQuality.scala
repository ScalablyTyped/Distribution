package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFixedFormatQuality extends js.Object

@JSGlobal("Excel.XlFixedFormatQuality")
@js.native
object XlFixedFormatQuality extends js.Object {
  @js.native
  sealed trait xlQualityMinimum
    extends activexDashExcelLib.ExcelNs.XlFixedFormatQuality
  
  @js.native
  sealed trait xlQualityStandard
    extends activexDashExcelLib.ExcelNs.XlFixedFormatQuality
  
  /* 1 */ val xlQualityMinimum: xlQualityMinimum with scala.Double = js.native
  /* 0 */ val xlQualityStandard: xlQualityStandard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFixedFormatQuality with scala.Double] = js.native
}

