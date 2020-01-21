package typings.activexShell.Shell32

import typings.activexShell.activexShellNumbers.`1`
import typings.activexShell.activexShellNumbers.`2`
import typings.activexShell.activexShellNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexShell.activexShellNumbers.`1`
  - typings.activexShell.activexShellNumbers.`2`
  - typings.activexShell.activexShellNumbers.`3`
*/
trait LinkShowWindowState extends js.Object

object LinkShowWindowState {
  /** Activates the window and displays it as a maximized window. */
  @scala.inline
  def Maximized: `3` = this.cast(3)
  /** Activates the window and displays it as a minimized window. */
  @scala.inline
  def Minimized: `2` = this.cast(2)
  /** Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @scala.inline
  def Normal: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

