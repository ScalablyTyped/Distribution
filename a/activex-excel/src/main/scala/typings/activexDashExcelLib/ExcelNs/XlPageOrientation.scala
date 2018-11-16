package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPageOrientation extends js.Object

@JSGlobal("Excel.XlPageOrientation")
@js.native
object XlPageOrientation extends js.Object {
  @js.native
  sealed trait xlLandscape
    extends activexDashExcelLib.ExcelNs.XlPageOrientation
  
  @js.native
  sealed trait xlPortrait
    extends activexDashExcelLib.ExcelNs.XlPageOrientation
  
  /* 2 */ val xlLandscape: xlLandscape with scala.Double = js.native
  /* 1 */ val xlPortrait: xlPortrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPageOrientation with scala.Double] = js.native
}

