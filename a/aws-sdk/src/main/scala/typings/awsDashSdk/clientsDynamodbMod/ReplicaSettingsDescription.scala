package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaSettingsDescription extends js.Object {
  /**
    * The region name of the replica.
    */
  var RegionName: typings.awsDashSdk.clientsDynamodbMod.RegionName
  /**
    * The read/write capacity mode of the replica.
    */
  var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined
  /**
    * Replica global secondary index settings for the global table.
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.undefined
  /**
    * Autoscaling settings for a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  /**
    * AutoScaling settings for a global table replica's write capacity units.
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  /**
    * The current state of the region:    CREATING - The region is being created.    UPDATING - The region is being updated.    DELETING - The region is being deleted.    ACTIVE - The region is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ReplicaStatus] = js.undefined
}

object ReplicaSettingsDescription {
  @scala.inline
  def apply(
    RegionName: RegionName,
    ReplicaBillingModeSummary: BillingModeSummary = null,
    ReplicaGlobalSecondaryIndexSettings: ReplicaGlobalSecondaryIndexSettingsDescriptionList = null,
    ReplicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ReplicaProvisionedReadCapacityUnits: Int | scala.Double = null,
    ReplicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ReplicaProvisionedWriteCapacityUnits: Int | scala.Double = null,
    ReplicaStatus: ReplicaStatus = null
  ): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName)
    if (ReplicaBillingModeSummary != null) __obj.updateDynamic("ReplicaBillingModeSummary")(ReplicaBillingModeSummary)
    if (ReplicaGlobalSecondaryIndexSettings != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettings")(ReplicaGlobalSecondaryIndexSettings)
    if (ReplicaProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(ReplicaProvisionedReadCapacityAutoScalingSettings)
    if (ReplicaProvisionedReadCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    if (ReplicaProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(ReplicaProvisionedWriteCapacityAutoScalingSettings)
    if (ReplicaProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityUnits")(ReplicaProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    if (ReplicaStatus != null) __obj.updateDynamic("ReplicaStatus")(ReplicaStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
}

