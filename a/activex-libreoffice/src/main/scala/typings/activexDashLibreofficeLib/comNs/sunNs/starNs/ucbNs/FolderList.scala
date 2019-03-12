package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of folders. */
trait FolderList extends js.Object {
  /** The command to process on this list of folders. */
  var Command: FolderListCommand
  /** The list of folders (only used in conjunction with FolderListCommand::SET). */
  var List: stdLib.SafeArray[FolderListEntry]
}

object FolderList {
  @scala.inline
  def apply(Command: FolderListCommand, List: stdLib.SafeArray[FolderListEntry]): FolderList = {
    val __obj = js.Dynamic.literal(Command = Command, List = List)
  
    __obj.asInstanceOf[FolderList]
  }
}

