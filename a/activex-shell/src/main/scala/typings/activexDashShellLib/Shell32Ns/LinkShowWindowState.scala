package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkShowWindowState extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.LinkShowWindowState")
@js.native
object LinkShowWindowState extends js.Object {
  /** Activates the window and displays it as a maximized window. */
  @js.native
  sealed trait Maximized
    extends activexDashShellLib.Shell32Ns.LinkShowWindowState
  
  /** Activates the window and displays it as a minimized window. */
  @js.native
  sealed trait Minimized
    extends activexDashShellLib.Shell32Ns.LinkShowWindowState
  
  /** Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @js.native
  sealed trait Normal
    extends activexDashShellLib.Shell32Ns.LinkShowWindowState
  
  /* 3 */ val Maximized: Maximized with scala.Double = js.native
  /* 2 */ val Minimized: Minimized with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.LinkShowWindowState with scala.Double] = js.native
}

