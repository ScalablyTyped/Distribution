package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaAutoScalingUpdate extends js.Object {
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.RegionName = js.native
  /**
    * Represents the auto scaling settings of global secondary indexes that will be modified.
    */
  var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList] = js.native
  var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
}

object ReplicaAutoScalingUpdate {
  @scala.inline
  def apply(
    RegionName: RegionName,
    ReplicaGlobalSecondaryIndexUpdates: ReplicaGlobalSecondaryIndexAutoScalingUpdateList = null,
    ReplicaProvisionedReadCapacityAutoScalingUpdate: AutoScalingSettingsUpdate = null
  ): ReplicaAutoScalingUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexUpdates != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexUpdates")(ReplicaGlobalSecondaryIndexUpdates.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingUpdate != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingUpdate")(ReplicaProvisionedReadCapacityAutoScalingUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAutoScalingUpdate]
  }
}

