package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTask extends js.Object {
  val Application: js.Any = js.native
  val AssignedTo: String = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val DueDate: VarDate = js.native
  val Id: String = js.native
  val ListID: String = js.native
  val Name: String = js.native
  @JSName("Office.WorkflowTask_typekey")
  var OfficeDotWorkflowTask_typekey: WorkflowTask = js.native
  val WorkflowID: String = js.native
  def Show(): Double = js.native
}

object WorkflowTask {
  @scala.inline
  def apply(
    Application: js.Any,
    AssignedTo: String,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Description: String,
    DueDate: VarDate,
    Id: String,
    ListID: String,
    Name: String,
    OfficeDotWorkflowTask_typekey: WorkflowTask,
    Show: () => Double,
    WorkflowID: String
  ): WorkflowTask = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignedTo = AssignedTo.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DueDate = DueDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ListID = ListID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show), WorkflowID = WorkflowID.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.WorkflowTask_typekey")(OfficeDotWorkflowTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTask]
  }
  @scala.inline
  implicit class WorkflowTaskOps[Self <: WorkflowTask] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDueDate(value: VarDate): Self = this.set("DueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setListID(value: String): Self = this.set("ListID", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotWorkflowTask_typekey(value: WorkflowTask): Self = this.set("Office.WorkflowTask_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: () => Double): Self = this.set("Show", js.Any.fromFunction0(value))
    @scala.inline
    def setWorkflowID(value: String): Self = this.set("WorkflowID", value.asInstanceOf[js.Any])
  }
  
}

