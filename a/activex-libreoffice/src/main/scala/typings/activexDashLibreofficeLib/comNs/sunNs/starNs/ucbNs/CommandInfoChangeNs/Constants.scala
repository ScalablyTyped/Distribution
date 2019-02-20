package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CommandInfoChangeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.CommandInfoChange.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait COMMAND_INSERTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CommandInfoChangeNs.Constants
  
  @js.native
  sealed trait COMMAND_REMOVED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CommandInfoChangeNs.Constants
  
  /* 0 */ val COMMAND_INSERTED: COMMAND_INSERTED with scala.Double = js.native
  /* 1 */ val COMMAND_REMOVED: COMMAND_REMOVED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CommandInfoChangeNs.Constants with scala.Double
  ] = js.native
}

