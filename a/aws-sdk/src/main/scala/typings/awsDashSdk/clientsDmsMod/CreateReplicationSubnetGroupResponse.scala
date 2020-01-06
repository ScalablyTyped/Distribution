package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationSubnetGroupResponse extends js.Object {
  /**
    * The replication subnet group that was created.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationSubnetGroup] = js.native
}

object CreateReplicationSubnetGroupResponse {
  @scala.inline
  def apply(ReplicationSubnetGroup: ReplicationSubnetGroup = null): CreateReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationSubnetGroup != null) __obj.updateDynamic("ReplicationSubnetGroup")(ReplicationSubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationSubnetGroupResponse]
  }
}

