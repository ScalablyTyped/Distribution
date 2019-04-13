package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationTask extends js.Object {
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
    */
  var CdcStartPosition: js.UndefOr[String] = js.undefined
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.undefined
  /**
    * The last error (failure) message generated for the replication instance.
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
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  /**
    * The date the replication task was created.
    */
  var ReplicationTaskCreationDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The user-assigned replication task identifier or name. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The settings for the replication task.
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.undefined
  /**
    * The date the replication task is scheduled to start.
    */
  var ReplicationTaskStartDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The statistics for the task, including elapsed time, tables loaded, and table errors.
    */
  var ReplicationTaskStats: js.UndefOr[ReplicationTaskStats] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var SourceEndpointArn: js.UndefOr[String] = js.undefined
  /**
    * The status of the replication task.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The reason the replication task was stopped.
    */
  var StopReason: js.UndefOr[String] = js.undefined
  /**
    * Table mappings specified in the task.
    */
  var TableMappings: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var TargetEndpointArn: js.UndefOr[String] = js.undefined
}

object ReplicationTask {
  @scala.inline
  def apply(
    CdcStartPosition: String = null,
    CdcStopPosition: String = null,
    LastFailureMessage: String = null,
    MigrationType: MigrationTypeValue = null,
    RecoveryCheckpoint: String = null,
    ReplicationInstanceArn: String = null,
    ReplicationTaskArn: String = null,
    ReplicationTaskCreationDate: TStamp = null,
    ReplicationTaskIdentifier: String = null,
    ReplicationTaskSettings: String = null,
    ReplicationTaskStartDate: TStamp = null,
    ReplicationTaskStats: ReplicationTaskStats = null,
    SourceEndpointArn: String = null,
    Status: String = null,
    StopReason: String = null,
    TableMappings: String = null,
    TargetEndpointArn: String = null
  ): ReplicationTask = {
    val __obj = js.Dynamic.literal()
    if (CdcStartPosition != null) __obj.updateDynamic("CdcStartPosition")(CdcStartPosition)
    if (CdcStopPosition != null) __obj.updateDynamic("CdcStopPosition")(CdcStopPosition)
    if (LastFailureMessage != null) __obj.updateDynamic("LastFailureMessage")(LastFailureMessage)
    if (MigrationType != null) __obj.updateDynamic("MigrationType")(MigrationType.asInstanceOf[js.Any])
    if (RecoveryCheckpoint != null) __obj.updateDynamic("RecoveryCheckpoint")(RecoveryCheckpoint)
    if (ReplicationInstanceArn != null) __obj.updateDynamic("ReplicationInstanceArn")(ReplicationInstanceArn)
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn)
    if (ReplicationTaskCreationDate != null) __obj.updateDynamic("ReplicationTaskCreationDate")(ReplicationTaskCreationDate)
    if (ReplicationTaskIdentifier != null) __obj.updateDynamic("ReplicationTaskIdentifier")(ReplicationTaskIdentifier)
    if (ReplicationTaskSettings != null) __obj.updateDynamic("ReplicationTaskSettings")(ReplicationTaskSettings)
    if (ReplicationTaskStartDate != null) __obj.updateDynamic("ReplicationTaskStartDate")(ReplicationTaskStartDate)
    if (ReplicationTaskStats != null) __obj.updateDynamic("ReplicationTaskStats")(ReplicationTaskStats)
    if (SourceEndpointArn != null) __obj.updateDynamic("SourceEndpointArn")(SourceEndpointArn)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StopReason != null) __obj.updateDynamic("StopReason")(StopReason)
    if (TableMappings != null) __obj.updateDynamic("TableMappings")(TableMappings)
    if (TargetEndpointArn != null) __obj.updateDynamic("TargetEndpointArn")(TargetEndpointArn)
    __obj.asInstanceOf[ReplicationTask]
  }
}

