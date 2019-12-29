package typings.activexDashShell

import typings.activexDashShell.Shell32.Shell
import typings.activexDashShell.Shell32.ShellFolderViewOC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("Shell.Application")
  var ShellDotApplication: Shell
  @JSName("Shell.FolderView")
  var ShellDotFolderView: ShellFolderViewOC
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(ShellDotApplication: Shell, ShellDotFolderView: ShellFolderViewOC): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell.Application")(ShellDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.FolderView")(ShellDotFolderView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

