package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTask extends StObject {
  
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want the CDC operation to start. Specifying both values results in an error. The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
    */
  var CdcStartPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The last error (failure) message generated for the replication task.
    */
  var LastFailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The type of migration.
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined
  
  /**
    * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this value to the CdcStartPosition parameter to start a CDC operation that begins at that checkpoint.
    */
  var RecoveryCheckpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  
  /**
    * The date the replication task was created.
    */
  var ReplicationTaskCreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user-assigned replication task identifier or name. Constraints:   Must contain 1-255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The settings for the replication task.
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.undefined
  
  /**
    * The date the replication task is scheduled to start.
    */
  var ReplicationTaskStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The statistics for the task, including elapsed time, tables loaded, and table errors.
    */
  var ReplicationTaskStats: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationTaskStats] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
    */
  var SourceEndpointArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the replication task. This response parameter can return one of the following values:    "moving" – The task is being moved in response to running the  MoveReplicationTask  operation.    "creating" – The task is being created in response to running the  CreateReplicationTask  operation.    "deleting" – The task is being deleted in response to running the  DeleteReplicationTask  operation.    "failed" – The task failed to successfully complete the database migration in response to running the  StartReplicationTask  operation.    "failed-move" – The task failed to move in response to running the  MoveReplicationTask  operation.    "modifying" – The task definition is being modified in response to running the  ModifyReplicationTask  operation.    "ready" – The task is in a ready state where it can respond to other task operations, such as  StartReplicationTask  or  DeleteReplicationTask .     "running" – The task is performing a database migration in response to running the  StartReplicationTask  operation.    "starting" – The task is preparing to perform a database migration in response to running the  StartReplicationTask  operation.    "stopped" – The task has stopped in response to running the  StopReplicationTask  operation.    "stopping" – The task is preparing to stop in response to running the  StopReplicationTask  operation.    "testing" – The database migration specified for this task is being tested in response to running either the  StartReplicationTaskAssessmentRun  or the  StartReplicationTaskAssessment  operation.    StartReplicationTaskAssessmentRun  is an improved premigration task assessment operation. The  StartReplicationTaskAssessment  operation assesses data type compatibility only between the source and target database of a given migration task. In contrast,  StartReplicationTaskAssessmentRun  enables you to specify a variety of premigration task assessments in addition to data type compatibility. These assessments include ones for the validity of primary key definitions and likely issues with database migration performance, among others.   
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The reason the replication task was stopped. This response parameter can return one of the following values:    "Stop Reason NORMAL"     "Stop Reason RECOVERABLE_ERROR"     "Stop Reason FATAL_ERROR"     "Stop Reason FULL_LOAD_ONLY_FINISHED"     "Stop Reason STOPPED_AFTER_FULL_LOAD" – Full load completed, with cached changes not applied    "Stop Reason STOPPED_AFTER_CACHED_EVENTS" – Full load completed, with cached changes applied    "Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"     "Stop Reason STOPPED_AFTER_DDL_APPLY" – User-defined stop task after DDL applied    "Stop Reason STOPPED_DUE_TO_LOW_MEMORY"     "Stop Reason STOPPED_DUE_TO_LOW_DISK"     "Stop Reason STOPPED_AT_SERVER_TIME" – User-defined server time for stopping task    "Stop Reason STOPPED_AT_COMMIT_TIME" – User-defined commit time for stopping task    "Stop Reason RECONFIGURATION_RESTART"     "Stop Reason RECYCLE_TASK"   
    */
  var StopReason: js.UndefOr[String] = js.undefined
  
  /**
    * Table mappings specified in the task.
    */
  var TableMappings: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN that uniquely identifies the endpoint.
    */
  var TargetEndpointArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the replication instance to which this task is moved in response to running the  MoveReplicationTask  operation. Otherwise, this response parameter isn't a member of the ReplicationTask object.
    */
  var TargetReplicationInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For more information, see Specifying Supplemental Data for Task Settings in the Database Migration Service User Guide. 
    */
  var TaskData: js.UndefOr[String] = js.undefined
}
object ReplicationTask {
  
