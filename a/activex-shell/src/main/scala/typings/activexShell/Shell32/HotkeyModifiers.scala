package typings.activexShell.Shell32

import typings.activexShell.activexShellNumbers.`1`
import typings.activexShell.activexShellNumbers.`2`
import typings.activexShell.activexShellNumbers.`4`
import typings.activexShell.activexShellNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexShell.activexShellNumbers.`1`
  - typings.activexShell.activexShellNumbers.`2`
  - typings.activexShell.activexShellNumbers.`4`
  - typings.activexShell.activexShellNumbers.`8`
*/
trait HotkeyModifiers extends js.Object

object HotkeyModifiers {
  @scala.inline
  def ALT: `4` = this.cast(4)
  @scala.inline
  def CTRL: `2` = this.cast(2)
  @scala.inline
  def Extended: `8` = this.cast(8)
  @scala.inline
  def SHIFT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

