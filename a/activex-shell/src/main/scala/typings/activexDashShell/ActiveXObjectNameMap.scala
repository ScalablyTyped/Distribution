package typings.activexDashShell

import typings.activexDashShell.Shell32.Shell
import typings.activexDashShell.Shell32.ShellFolderViewOC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Shell.Application`: Shell
  var `Shell.FolderView`: ShellFolderViewOC
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(`Shell.Application`: Shell, `Shell.FolderView`: ShellFolderViewOC): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell.Application")(`Shell.Application`.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.FolderView")(`Shell.FolderView`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

