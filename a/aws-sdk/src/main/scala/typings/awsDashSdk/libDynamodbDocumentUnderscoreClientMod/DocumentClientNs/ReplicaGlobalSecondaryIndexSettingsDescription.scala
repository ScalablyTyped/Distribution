package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
  /**
    *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
    */
  var IndexStatus: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexStatus
  ] = js.undefined
  /**
    * Autoscaling settings for a global secondary index replica's read capacity units.
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * AutoScaling settings for a global secondary index replica's write capacity units.
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}

object ReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(
    IndexName: IndexName,
    IndexStatus: IndexStatus = null,
    ProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    ProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  ): ReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName)
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(ProvisionedReadCapacityAutoScalingSettings)
    if (!js.isUndefined(ProvisionedReadCapacityUnits)) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits)
    if (ProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(ProvisionedWriteCapacityAutoScalingSettings)
    if (!js.isUndefined(ProvisionedWriteCapacityUnits)) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits)
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
  }
}

