package typings.activexShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The **ShellFolderView** object fires two events, **EnumDone** and **SelectionChanged**, that are typically handled by applications. However, some applications
  * must handle events from a series of **ShellFolderView** objects. For example, an application might host a **WebBrowser** control that allows users to navigate through
  * a series of folders. Each folder has its own **ShellFolderView** object with its associated events. Handling these events can be difficult.
  *
  * The **ShellFolderViewOC** object simplifies event handling for such scenarios. It allows applications to handle events for all ShellFolderView objects with a single
  * pair of **ShellFolderViewOC** event handlers. Each time the user navigates to a new folder, the application passes the associated **ShellFolderView** object to the
  * **ShellFolderViewOC** object by calling **SetFolderView**. Then, when an **EnumDone** or **SelectionChanged** event is fired, the **ShellFolderViewOC** object
  * forwards the event to its own handler for processing.
  */
@js.native
trait ShellFolderViewOC extends js.Object {
  @JSName("Shell32.ShellFolderViewOC_typekey")
  var Shell32DotShellFolderViewOC_typekey: ShellFolderViewOC = js.native
  /** Set the ShellFolderView object to monitor events of. */
  def SetFolderView(pdisp: ShellFolderView): Unit = js.native
}

object ShellFolderViewOC {
  @scala.inline
  def apply(SetFolderView: ShellFolderView => Unit, Shell32DotShellFolderViewOC_typekey: ShellFolderViewOC): ShellFolderViewOC = {
    val __obj = js.Dynamic.literal(SetFolderView = js.Any.fromFunction1(SetFolderView))
    __obj.updateDynamic("Shell32.ShellFolderViewOC_typekey")(Shell32DotShellFolderViewOC_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellFolderViewOC]
  }
  @scala.inline
  implicit class ShellFolderViewOCOps[Self <: ShellFolderViewOC] (val x: Self) extends AnyVal {
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
    def setSetFolderView(value: ShellFolderView => Unit): Self = this.set("SetFolderView", js.Any.fromFunction1(value))
    @scala.inline
    def setShell32DotShellFolderViewOC_typekey(value: ShellFolderViewOC): Self = this.set("Shell32.ShellFolderViewOC_typekey", value.asInstanceOf[js.Any])
  }
  
}

