package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.WorkflowTask")
@js.native
class WorkflowTask protected () extends js.Object {
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

