package typings.activexDashOffice.OfficeNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceTask")
@js.native
class SharedWorkspaceTask protected () extends js.Object {
  val Application: js.Any = js.native
  var AssignedTo: String = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  var DueDate: VarDate = js.native
  val ModifiedBy: String = js.native
  val ModifiedDate: VarDate = js.native
  var `Office.SharedWorkspaceTask_typekey`: SharedWorkspaceTask = js.native
  val Parent: js.Any = js.native
  var Priority: MsoSharedWorkspaceTaskPriority = js.native
  var Status: MsoSharedWorkspaceTaskStatus = js.native
  var Title: String = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
}

