package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedWorkspaceTask extends StObject {
  
  val Application: Any
  
  var AssignedTo: String
  
  val CreatedBy: String
  
  val CreatedDate: VarDate
  
  val Creator: Double
  
  def Delete(): Unit
  
  var Description: String
  
  var DueDate: VarDate
  
  val ModifiedBy: String
  
  val ModifiedDate: VarDate
  
  /* private */ @JSName("Office.SharedWorkspaceTask_typekey")
  var OfficeDotSharedWorkspaceTask_typekey: SharedWorkspaceTask
  
  val Parent: Any
  
  var Priority: MsoSharedWorkspaceTaskPriority
  
  def Save(): Unit
  
  var Status: MsoSharedWorkspaceTaskStatus
  
  var Title: String
}
object SharedWorkspaceTask {
  
  inline def apply(
    Application: Any,
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
    Parent: Any,
    Priority: MsoSharedWorkspaceTaskPriority,
    Save: () => Unit,
    Status: MsoSharedWorkspaceTaskStatus,
    Title: String
  ): SharedWorkspaceTask = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignedTo = AssignedTo.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], DueDate = DueDate.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), Status = Status.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceTask_typekey")(OfficeDotSharedWorkspaceTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceTask]
  }
  
  extension [Self <: SharedWorkspaceTask](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAssignedTo(value: String): Self = StObject.set(x, "AssignedTo", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: VarDate): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDueDate(value: VarDate): Self = StObject.set(x, "DueDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: VarDate): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSharedWorkspaceTask_typekey(value: SharedWorkspaceTask): Self = StObject.set(x, "Office.SharedWorkspaceTask_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: MsoSharedWorkspaceTaskPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setStatus(value: MsoSharedWorkspaceTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
