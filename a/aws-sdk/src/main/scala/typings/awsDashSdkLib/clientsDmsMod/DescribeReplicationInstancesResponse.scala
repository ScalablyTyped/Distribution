package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReplicationInstancesResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The replication instances described.
    */
  var ReplicationInstances: js.UndefOr[ReplicationInstanceList] = js.undefined
}

object DescribeReplicationInstancesResponse {
  @scala.inline
  def apply(Marker: String = null, ReplicationInstances: ReplicationInstanceList = null): DescribeReplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReplicationInstances != null) __obj.updateDynamic("ReplicationInstances")(ReplicationInstances)
    __obj.asInstanceOf[DescribeReplicationInstancesResponse]
  }
}

