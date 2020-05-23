package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoSharedWorkspaceTaskPriority
import typings.activexOffice.Office.MsoSharedWorkspaceTaskStatus
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceTask")
@js.native
class SharedWorkspaceTask protected ()
  extends typings.activexOffice.Office.SharedWorkspaceTask {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var AssignedTo: String = js.native
  /* CompleteClass */
  override val CreatedBy: String = js.native
  /* CompleteClass */
  override val CreatedDate: VarDate = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override var DueDate: VarDate = js.native
  /* CompleteClass */
  override val ModifiedBy: String = js.native
  /* CompleteClass */
  override val ModifiedDate: VarDate = js.native
  /* CompleteClass */
  @JSName("Office.SharedWorkspaceTask_typekey")
  override var OfficeDotSharedWorkspaceTask_typekey: typings.activexOffice.Office.SharedWorkspaceTask = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Priority: MsoSharedWorkspaceTaskPriority = js.native
  /* CompleteClass */
  override var Status: MsoSharedWorkspaceTaskStatus = js.native
  /* CompleteClass */
  override var Title: String = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

