package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceTask")
@js.native
class SharedWorkspaceTask protected () extends js.Object {
  val Application: js.Any = js.native
  var AssignedTo: java.lang.String = js.native
  val CreatedBy: java.lang.String = js.native
  val CreatedDate: stdLib.VarDate = js.native
  val Creator: scala.Double = js.native
  var Description: java.lang.String = js.native
  var DueDate: stdLib.VarDate = js.native
  val ModifiedBy: java.lang.String = js.native
  val ModifiedDate: stdLib.VarDate = js.native
  var `Office.SharedWorkspaceTask_typekey`: SharedWorkspaceTask = js.native
  val Parent: js.Any = js.native
  var Priority: MsoSharedWorkspaceTaskPriority = js.native
  var Status: MsoSharedWorkspaceTaskStatus = js.native
  var Title: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

