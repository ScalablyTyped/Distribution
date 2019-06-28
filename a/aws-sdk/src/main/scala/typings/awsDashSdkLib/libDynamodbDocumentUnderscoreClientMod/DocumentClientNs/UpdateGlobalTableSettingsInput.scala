package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGlobalTableSettingsInput extends js.Object {
  /**
    * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.
    */
  var GlobalTableBillingMode: js.UndefOr[BillingMode] = js.undefined
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.undefined
  /**
    * The name of the global table
    */
  var GlobalTableName: TableName
  /**
    * Auto scaling settings for managing provisioned write capacity for the global table.
    */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
    */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * Represents the settings for a global table in a Region that will be modified.
    */
  var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.undefined
}

object UpdateGlobalTableSettingsInput {
  @scala.inline
  def apply(
    GlobalTableName: TableName,
    GlobalTableBillingMode: BillingMode = null,
    GlobalTableGlobalSecondaryIndexSettingsUpdate: GlobalTableGlobalSecondaryIndexSettingsUpdateList = null,
    GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    ReplicaSettingsUpdate: ReplicaSettingsUpdateList = null
  ): UpdateGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName)
    if (GlobalTableBillingMode != null) __obj.updateDynamic("GlobalTableBillingMode")(GlobalTableBillingMode.asInstanceOf[js.Any])
    if (GlobalTableGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(GlobalTableGlobalSecondaryIndexSettingsUpdate)
    if (GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate")(GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate)
    if (!js.isUndefined(GlobalTableProvisionedWriteCapacityUnits)) __obj.updateDynamic("GlobalTableProvisionedWriteCapacityUnits")(GlobalTableProvisionedWriteCapacityUnits)
    if (ReplicaSettingsUpdate != null) __obj.updateDynamic("ReplicaSettingsUpdate")(ReplicaSettingsUpdate)
    __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
  }
}

