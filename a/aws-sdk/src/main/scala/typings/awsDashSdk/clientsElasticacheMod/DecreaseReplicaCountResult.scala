package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecreaseReplicaCountResult extends js.Object {
  var ReplicationGroup: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}

object DecreaseReplicaCountResult {
  @scala.inline
  def apply(ReplicationGroup: ReplicationGroup = null): DecreaseReplicaCountResult = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[DecreaseReplicaCountResult]
  }
}

