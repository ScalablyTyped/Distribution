package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
  var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
}

object ModifyReplicationGroupShardConfigurationResult {
  @scala.inline
  def apply(ReplicationGroup: ReplicationGroup = null): ModifyReplicationGroupShardConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
  }
}

