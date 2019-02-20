package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleMailClientFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.system.SimpleMailClientFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DEFAULTS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleMailClientFlagsNs.Constants
  
  @js.native
  sealed trait NO_LOGON_DIALOG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleMailClientFlagsNs.Constants
  
  @js.native
  sealed trait NO_USER_INTERFACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleMailClientFlagsNs.Constants
  
  /* 0 */ val DEFAULTS: DEFAULTS with scala.Double = js.native
  /* 2 */ val NO_LOGON_DIALOG: NO_LOGON_DIALOG with scala.Double = js.native
  /* 1 */ val NO_USER_INTERFACE: NO_USER_INTERFACE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleMailClientFlagsNs.Constants with scala.Double
  ] = js.native
}

