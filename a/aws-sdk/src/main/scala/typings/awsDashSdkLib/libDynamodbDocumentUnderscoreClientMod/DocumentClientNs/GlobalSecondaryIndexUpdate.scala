package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalSecondaryIndexUpdate extends js.Object {
  /**
    * The parameters required for creating a global secondary index on an existing table:    IndexName      KeySchema      AttributeDefinitions      Projection      ProvisionedThroughput    
    */
  var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined
  /**
    * The name of an existing global secondary index to be removed.
    */
  var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined
  /**
    * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.
    */
  var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined
}

