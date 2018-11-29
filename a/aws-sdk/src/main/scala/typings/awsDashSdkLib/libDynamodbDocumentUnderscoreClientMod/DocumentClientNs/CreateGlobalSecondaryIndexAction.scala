package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateGlobalSecondaryIndexAction extends js.Object {
  /**
       * The name of the global secondary index to be created.
       */
  var IndexName: IndexName
  /**
       * The key schema for the global secondary index.
       */
  var KeySchema: KeySchema
  /**
       * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
       */
  var Projection: Projection
  /**
       * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
       */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
}

