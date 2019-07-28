package typings.activexDashOffice.OfficeNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspace")
@js.native
class SharedWorkspace protected () extends js.Object {
  val Application: js.Any = js.native
  val Connected: Boolean = js.native
  val Creator: Double = js.native
  @JSName("Files")
  val Files_Original: SharedWorkspaceFiles = js.native
  @JSName("Folders")
  val Folders_Original: SharedWorkspaceFolders = js.native
  val LastRefreshed: VarDate = js.native
  @JSName("Links")
  val Links_Original: SharedWorkspaceLinks = js.native
  @JSName("Members")
  val Members_Original: SharedWorkspaceMembers = js.native
  var Name: String = js.native
  var `Office.SharedWorkspace_typekey`: SharedWorkspace = js.native
  val Parent: js.Any = js.native
  var SourceURL: String = js.native
  @JSName("Tasks")
  val Tasks_Original: SharedWorkspaceTasks = js.native
  val URL: String = js.native
  def CreateNew(): Unit = js.native
  def CreateNew(URL: String): Unit = js.native
  def CreateNew(URL: String, Name: String): Unit = js.native
  def Delete(): Unit = js.native
  def Disconnect(): Unit = js.native
  def Files(Index: Double): SharedWorkspaceFile = js.native
  def Folders(Index: Double): SharedWorkspaceFolder = js.native
  def Links(Index: Double): SharedWorkspaceLink = js.native
  def Members(Index: Double): SharedWorkspaceMember = js.native
  def Refresh(): Unit = js.native
  def RemoveDocument(): Unit = js.native
  def Tasks(Index: Double): SharedWorkspaceTask = js.native
}

