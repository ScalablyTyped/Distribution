package typings.activexOffice.global.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.WorkflowTask")
@js.native
class WorkflowTask protected ()
  extends typings.activexOffice.Office.WorkflowTask {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val AssignedTo: String = js.native
  /* CompleteClass */
  override val CreatedBy: String = js.native
  /* CompleteClass */
  override val CreatedDate: VarDate = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Description: String = js.native
  /* CompleteClass */
  override val DueDate: VarDate = js.native
  /* CompleteClass */
  override val Id: String = js.native
  /* CompleteClass */
  override val ListID: String = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  @JSName("Office.WorkflowTask_typekey")
  override var OfficeDotWorkflowTask_typekey: typings.activexOffice.Office.WorkflowTask = js.native
  /* CompleteClass */
  override val WorkflowID: String = js.native
  /* CompleteClass */
  override def Show(): Double = js.native
}

