package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about a single folder in a {@link FolderList} . */
trait FolderListEntry extends js.Object {
  /**
    * A (unique) identifier for the folder (used by IMAP, where different folders with equal human-readable titles may exist; otherwise, it may be left
    * empty).
    */
  var ID: String
  /** The folder is new. */
  var New: Boolean
  /** The folder shall be purged (only used in conjunction with the FolderListCommand::SET). */
  var Purge: Boolean
  /** The folder has been removed. */
  var Removed: Boolean
  /** The folder is subscribed. */
  var Subscribed: Boolean
  /** The title of the folder. */
  var Title: String
}

object FolderListEntry {
  @scala.inline
  def apply(ID: String, New: Boolean, Purge: Boolean, Removed: Boolean, Subscribed: Boolean, Title: String): FolderListEntry = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], New = New.asInstanceOf[js.Any], Purge = Purge.asInstanceOf[js.Any], Removed = Removed.asInstanceOf[js.Any], Subscribed = Subscribed.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderListEntry]
  }
}

