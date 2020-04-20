package typings.activexShell.Shell32

import typings.activexShell.activexShellNumbers.`0`
import typings.activexShell.activexShellNumbers.`10`
import typings.activexShell.activexShellNumbers.`1`
import typings.activexShell.activexShellNumbers.`2`
import typings.activexShell.activexShellNumbers.`3`
import typings.activexShell.activexShellNumbers.`4`
import typings.activexShell.activexShellNumbers.`5`
import typings.activexShell.activexShellNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexShell.activexShellNumbers.`0`
  - typings.activexShell.activexShellNumbers.`1`
  - typings.activexShell.activexShellNumbers.`2`
  - typings.activexShell.activexShellNumbers.`3`
  - typings.activexShell.activexShellNumbers.`4`
  - typings.activexShell.activexShellNumbers.`5`
  - typings.activexShell.activexShellNumbers.`7`
  - typings.activexShell.activexShellNumbers.`10`
*/
trait ShellExecuteShow extends js.Object

object ShellExecuteShow {
  /** Open the application with its window in the default state specified by the application. */
  @scala.inline
  def Application: `10` = 10.asInstanceOf[`10`]
  /** Open the application with its window at its current size and position. */
  @scala.inline
  def Current: `5` = 5.asInstanceOf[`5`]
  /** Open the application with a hidden window. */
  @scala.inline
  def Hidden: `0` = 0.asInstanceOf[`0`]
  /** Open the application with its window at its most recent size and position. The active window remains active. */
  @scala.inline
  def Last: `4` = 4.asInstanceOf[`4`]
  /** Open the application with a maximized window. */
  @scala.inline
  def Maximized: `3` = 3.asInstanceOf[`3`]
  /** Open the application with a minimized window. */
  @scala.inline
  def Minimized: `2` = 2.asInstanceOf[`2`]
  /** Open the application with a minimized window. The active window remains active. */
  @scala.inline
  def MinimizedNotActivated: `7` = 7.asInstanceOf[`7`]
  /** Open the application with a normal window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @scala.inline
  def Normal: `1` = 1.asInstanceOf[`1`]
}

