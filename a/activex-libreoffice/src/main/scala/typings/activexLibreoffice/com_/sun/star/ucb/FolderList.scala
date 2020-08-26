package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of folders. */
@js.native
trait FolderList extends js.Object {
  /** The command to process on this list of folders. */
  var Command: FolderListCommand = js.native
  /** The list of folders (only used in conjunction with FolderListCommand::SET). */
  var List: SafeArray[FolderListEntry] = js.native
}

object FolderList {
  @scala.inline
  def apply(Command: FolderListCommand, List: SafeArray[FolderListEntry]): FolderList = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderList]
  }
  @scala.inline
  implicit class FolderListOps[Self <: FolderList] (val x: Self) extends AnyVal {
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
    def setCommand(value: FolderListCommand): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: SafeArray[FolderListEntry]): Self = this.set("List", value.asInstanceOf[js.Any])
  }
  
}

