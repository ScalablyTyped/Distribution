package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceTasks extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val ItemCountExceeded: scala.Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): SharedWorkspaceTask = js.native
  def Add(Title: java.lang.String): SharedWorkspaceTask = js.native
  def Add(Title: java.lang.String, Status: MsoSharedWorkspaceTaskStatus): SharedWorkspaceTask = js.native
  def Add(
    Title: java.lang.String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: java.lang.String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: java.lang.String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: java.lang.String
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: java.lang.String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: java.lang.String,
    DueDate: stdLib.VarDate
  ): SharedWorkspaceTask = js.native
  def Item(Index: scala.Double): SharedWorkspaceTask = js.native
}

