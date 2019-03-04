package typings
package activexDashShellLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Shell.Application`: activexDashShellLib.Shell32Ns.Shell
  var `Shell.FolderView`: activexDashShellLib.Shell32Ns.ShellFolderViewOC
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `Shell.Application`: activexDashShellLib.Shell32Ns.Shell,
    `Shell.FolderView`: activexDashShellLib.Shell32Ns.ShellFolderViewOC
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell.Application")(`Shell.Application`)
    __obj.updateDynamic("Shell.FolderView")(`Shell.FolderView`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

