package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceFolder")
@js.native
class SharedWorkspaceFolder protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val FolderName: String = js.native
  @JSName("Office.SharedWorkspaceFolder_typekey")
  var OfficeDotSharedWorkspaceFolder_typekey: SharedWorkspaceFolder = js.native
  val Parent: js.Any = js.native
  def Delete(): Unit = js.native
  def Delete(DeleteEventIfFolderContainsFiles: Boolean): Unit = js.native
}

