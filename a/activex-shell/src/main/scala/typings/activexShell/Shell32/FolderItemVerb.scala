package typings.activexShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Definition of interface FolderItemVerb */
trait FolderItemVerb extends js.Object {
  /** Get display name for item */
  val Name: String
  @JSName("Shell32.FolderItemVerb_typekey")
  var Shell32DotFolderItemVerb_typekey: FolderItemVerb
  /** Execute the verb */
  def DoIt(): Unit
}

object FolderItemVerb {
  @scala.inline
  def apply(DoIt: () => Unit, Name: String, Shell32DotFolderItemVerb_typekey: FolderItemVerb): FolderItemVerb = {
    val __obj = js.Dynamic.literal(DoIt = js.Any.fromFunction0(DoIt), Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell32.FolderItemVerb_typekey")(Shell32DotFolderItemVerb_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderItemVerb]
  }
}

