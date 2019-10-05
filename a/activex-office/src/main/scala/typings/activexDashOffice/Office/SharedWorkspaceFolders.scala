package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceFolders extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val ItemCountExceeded: Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): SharedWorkspaceFolder = js.native
  def Add(FolderName: String): SharedWorkspaceFolder = js.native
  def Add(FolderName: String, ParentFolder: SharedWorkspaceFolder): SharedWorkspaceFolder = js.native
  def Item(Index: Double): SharedWorkspaceFolder = js.native
}

