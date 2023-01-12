package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationTask extends StObject {
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.MigrationTaskName] = js.undefined
  
  /**
    * A name that identifies the vendor of the migration tool being used.
    */
  var ProgressUpdateStream: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.ProgressUpdateStream] = js.undefined
  
  /**
    * Information about the resource that is being migrated. This data will be used to map the task to a resource in the Application Discovery Service repository.
    */
  var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList] = js.undefined
  
  /**
    * Task object encapsulating task information.
    */
  var Task: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.Task] = js.undefined
  
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[js.Date] = js.undefined
}
object MigrationTask {
  
  inline def apply(): MigrationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrationTask] (val x: Self) extends AnyVal {
    
    inline def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    inline def setMigrationTaskNameUndefined: Self = StObject.set(x, "MigrationTaskName", js.undefined)
    
    inline def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStreamUndefined: Self = StObject.set(x, "ProgressUpdateStream", js.undefined)
    
    inline def setResourceAttributeList(value: LatestResourceAttributeList): Self = StObject.set(x, "ResourceAttributeList", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributeListUndefined: Self = StObject.set(x, "ResourceAttributeList", js.undefined)
    
    inline def setResourceAttributeListVarargs(value: ResourceAttribute*): Self = StObject.set(x, "ResourceAttributeList", js.Array(value*))
    
    inline def setTask(value: Task): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "Task", js.undefined)
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTimeUndefined: Self = StObject.set(x, "UpdateDateTime", js.undefined)
  }
}
