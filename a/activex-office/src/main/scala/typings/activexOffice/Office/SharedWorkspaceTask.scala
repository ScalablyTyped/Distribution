package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWorkspaceTask extends js.Object {
  val Application: js.Any
  var AssignedTo: String
  val CreatedBy: String
  val CreatedDate: VarDate
  val Creator: Double
  var Description: String
  var DueDate: VarDate
  val ModifiedBy: String
  val ModifiedDate: VarDate
  @JSName("Office.SharedWorkspaceTask_typekey")
  var OfficeDotSharedWorkspaceTask_typekey: SharedWorkspaceTask
  val Parent: js.Any
  var Priority: MsoSharedWorkspaceTaskPriority
  var Status: MsoSharedWorkspaceTaskStatus
  var Title: String
  def Delete(): Unit
  def Save(): Unit
}

object SharedWorkspaceTask {
  @scala.inline
  def apply(
    Application: js.Any,
    AssignedTo: String,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: () => Unit,
    Description: String,
    DueDate: VarDate,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    OfficeDotSharedWorkspaceTask_typekey: SharedWorkspaceTask,
    Parent: js.Any,
    Priority: MsoSharedWorkspaceTaskPriority,
    Save: () => Unit,
    Status: MsoSharedWorkspaceTaskStatus,
    Title: String
  ): SharedWorkspaceTask = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignedTo = AssignedTo.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], DueDate = DueDate.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), Status = Status.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceTask_typekey")(OfficeDotSharedWorkspaceTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceTask]
  }
}

