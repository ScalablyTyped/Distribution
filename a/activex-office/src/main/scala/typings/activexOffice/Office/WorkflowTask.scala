package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTask extends js.Object {
  val Application: js.Any
  val AssignedTo: String
  val CreatedBy: String
  val CreatedDate: VarDate
  val Creator: Double
  val Description: String
  val DueDate: VarDate
  val Id: String
  val ListID: String
  val Name: String
  @JSName("Office.WorkflowTask_typekey")
  var OfficeDotWorkflowTask_typekey: WorkflowTask
  val WorkflowID: String
  def Show(): Double
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
}

