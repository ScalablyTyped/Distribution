package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ConnectionModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.ConnectionMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait OFFLINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ConnectionModeNs.Constants
  
  @js.native
  sealed trait ONLINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ConnectionModeNs.Constants
  
  /* 1 */ val OFFLINE: OFFLINE with scala.Double = js.native
  /* 0 */ val ONLINE: ONLINE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ConnectionModeNs.Constants with scala.Double
  ] = js.native
}

