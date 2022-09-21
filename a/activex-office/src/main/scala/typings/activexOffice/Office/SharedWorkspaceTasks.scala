package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceTasks extends StObject {
  
  def apply(Index: Double): SharedWorkspaceTask = js.native
  
  def Add(Title: String): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: Unit, Priority: Unit, Assignee: Unit, Description: String): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: Unit, Priority: Unit, Assignee: Unit, Description: String, DueDate: VarDate): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: Unit, Priority: Unit, Assignee: Unit, Description: Unit, DueDate: VarDate): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: Unit, Priority: Unit, Assignee: SharedWorkspaceMember): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: Unit, Priority: Unit, Assignee: SharedWorkspaceMember, Description: String): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: Unit,
    Assignee: SharedWorkspaceMember,
    Description: String,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: Unit,
    Assignee: SharedWorkspaceMember,
    Description: Unit,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: Unit, Priority: MsoSharedWorkspaceTaskPriority): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: Unit,
    Description: String
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: Unit,
    Description: String,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: Unit,
    Description: Unit,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: String
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: String,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: Unit,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: Unit,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: MsoSharedWorkspaceTaskStatus): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: Unit,
    Assignee: Unit,
    Description: String
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: Unit,
    Assignee: Unit,
    Description: String,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: Unit,
    Assignee: Unit,
    Description: Unit,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: Unit,
    Assignee: SharedWorkspaceMember
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: Unit,
    Assignee: SharedWorkspaceMember,
    Description: String
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: Unit,
    Assignee: SharedWorkspaceMember,
    Description: String,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: Unit,
    Assignee: SharedWorkspaceMember,
    Description: Unit,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(Title: String, Status: MsoSharedWorkspaceTaskStatus, Priority: MsoSharedWorkspaceTaskPriority): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: Unit,
    Description: String
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: Unit,
    Description: String,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: Unit,
    Description: Unit,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
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
  def Add(
    Title: String,
    Status: MsoSharedWorkspaceTaskStatus,
    Priority: MsoSharedWorkspaceTaskPriority,
    Assignee: SharedWorkspaceMember,
    Description: Unit,
    DueDate: VarDate
  ): SharedWorkspaceTask = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): SharedWorkspaceTask = js.native
  
  val ItemCountExceeded: Boolean = js.native
  
  val Parent: Any = js.native
}
