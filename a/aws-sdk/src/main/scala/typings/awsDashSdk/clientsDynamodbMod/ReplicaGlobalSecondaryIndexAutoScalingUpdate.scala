package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexAutoScalingUpdate extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.IndexName] = js.native
  var ProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
}

object ReplicaGlobalSecondaryIndexAutoScalingUpdate {
  @scala.inline
  def apply(
    IndexName: IndexName = null,
    ProvisionedReadCapacityAutoScalingUpdate: AutoScalingSettingsUpdate = null
  ): ReplicaGlobalSecondaryIndexAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingUpdate != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingUpdate")(ProvisionedReadCapacityAutoScalingUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  }
}

