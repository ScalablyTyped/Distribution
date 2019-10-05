package typings.activexDashOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceTasks extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val ItemCountExceeded: Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): SharedWorkspaceTask = js.native
  def Add(Title: String): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: MsoSharedWorkspaceTaskStatus): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: MsoSharedWorkspaceTaskStatus, Priority: MsoSharedWorkspaceTaskPriority): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: String
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: String,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Item(Index: Double): SharedWorkspaceTask = js.native
}

