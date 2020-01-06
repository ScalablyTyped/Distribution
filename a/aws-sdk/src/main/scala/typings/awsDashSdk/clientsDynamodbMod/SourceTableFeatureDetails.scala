package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTableFeatureDetails extends js.Object {
  /**
    * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection, and ProvisionedThroughput for the GSIs on the table at the time of backup. 
    */
  var GlobalSecondaryIndexes: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.GlobalSecondaryIndexes] = js.native
  /**
    * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
    */
  var LocalSecondaryIndexes: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.LocalSecondaryIndexes] = js.native
  /**
    * The description of the server-side encryption status on the table when the backup was created.
    */
  var SSEDescription: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.SSEDescription] = js.native
  /**
    * Stream settings on the table when the backup was created.
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.native
  /**
    * Time to Live settings on the table when the backup was created.
    */
  var TimeToLiveDescription: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TimeToLiveDescription] = js.native
}

object SourceTableFeatureDetails {
  @scala.inline
  def apply(
    GlobalSecondaryIndexes: GlobalSecondaryIndexes = null,
    LocalSecondaryIndexes: LocalSecondaryIndexes = null,
    SSEDescription: SSEDescription = null,
    StreamDescription: StreamSpecification = null,
    TimeToLiveDescription: TimeToLiveDescription = null
  ): SourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (StreamDescription != null) __obj.updateDynamic("StreamDescription")(StreamDescription.asInstanceOf[js.Any])
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableFeatureDetails]
  }
}

