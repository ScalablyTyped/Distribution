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

object GlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(
    Create: CreateGlobalSecondaryIndexAction = null,
    Delete: DeleteGlobalSecondaryIndexAction = null,
    Update: UpdateGlobalSecondaryIndexAction = null
  ): GlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create)
    if (Delete != null) __obj.updateDynamic("Delete")(Delete)
    if (Update != null) __obj.updateDynamic("Update")(Update)
    __obj.asInstanceOf[GlobalSecondaryIndexUpdate]
  }
}

