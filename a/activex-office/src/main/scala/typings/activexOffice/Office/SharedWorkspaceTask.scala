package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceTask extends js.Object {
  val Application: js.Any = js.native
  var AssignedTo: String = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  var DueDate: VarDate = js.native
  val ModifiedBy: String = js.native
  val ModifiedDate: VarDate = js.native
  @JSName("Office.SharedWorkspaceTask_typekey")
  var OfficeDotSharedWorkspaceTask_typekey: SharedWorkspaceTask = js.native
  val Parent: js.Any = js.native
  var Priority: MsoSharedWorkspaceTaskPriority = js.native
  var Status: MsoSharedWorkspaceTaskStatus = js.native
  var Title: String = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
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
  @scala.inline
  implicit class SharedWorkspaceTaskOps[Self <: SharedWorkspaceTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignedTo(value: String): Self = this.set("AssignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedDate(value: VarDate): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDueDate(value: VarDate): Self = this.set("DueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedBy(value: String): Self = this.set("ModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedDate(value: VarDate): Self = this.set("ModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotSharedWorkspaceTask_typekey(value: SharedWorkspaceTask): Self = this.set("Office.SharedWorkspaceTask_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: MsoSharedWorkspaceTaskPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: MsoSharedWorkspaceTaskStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
  }
  
}

