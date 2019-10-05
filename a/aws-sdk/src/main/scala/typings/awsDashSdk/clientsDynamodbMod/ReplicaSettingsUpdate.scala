package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaSettingsUpdate extends js.Object {
  /**
    * The region of the replica to be added.
    */
  var RegionName: typings.awsDashSdk.clientsDynamodbMod.RegionName
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.undefined
  /**
    * Autoscaling settings for managing a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}

object ReplicaSettingsUpdate {
  @scala.inline
  def apply(
    RegionName: RegionName,
    ReplicaGlobalSecondaryIndexSettingsUpdate: ReplicaGlobalSecondaryIndexSettingsUpdateList = null,
    ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    ReplicaProvisionedReadCapacityUnits: Int | scala.Double = null
  ): ReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName)
    if (ReplicaGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(ReplicaGlobalSecondaryIndexSettingsUpdate)
    if (ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")(ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate)
    if (ReplicaProvisionedReadCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsUpdate]
  }
}

