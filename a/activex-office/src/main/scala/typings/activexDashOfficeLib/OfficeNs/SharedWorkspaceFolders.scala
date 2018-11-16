package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceFolders extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val ItemCountExceeded: scala.Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): SharedWorkspaceFolder = js.native
  def Add(FolderName: java.lang.String): SharedWorkspaceFolder = js.native
  def Add(FolderName: java.lang.String, ParentFolder: SharedWorkspaceFolder): SharedWorkspaceFolder = js.native
  def Item(Index: scala.Double): SharedWorkspaceFolder = js.native
}

