package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  /**
       * The name of the global secondary index. The name must be unique among all other indexes on this table.
       */
  var IndexName: IndexName
  /**
       *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
       */
  var IndexStatus: js.UndefOr[IndexStatus] = js.undefined
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

