package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.ActionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.embed.Actions.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait PREVENT_CLOSE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.ActionsNs.Constants
  
  @js.native
  sealed trait PREVENT_TERMINATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.ActionsNs.Constants
  
  /* 1 */ val PREVENT_CLOSE: PREVENT_CLOSE with scala.Double = js.native
  /* 2 */ val PREVENT_TERMINATION: PREVENT_TERMINATION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.ActionsNs.Constants with scala.Double
  ] = js.native
}

