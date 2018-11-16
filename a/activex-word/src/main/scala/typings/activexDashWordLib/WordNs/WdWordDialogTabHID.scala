package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdWordDialogTabHID extends js.Object

@JSGlobal("Word.WdWordDialogTabHID")
@js.native
object WdWordDialogTabHID extends js.Object {
  @js.native
  sealed trait wdDialogFilePageSetupTabPaperSize
    extends activexDashWordLib.WordNs.WdWordDialogTabHID
  
  @js.native
  sealed trait wdDialogFilePageSetupTabPaperSource
    extends activexDashWordLib.WordNs.WdWordDialogTabHID
  
  /* 150001 */ val wdDialogFilePageSetupTabPaperSize: wdDialogFilePageSetupTabPaperSize with scala.Double = js.native
  /* 150002 */ val wdDialogFilePageSetupTabPaperSource: wdDialogFilePageSetupTabPaperSource with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdWordDialogTabHID with scala.Double] = js.native
}

