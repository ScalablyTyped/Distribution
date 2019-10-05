package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsDashSdk.clientsDynamodbMod.IndexName
  /**
    * AutoScaling settings for managing a global secondary index's write capacity units.
    */
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}

object GlobalTableGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: IndexName,
    ProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    ProvisionedWriteCapacityUnits: Int | scala.Double = null
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName)
    if (ProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(ProvisionedWriteCapacityAutoScalingSettingsUpdate)
    if (ProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
}

