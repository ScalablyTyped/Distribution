package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - activexDashShellLib.activexDashShellLibNumbers.`0`
  - activexDashShellLib.activexDashShellLibNumbers.`1`
  - activexDashShellLib.activexDashShellLibNumbers.`2`
  - activexDashShellLib.activexDashShellLibNumbers.`3`
  - activexDashShellLib.activexDashShellLibNumbers.`4`
  - activexDashShellLib.activexDashShellLibNumbers.`5`
  - activexDashShellLib.activexDashShellLibNumbers.`7`
  - activexDashShellLib.activexDashShellLibNumbers.`10`
*/
trait ShellExecuteShow extends js.Object

object ShellExecuteShow {
  /** Open the application with its window in the default state specified by the application. */
  @scala.inline
  def Application: activexDashShellLib.activexDashShellLibNumbers.`10` = this.cast(10)
  /** Open the application with its window at its current size and position. */
  @scala.inline
  def Current: activexDashShellLib.activexDashShellLibNumbers.`5` = this.cast(5)
  /** Open the application with a hidden window. */
  @scala.inline
  def Hidden: activexDashShellLib.activexDashShellLibNumbers.`0` = this.cast(0)
  /** Open the application with its window at its most recent size and position. The active window remains active. */
  @scala.inline
  def Last: activexDashShellLib.activexDashShellLibNumbers.`4` = this.cast(4)
  /** Open the application with a maximized window. */
  @scala.inline
  def Maximized: activexDashShellLib.activexDashShellLibNumbers.`3` = this.cast(3)
  /** Open the application with a minimized window. */
  @scala.inline
  def Minimized: activexDashShellLib.activexDashShellLibNumbers.`2` = this.cast(2)
  /** Open the application with a minimized window. The active window remains active. */
  @scala.inline
  def MinimizedNotActivated: activexDashShellLib.activexDashShellLibNumbers.`7` = this.cast(7)
  /** Open the application with a normal window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @scala.inline
  def Normal: activexDashShellLib.activexDashShellLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

