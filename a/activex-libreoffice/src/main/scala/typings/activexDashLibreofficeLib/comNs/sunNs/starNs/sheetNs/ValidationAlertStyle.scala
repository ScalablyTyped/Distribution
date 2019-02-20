package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationAlertStyle extends js.Object

/** used to specify how invalid cell contents are treated. */
@JSGlobal("com.sun.star.sheet.ValidationAlertStyle")
@js.native
object ValidationAlertStyle extends js.Object {
  /** information message is shown and the user is asked whether the change will be accepted (defaulted to "Yes"). */
  @js.native
  sealed trait INFO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationAlertStyle
  
  /** macro is executed. */
  @js.native
  sealed trait MACRO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationAlertStyle
  
  /** error message is shown and the change is rejected. */
  @js.native
  sealed trait STOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationAlertStyle
  
  /** warning message is shown and the user is asked whether the change will be accepted (defaulted to "No"). */
  @js.native
  sealed trait WARNING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationAlertStyle
  
  /* 2 */ val INFO: INFO with scala.Double = js.native
  /* 3 */ val MACRO: MACRO with scala.Double = js.native
  /* 0 */ val STOP: STOP with scala.Double = js.native
  /* 1 */ val WARNING: WARNING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationAlertStyle with scala.Double
  ] = js.native
}

