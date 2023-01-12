package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationTaskSummary extends StObject {
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.MigrationTaskName] = js.undefined
  
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.ProgressPercent] = js.undefined
  
  /**
    * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all updates made by the tool.
    */
  var ProgressUpdateStream: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.ProgressUpdateStream] = js.undefined
  
  /**
    * Status of the task.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.Status] = js.undefined
  
  /**
    * Detail information of what is being done within the overall status state.
    */
  var StatusDetail: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.StatusDetail] = js.undefined
  
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[js.Date] = js.undefined
}
object MigrationTaskSummary {
  
  inline def apply(): MigrationTaskSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationTaskSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrationTaskSummary] (val x: Self) extends AnyVal {
    
    inline def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    inline def setMigrationTaskNameUndefined: Self = StObject.set(x, "MigrationTaskName", js.undefined)
    
    inline def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    inline def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStreamUndefined: Self = StObject.set(x, "ProgressUpdateStream", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetail(value: StatusDetail): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTimeUndefined: Self = StObject.set(x, "UpdateDateTime", js.undefined)
  }
}
