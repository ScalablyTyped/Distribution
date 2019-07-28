package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncreaseReplicaCountResult extends js.Object {
  var ReplicationGroup: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}

object IncreaseReplicaCountResult {
  @scala.inline
  def apply(ReplicationGroup: ReplicationGroup = null): IncreaseReplicaCountResult = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[IncreaseReplicaCountResult]
  }
}

