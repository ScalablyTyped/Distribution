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
  var List: activexDashInteropLib.SafeArray[FolderListEntry]
}

