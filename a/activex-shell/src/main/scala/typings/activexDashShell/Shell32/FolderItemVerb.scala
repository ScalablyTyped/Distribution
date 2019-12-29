package typings.activexDashShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Definition of interface FolderItemVerb */
@JSGlobal("Shell32.FolderItemVerb")
@js.native
class FolderItemVerb protected () extends js.Object {
  /** Get display name for item */
  val Name: String = js.native
  @JSName("Shell32.FolderItemVerb_typekey")
  var Shell32DotFolderItemVerb_typekey: FolderItemVerb = js.native
  /** Execute the verb */
  def DoIt(): Unit = js.native
}

