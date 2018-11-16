package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateGlobalTableSettingsInput extends js.Object {
  /**
       * Represents the settings of a global secondary index for a global table that will be modified.
       */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.undefined
  /**
       * The name of the global table
       */
  var GlobalTableName: TableName
  /**
       * AutoScaling settings for managing provisioned write capacity for the global table.
       */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
       * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
       */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
       * Represents the settings for a global table in a region that will be modified.
       */
  var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.undefined
}

