package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspace")
@js.native
class SharedWorkspace protected () extends js.Object {
  val Application: js.Any = js.native
  val Connected: scala.Boolean = js.native
  val Creator: scala.Double = js.native
  @JSName("Files")
  val Files_Original: SharedWorkspaceFiles = js.native
  @JSName("Folders")
  val Folders_Original: SharedWorkspaceFolders = js.native
  val LastRefreshed: stdLib.VarDate = js.native
  @JSName("Links")
  val Links_Original: SharedWorkspaceLinks = js.native
  @JSName("Members")
  val Members_Original: SharedWorkspaceMembers = js.native
  var Name: java.lang.String = js.native
  var `Office.SharedWorkspace_typekey`: SharedWorkspace = js.native
  val Parent: js.Any = js.native
  var SourceURL: java.lang.String = js.native
  @JSName("Tasks")
  val Tasks_Original: SharedWorkspaceTasks = js.native
  val URL: java.lang.String = js.native
  def CreateNew(): scala.Unit = js.native
  def CreateNew(URL: java.lang.String): scala.Unit = js.native
  def CreateNew(URL: java.lang.String, Name: java.lang.String): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Disconnect(): scala.Unit = js.native
  def Files(Index: scala.Double): SharedWorkspaceFile = js.native
  def Folders(Index: scala.Double): SharedWorkspaceFolder = js.native
  def Links(Index: scala.Double): SharedWorkspaceLink = js.native
  def Members(Index: scala.Double): SharedWorkspaceMember = js.native
  def Refresh(): scala.Unit = js.native
  def RemoveDocument(): scala.Unit = js.native
  def Tasks(Index: scala.Double): SharedWorkspaceTask = js.native
}

