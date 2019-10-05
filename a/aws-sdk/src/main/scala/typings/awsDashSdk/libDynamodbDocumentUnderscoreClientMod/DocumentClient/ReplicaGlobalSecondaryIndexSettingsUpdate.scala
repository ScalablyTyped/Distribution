package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.IndexName
  /**
    * Autoscaling settings for managing a global secondary index replica's read capacity units.
    */
  var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}

object ReplicaGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: IndexName,
    ProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    ProvisionedReadCapacityUnits: Int | scala.Double = null
  ): ReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName)
    if (ProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettingsUpdate")(ProvisionedReadCapacityAutoScalingSettingsUpdate)
    if (ProvisionedReadCapacityUnits != null) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
  }
}

