package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HotkeyModifiers extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.HotkeyModifiers")
@js.native
object HotkeyModifiers extends js.Object {
  @js.native
  sealed trait ALT
    extends activexDashShellLib.Shell32Ns.HotkeyModifiers
  
  @js.native
  sealed trait CTRL
    extends activexDashShellLib.Shell32Ns.HotkeyModifiers
  
  @js.native
  sealed trait Extended
    extends activexDashShellLib.Shell32Ns.HotkeyModifiers
  
  @js.native
  sealed trait SHIFT
    extends activexDashShellLib.Shell32Ns.HotkeyModifiers
  
  /* 4 */ val ALT: ALT with scala.Double = js.native
  /* 2 */ val CTRL: CTRL with scala.Double = js.native
  /* 8 */ val Extended: Extended with scala.Double = js.native
  /* 1 */ val SHIFT: SHIFT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.HotkeyModifiers with scala.Double] = js.native
}

