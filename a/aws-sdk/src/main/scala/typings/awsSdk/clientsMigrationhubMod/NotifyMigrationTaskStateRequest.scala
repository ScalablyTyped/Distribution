package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyMigrationTaskStateRequest extends StObject {
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.DryRun] = js.undefined
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.clientsMigrationhubMod.MigrationTaskName
  
  /**
    * Number of seconds after the UpdateDateTime within which the Migration Hub can expect an update. If Migration Hub does not receive an update within the specified interval, then the migration task will be considered stale.
    */
  var NextUpdateSeconds: typings.awsSdk.clientsMigrationhubMod.NextUpdateSeconds
  
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsSdk.clientsMigrationhubMod.ProgressUpdateStream
  
  /**
    * Information about the task's progress and status.
    */
  var Task: typings.awsSdk.clientsMigrationhubMod.Task
  
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.Date
}
object NotifyMigrationTaskStateRequest {
  
  inline def apply(
    MigrationTaskName: MigrationTaskName,
    NextUpdateSeconds: NextUpdateSeconds,
    ProgressUpdateStream: ProgressUpdateStream,
    Task: Task,
    UpdateDateTime: js.Date
  ): NotifyMigrationTaskStateRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], NextUpdateSeconds = NextUpdateSeconds.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any], UpdateDateTime = UpdateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyMigrationTaskStateRequest]
  }
  
  extension [Self <: NotifyMigrationTaskStateRequest](x: Self) {
    
    inline def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateSeconds(value: NextUpdateSeconds): Self = StObject.set(x, "NextUpdateSeconds", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
    
    inline def setTask(value: Task): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
  }
}
