package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdExportOptimizeFor extends js.Object

@JSGlobal("Word.WdExportOptimizeFor")
@js.native
object WdExportOptimizeFor extends js.Object {
  @js.native
  sealed trait wdExportOptimizeForOnScreen
    extends activexDashWordLib.WordNs.WdExportOptimizeFor
  
  @js.native
  sealed trait wdExportOptimizeForPrint
    extends activexDashWordLib.WordNs.WdExportOptimizeFor
  
  /* 1 */ val wdExportOptimizeForOnScreen: wdExportOptimizeForOnScreen with scala.Double = js.native
  /* 0 */ val wdExportOptimizeForPrint: wdExportOptimizeForPrint with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdExportOptimizeFor with scala.Double] = js.native
}

