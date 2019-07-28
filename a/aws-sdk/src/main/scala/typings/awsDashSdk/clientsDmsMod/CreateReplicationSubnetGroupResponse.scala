package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationSubnetGroupResponse extends js.Object {
  /**
    * The replication subnet group that was created.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationSubnetGroup] = js.undefined
}

object CreateReplicationSubnetGroupResponse {
  @scala.inline
  def apply(ReplicationSubnetGroup: ReplicationSubnetGroup = null): CreateReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationSubnetGroup != null) __obj.updateDynamic("ReplicationSubnetGroup")(ReplicationSubnetGroup)
    __obj.asInstanceOf[CreateReplicationSubnetGroupResponse]
  }
}

