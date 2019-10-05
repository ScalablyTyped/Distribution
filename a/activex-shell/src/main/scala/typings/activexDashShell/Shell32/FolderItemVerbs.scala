package typings.activexDashShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Definition of interface FolderItemVerbs */
@JSGlobal("Shell32.FolderItemVerbs")
@js.native
class FolderItemVerbs protected () extends js.Object {
  /** Get count of open folder windows */
  val Count: Double = js.native
  var `Shell32.FolderItemVerbs_typekey`: FolderItemVerbs = js.native
  /** Return the specified verb */
  def Item(): FolderItemVerb = js.native
  def Item(index: js.Any): FolderItemVerb = js.native
}

