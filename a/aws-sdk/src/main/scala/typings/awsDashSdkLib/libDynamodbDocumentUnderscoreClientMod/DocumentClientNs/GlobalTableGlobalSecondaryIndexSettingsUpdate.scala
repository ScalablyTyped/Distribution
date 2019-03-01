package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: IndexName
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
    ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IndexName")(IndexName)
    if (ProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(ProvisionedWriteCapacityAutoScalingSettingsUpdate)
    if (!js.isUndefined(ProvisionedWriteCapacityUnits)) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits)
    __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
}

