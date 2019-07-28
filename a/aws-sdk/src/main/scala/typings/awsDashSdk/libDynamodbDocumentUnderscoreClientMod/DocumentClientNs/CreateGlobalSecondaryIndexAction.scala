package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be created.
    */
  var IndexName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
  /**
    * The key schema for the global secondary index.
    */
  var KeySchema: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema
  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
  ] = js.undefined
}

object CreateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(
    IndexName: IndexName,
    KeySchema: KeySchema,
    Projection: Projection,
    ProvisionedThroughput: ProvisionedThroughput = null
  ): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName, KeySchema = KeySchema, Projection = Projection)
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput)
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
}

