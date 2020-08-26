package typings.activexShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ShellDispatch Load in Shell Context */
@js.native
trait ShellDispatchInproc extends js.Object {
  @JSName("Shell32.ShellDispatchInproc_typekey")
  var Shell32DotShellDispatchInproc_typekey: ShellDispatchInproc = js.native
}

object ShellDispatchInproc {
  @scala.inline
  def apply(Shell32DotShellDispatchInproc_typekey: ShellDispatchInproc): ShellDispatchInproc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell32.ShellDispatchInproc_typekey")(Shell32DotShellDispatchInproc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellDispatchInproc]
  }
  @scala.inline
  implicit class ShellDispatchInprocOps[Self <: ShellDispatchInproc] (val x: Self) extends AnyVal {
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
    def setShell32DotShellDispatchInproc_typekey(value: ShellDispatchInproc): Self = this.set("Shell32.ShellDispatchInproc_typekey", value.asInstanceOf[js.Any])
  }
  
}

