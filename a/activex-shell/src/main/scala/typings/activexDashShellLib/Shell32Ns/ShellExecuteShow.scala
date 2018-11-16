package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellExecuteShow extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.ShellExecuteShow")
@js.native
object ShellExecuteShow extends js.Object {
  /** Open the application with its window in the default state specified by the application. */
  @js.native
  sealed trait Application
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /** Open the application with its window at its current size and position. */
  @js.native
  sealed trait Current
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /** Open the application with a hidden window. */
  @js.native
  sealed trait Hidden
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /** Open the application with its window at its most recent size and position. The active window remains active. */
  @js.native
  sealed trait Last
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /** Open the application with a maximized window. */
  @js.native
  sealed trait Maximized
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /** Open the application with a minimized window. */
  @js.native
  sealed trait Minimized
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /** Open the application with a minimized window. The active window remains active. */
  @js.native
  sealed trait MinimizedNotActivated
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /** Open the application with a normal window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @js.native
  sealed trait Normal
    extends activexDashShellLib.Shell32Ns.ShellExecuteShow
  
  /* 10 */ val Application: Application with scala.Double = js.native
  /* 5 */ val Current: Current with scala.Double = js.native
  /* 0 */ val Hidden: Hidden with scala.Double = js.native
  /* 4 */ val Last: Last with scala.Double = js.native
  /* 3 */ val Maximized: Maximized with scala.Double = js.native
  /* 2 */ val Minimized: Minimized with scala.Double = js.native
  /* 7 */ val MinimizedNotActivated: MinimizedNotActivated with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.ShellExecuteShow with scala.Double] = js.native
}

