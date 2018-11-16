package typings
package activexDashStdoleLib.stdoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OLE_TRISTATE extends js.Object

@JSGlobal("stdole.OLE_TRISTATE")
@js.native
object OLE_TRISTATE extends js.Object {
  @js.native
  sealed trait Checked
    extends activexDashStdoleLib.stdoleNs.OLE_TRISTATE
  
  @js.native
  sealed trait Gray
    extends activexDashStdoleLib.stdoleNs.OLE_TRISTATE
  
  @js.native
  sealed trait Unchecked
    extends activexDashStdoleLib.stdoleNs.OLE_TRISTATE
  
  /* 1 */ val Checked: Checked with scala.Double = js.native
  /* 2 */ val Gray: Gray with scala.Double = js.native
  /* 0 */ val Unchecked: Unchecked with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashStdoleLib.stdoleNs.OLE_TRISTATE with scala.Double] = js.native
}

