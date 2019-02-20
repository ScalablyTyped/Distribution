package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.ExecutableDialogResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ui.dialogs.ExecutableDialogResults.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CANCEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.ExecutableDialogResultsNs.Constants
  
  @js.native
  sealed trait OK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.ExecutableDialogResultsNs.Constants
  
  /* 0 */ val CANCEL: CANCEL with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.ExecutableDialogResultsNs.Constants with scala.Double
  ] = js.native
}

