package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationSubnetGroupResponse extends js.Object {
  /**
    * The modified replication subnet group.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationSubnetGroup] = js.native
}

object ModifyReplicationSubnetGroupResponse {
  @scala.inline
  def apply(ReplicationSubnetGroup: ReplicationSubnetGroup = null): ModifyReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationSubnetGroup != null) __obj.updateDynamic("ReplicationSubnetGroup")(ReplicationSubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationSubnetGroupResponse]
  }
}

