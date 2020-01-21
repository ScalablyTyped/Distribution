package typings.activexShell.Shell32

import typings.activexShell.activexShellNumbers.`0`
import typings.activexShell.activexShellNumbers.`16`
import typings.activexShell.activexShellNumbers.`1`
import typings.activexShell.activexShellNumbers.`3`
import typings.activexShell.activexShellNumbers.`4`
import typings.activexShell.activexShellNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexShell.activexShellNumbers.`0`
  - typings.activexShell.activexShellNumbers.`1`
  - typings.activexShell.activexShellNumbers.`3`
  - typings.activexShell.activexShellNumbers.`4`
  - typings.activexShell.activexShellNumbers.`8`
  - typings.activexShell.activexShellNumbers.`16`
*/
trait ShellFolderViewSelectItem extends js.Object

object ShellFolderViewSelectItem {
  @scala.inline
  def Deselect: `0` = this.cast(0)
  @scala.inline
  def DeselectAllButThis: `4` = this.cast(4)
  @scala.inline
  def EditMode: `3` = this.cast(3)
  @scala.inline
  def Focus: `16` = this.cast(16)
  @scala.inline
  def ScrollIntoView: `8` = this.cast(8)
  @scala.inline
  def Select: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

