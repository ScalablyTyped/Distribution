package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  /**
    * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and task log size (in bytes). 
    */
  var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.native
}

object DescribeReplicationInstanceTaskLogsResponse {
  @scala.inline
  def apply(
    Marker: String = null,
    ReplicationInstanceArn: String = null,
    ReplicationInstanceTaskLogs: ReplicationInstanceTaskLogsList = null
  ): DescribeReplicationInstanceTaskLogsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReplicationInstanceArn != null) __obj.updateDynamic("ReplicationInstanceArn")(ReplicationInstanceArn.asInstanceOf[js.Any])
    if (ReplicationInstanceTaskLogs != null) __obj.updateDynamic("ReplicationInstanceTaskLogs")(ReplicationInstanceTaskLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
  }
}

