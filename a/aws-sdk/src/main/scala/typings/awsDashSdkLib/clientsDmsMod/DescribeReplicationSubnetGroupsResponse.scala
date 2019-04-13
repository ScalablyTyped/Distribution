package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReplicationSubnetGroupsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A description of the replication subnet groups.
    */
  var ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups] = js.undefined
}

object DescribeReplicationSubnetGroupsResponse {
  @scala.inline
  def apply(Marker: String = null, ReplicationSubnetGroups: ReplicationSubnetGroups = null): DescribeReplicationSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReplicationSubnetGroups != null) __obj.updateDynamic("ReplicationSubnetGroups")(ReplicationSubnetGroups)
    __obj.asInstanceOf[DescribeReplicationSubnetGroupsResponse]
  }
}

