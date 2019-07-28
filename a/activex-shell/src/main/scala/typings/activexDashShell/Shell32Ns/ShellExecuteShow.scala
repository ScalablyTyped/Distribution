package typings.activexDashShell.Shell32Ns

import typings.activexDashShell.activexDashShellNumbers.`0`
import typings.activexDashShell.activexDashShellNumbers.`10`
import typings.activexDashShell.activexDashShellNumbers.`1`
import typings.activexDashShell.activexDashShellNumbers.`2`
import typings.activexDashShell.activexDashShellNumbers.`3`
import typings.activexDashShell.activexDashShellNumbers.`4`
import typings.activexDashShell.activexDashShellNumbers.`5`
import typings.activexDashShell.activexDashShellNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexDashShell.activexDashShellNumbers.`0`
  - typings.activexDashShell.activexDashShellNumbers.`1`
  - typings.activexDashShell.activexDashShellNumbers.`2`
  - typings.activexDashShell.activexDashShellNumbers.`3`
  - typings.activexDashShell.activexDashShellNumbers.`4`
  - typings.activexDashShell.activexDashShellNumbers.`5`
  - typings.activexDashShell.activexDashShellNumbers.`7`
  - typings.activexDashShell.activexDashShellNumbers.`10`
*/
trait ShellExecuteShow extends js.Object

object ShellExecuteShow {
  /** Open the application with its window in the default state specified by the application. */
  @scala.inline
  def Application: `10` = this.cast(10)
  /** Open the application with its window at its current size and position. */
  @scala.inline
  def Current: `5` = this.cast(5)
  /** Open the application with a hidden window. */
  @scala.inline
  def Hidden: `0` = this.cast(0)
  /** Open the application with its window at its most recent size and position. The active window remains active. */
  @scala.inline
  def Last: `4` = this.cast(4)
  /** Open the application with a maximized window. */
  @scala.inline
  def Maximized: `3` = this.cast(3)
  /** Open the application with a minimized window. */
  @scala.inline
  def Minimized: `2` = this.cast(2)
  /** Open the application with a minimized window. The active window remains active. */
  @scala.inline
  def MinimizedNotActivated: `7` = this.cast(7)
  /** Open the application with a normal window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @scala.inline
  def Normal: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

