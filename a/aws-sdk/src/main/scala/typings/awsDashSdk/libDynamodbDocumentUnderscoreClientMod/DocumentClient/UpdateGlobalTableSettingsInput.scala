package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalTableSettingsInput extends js.Object {
  /**
    * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
    */
  var GlobalTableBillingMode: js.UndefOr[BillingMode] = js.native
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.native
  /**
    * The name of the global table
    */
  var GlobalTableName: TableName = js.native
  /**
    * Auto scaling settings for managing provisioned write capacity for the global table.
    */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
    */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Represents the settings for a global table in a Region that will be modified.
    */
  var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.native
}

object UpdateGlobalTableSettingsInput {
  @scala.inline
  def apply(
    GlobalTableName: TableName,
    GlobalTableBillingMode: BillingMode = null,
    GlobalTableGlobalSecondaryIndexSettingsUpdate: GlobalTableGlobalSecondaryIndexSettingsUpdateList = null,
    GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    GlobalTableProvisionedWriteCapacityUnits: Int | scala.Double = null,
    ReplicaSettingsUpdate: ReplicaSettingsUpdateList = null
  ): UpdateGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    if (GlobalTableBillingMode != null) __obj.updateDynamic("GlobalTableBillingMode")(GlobalTableBillingMode.asInstanceOf[js.Any])
    if (GlobalTableGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(GlobalTableGlobalSecondaryIndexSettingsUpdate.asInstanceOf[js.Any])
    if (GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate")(GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (GlobalTableProvisionedWriteCapacityUnits != null) __obj.updateDynamic("GlobalTableProvisionedWriteCapacityUnits")(GlobalTableProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    if (ReplicaSettingsUpdate != null) __obj.updateDynamic("ReplicaSettingsUpdate")(ReplicaSettingsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
  }
}

