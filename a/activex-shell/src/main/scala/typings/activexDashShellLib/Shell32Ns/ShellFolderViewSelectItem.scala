package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellFolderViewSelectItem extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.ShellFolderViewSelectItem")
@js.native
object ShellFolderViewSelectItem extends js.Object {
  @js.native
  sealed trait Deselect
    extends activexDashShellLib.Shell32Ns.ShellFolderViewSelectItem
  
  @js.native
  sealed trait DeselectAllButThis
    extends activexDashShellLib.Shell32Ns.ShellFolderViewSelectItem
  
  @js.native
  sealed trait EditMode
    extends activexDashShellLib.Shell32Ns.ShellFolderViewSelectItem
  
  @js.native
  sealed trait Focus
    extends activexDashShellLib.Shell32Ns.ShellFolderViewSelectItem
  
  @js.native
  sealed trait ScrollIntoView
    extends activexDashShellLib.Shell32Ns.ShellFolderViewSelectItem
  
  @js.native
  sealed trait Select
    extends activexDashShellLib.Shell32Ns.ShellFolderViewSelectItem
  
  /* 0 */ val Deselect: Deselect with scala.Double = js.native
  /* 4 */ val DeselectAllButThis: DeselectAllButThis with scala.Double = js.native
  /* 3 */ val EditMode: EditMode with scala.Double = js.native
  /* 16 */ val Focus: Focus with scala.Double = js.native
  /* 8 */ val ScrollIntoView: ScrollIntoView with scala.Double = js.native
  /* 1 */ val Select: Select with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.ShellFolderViewSelectItem with scala.Double] = js.native
}

