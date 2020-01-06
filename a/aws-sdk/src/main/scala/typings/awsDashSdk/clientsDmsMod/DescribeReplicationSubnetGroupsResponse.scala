package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationSubnetGroupsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A description of the replication subnet groups.
    */
  var ReplicationSubnetGroups: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationSubnetGroups] = js.native
}

object DescribeReplicationSubnetGroupsResponse {
  @scala.inline
  def apply(Marker: String = null, ReplicationSubnetGroups: ReplicationSubnetGroups = null): DescribeReplicationSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReplicationSubnetGroups != null) __obj.updateDynamic("ReplicationSubnetGroups")(ReplicationSubnetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplicationSubnetGroupsResponse]
  }
}

