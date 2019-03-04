package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about a single folder in a {@link FolderList} . */
trait FolderListEntry extends js.Object {
  /**
    * A (unique) identifier for the folder (used by IMAP, where different folders with equal human-readable titles may exist; otherwise, it may be left
    * empty).
    */
  var ID: java.lang.String
  /** The folder is new. */
  var New: scala.Boolean
  /** The folder shall be purged (only used in conjunction with the FolderListCommand::SET). */
  var Purge: scala.Boolean
  /** The folder has been removed. */
  var Removed: scala.Boolean
  /** The folder is subscribed. */
  var Subscribed: scala.Boolean
  /** The title of the folder. */
  var Title: java.lang.String
}

object FolderListEntry {
  @scala.inline
  def apply(
    ID: java.lang.String,
    New: scala.Boolean,
    Purge: scala.Boolean,
    Removed: scala.Boolean,
    Subscribed: scala.Boolean,
    Title: java.lang.String
  ): FolderListEntry = {
    val __obj = js.Dynamic.literal(ID = ID, New = New, Purge = Purge, Removed = Removed, Subscribed = Subscribed, Title = Title)
  
    __obj.asInstanceOf[FolderListEntry]
  }
}

