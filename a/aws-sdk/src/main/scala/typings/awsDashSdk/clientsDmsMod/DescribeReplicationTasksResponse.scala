package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReplicationTasksResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A description of the replication tasks.
    */
  var ReplicationTasks: js.UndefOr[ReplicationTaskList] = js.undefined
}

object DescribeReplicationTasksResponse {
  @scala.inline
  def apply(Marker: String = null, ReplicationTasks: ReplicationTaskList = null): DescribeReplicationTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReplicationTasks != null) __obj.updateDynamic("ReplicationTasks")(ReplicationTasks)
    __obj.asInstanceOf[DescribeReplicationTasksResponse]
  }
}

