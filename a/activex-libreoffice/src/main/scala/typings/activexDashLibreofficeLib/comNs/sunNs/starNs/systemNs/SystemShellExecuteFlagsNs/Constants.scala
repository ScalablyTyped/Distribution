package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SystemShellExecuteFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.system.SystemShellExecuteFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DEFAULTS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SystemShellExecuteFlagsNs.Constants
  
  @js.native
  sealed trait NO_SYSTEM_ERROR_MESSAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SystemShellExecuteFlagsNs.Constants
  
  @js.native
  sealed trait URIS_ONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SystemShellExecuteFlagsNs.Constants
  
  /* 0 */ val DEFAULTS: DEFAULTS with scala.Double = js.native
  /* 1 */ val NO_SYSTEM_ERROR_MESSAGE: NO_SYSTEM_ERROR_MESSAGE with scala.Double = js.native
  /* 2 */ val URIS_ONLY: URIS_ONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SystemShellExecuteFlagsNs.Constants with scala.Double
  ] = js.native
}

