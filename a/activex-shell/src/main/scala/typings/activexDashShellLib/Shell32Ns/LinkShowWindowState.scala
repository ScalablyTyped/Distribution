package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - activexDashShellLib.activexDashShellLibNumbers.`1`
  - activexDashShellLib.activexDashShellLibNumbers.`2`
  - activexDashShellLib.activexDashShellLibNumbers.`3`
*/
trait LinkShowWindowState extends js.Object

object LinkShowWindowState {
  /** Activates the window and displays it as a maximized window. */
  @scala.inline
  def Maximized: activexDashShellLib.activexDashShellLibNumbers.`3` = this.cast(3)
  /** Activates the window and displays it as a minimized window. */
  @scala.inline
  def Minimized: activexDashShellLib.activexDashShellLibNumbers.`2` = this.cast(2)
  /** Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @scala.inline
  def Normal: activexDashShellLib.activexDashShellLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

