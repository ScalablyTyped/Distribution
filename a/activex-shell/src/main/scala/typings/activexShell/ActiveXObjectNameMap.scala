package typings.activexShell

import typings.activexShell.Shell32.Shell
import typings.activexShell.Shell32.ShellFolderViewOC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Shell.Application")
  var ShellDotApplication: Shell = js.native
  @JSName("Shell.FolderView")
  var ShellDotFolderView: ShellFolderViewOC = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(ShellDotApplication: Shell, ShellDotFolderView: ShellFolderViewOC): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell.Application")(ShellDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.FolderView")(ShellDotFolderView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShellDotApplication(value: Shell): Self = this.set("Shell.Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setShellDotFolderView(value: ShellFolderViewOC): Self = this.set("Shell.FolderView", value.asInstanceOf[js.Any])
  }
  
}