  inline def apply(): ReplicationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTask]
  }
  
  extension [Self <: ReplicationTask](x: Self) {
    
    inline def setCdcStartPosition(value: String): Self = StObject.set(x, "CdcStartPosition", value.asInstanceOf[js.Any])
    
    inline def setCdcStartPositionUndefined: Self = StObject.set(x, "CdcStartPosition", js.undefined)
    
    inline def setCdcStopPosition(value: String): Self = StObject.set(x, "CdcStopPosition", value.asInstanceOf[js.Any])
    
    inline def setCdcStopPositionUndefined: Self = StObject.set(x, "CdcStopPosition", js.undefined)
    
    inline def setLastFailureMessage(value: String): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    inline def setMigrationType(value: MigrationTypeValue): Self = StObject.set(x, "MigrationType", value.asInstanceOf[js.Any])
    
    inline def setMigrationTypeUndefined: Self = StObject.set(x, "MigrationType", js.undefined)
    
    inline def setRecoveryCheckpoint(value: String): Self = StObject.set(x, "RecoveryCheckpoint", value.asInstanceOf[js.Any])
    
    inline def setRecoveryCheckpointUndefined: Self = StObject.set(x, "RecoveryCheckpoint", js.undefined)
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    inline def setReplicationTaskCreationDate(value: js.Date): Self = StObject.set(x, "ReplicationTaskCreationDate", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskCreationDateUndefined: Self = StObject.set(x, "ReplicationTaskCreationDate", js.undefined)
    
    inline def setReplicationTaskIdentifier(value: String): Self = StObject.set(x, "ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskIdentifierUndefined: Self = StObject.set(x, "ReplicationTaskIdentifier", js.undefined)
    
    inline def setReplicationTaskSettings(value: String): Self = StObject.set(x, "ReplicationTaskSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskSettingsUndefined: Self = StObject.set(x, "ReplicationTaskSettings", js.undefined)
    
    inline def setReplicationTaskStartDate(value: js.Date): Self = StObject.set(x, "ReplicationTaskStartDate", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskStartDateUndefined: Self = StObject.set(x, "ReplicationTaskStartDate", js.undefined)
    
    inline def setReplicationTaskStats(value: ReplicationTaskStats): Self = StObject.set(x, "ReplicationTaskStats", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskStatsUndefined: Self = StObject.set(x, "ReplicationTaskStats", js.undefined)
    
    inline def setSourceEndpointArn(value: String): Self = StObject.set(x, "SourceEndpointArn", value.asInstanceOf[js.Any])
    
    inline def setSourceEndpointArnUndefined: Self = StObject.set(x, "SourceEndpointArn", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStopReason(value: String): Self = StObject.set(x, "StopReason", value.asInstanceOf[js.Any])
    
    inline def setStopReasonUndefined: Self = StObject.set(x, "StopReason", js.undefined)
    
    inline def setTableMappings(value: String): Self = StObject.set(x, "TableMappings", value.asInstanceOf[js.Any])
    
    inline def setTableMappingsUndefined: Self = StObject.set(x, "TableMappings", js.undefined)
    
    inline def setTargetEndpointArn(value: String): Self = StObject.set(x, "TargetEndpointArn", value.asInstanceOf[js.Any])
    
    inline def setTargetEndpointArnUndefined: Self = StObject.set(x, "TargetEndpointArn", js.undefined)
    
    inline def setTargetReplicationInstanceArn(value: String): Self = StObject.set(x, "TargetReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setTargetReplicationInstanceArnUndefined: Self = StObject.set(x, "TargetReplicationInstanceArn", js.undefined)
    
    inline def setTaskData(value: String): Self = StObject.set(x, "TaskData", value.asInstanceOf[js.Any])
    
    inline def setTaskDataUndefined: Self = StObject.set(x, "TaskData", js.undefined)
  }
}
