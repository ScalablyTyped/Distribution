package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceFiles extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val ItemCountExceeded: scala.Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): SharedWorkspaceFile = js.native
  def Add(FileName: java.lang.String): SharedWorkspaceFile = js.native
  def Add(FileName: java.lang.String, ParentFolder: SharedWorkspaceFolder): SharedWorkspaceFile = js.native
  def Add(
    FileName: java.lang.String,
    ParentFolder: SharedWorkspaceFolder,
    OverwriteIfFileAlreadyExists: scala.Boolean
  ): SharedWorkspaceFile = js.native
  def Add(
    FileName: java.lang.String,
    ParentFolder: SharedWorkspaceFolder,
    OverwriteIfFileAlreadyExists: scala.Boolean,
    KeepInSync: scala.Boolean
  ): SharedWorkspaceFile = js.native
  def Item(Index: scala.Double): SharedWorkspaceFile = js.native
}

