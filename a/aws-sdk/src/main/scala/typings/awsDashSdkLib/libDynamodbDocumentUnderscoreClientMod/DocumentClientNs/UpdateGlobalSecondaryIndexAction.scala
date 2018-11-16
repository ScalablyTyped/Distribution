package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateGlobalSecondaryIndexAction extends js.Object {
  /**
       * The name of the global secondary index to be updated.
       */
  var IndexName: IndexName
  /**
       * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
       */
  var ProvisionedThroughput: ProvisionedThroughput
}

