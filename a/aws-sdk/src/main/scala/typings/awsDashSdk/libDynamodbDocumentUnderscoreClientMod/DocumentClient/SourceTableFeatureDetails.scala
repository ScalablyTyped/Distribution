package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTableFeatureDetails extends js.Object {
  /**
    * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. 
    */
  var GlobalSecondaryIndexes: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.GlobalSecondaryIndexes
  ] = js.undefined
  /**
    * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
    */
  var LocalSecondaryIndexes: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.LocalSecondaryIndexes
  ] = js.undefined
  /**
    * The description of the server-side encryption status on the table when the backup was created.
    */
  var SSEDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.SSEDescription
  ] = js.undefined
  /**
    * Stream settings on the table when the backup was created.
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
  /**
    * Time to Live settings on the table when the backup was created.
    */
  var TimeToLiveDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TimeToLiveDescription
  ] = js.undefined
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
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes)
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes)
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription)
    if (StreamDescription != null) __obj.updateDynamic("StreamDescription")(StreamDescription)
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription)
    __obj.asInstanceOf[SourceTableFeatureDetails]
  }
}

