package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartReplicationTaskMessage extends js.Object {
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
    */
  var CdcStartPosition: js.UndefOr[String] = js.undefined
  /**
    * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
    */
  var CdcStartTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication task to be started.
    */
  var ReplicationTaskArn: String
  /**
    * The type of replication task.
    */
  var StartReplicationTaskType: StartReplicationTaskTypeValue
}

object StartReplicationTaskMessage {
  @scala.inline
  def apply(
    ReplicationTaskArn: String,
    StartReplicationTaskType: StartReplicationTaskTypeValue,
    CdcStartPosition: String = null,
    CdcStartTime: TStamp = null,
    CdcStopPosition: String = null
  ): StartReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn, StartReplicationTaskType = StartReplicationTaskType.asInstanceOf[js.Any])
    if (CdcStartPosition != null) __obj.updateDynamic("CdcStartPosition")(CdcStartPosition)
    if (CdcStartTime != null) __obj.updateDynamic("CdcStartTime")(CdcStartTime)
    if (CdcStopPosition != null) __obj.updateDynamic("CdcStopPosition")(CdcStopPosition)
    __obj.asInstanceOf[StartReplicationTaskMessage]
  }
}

