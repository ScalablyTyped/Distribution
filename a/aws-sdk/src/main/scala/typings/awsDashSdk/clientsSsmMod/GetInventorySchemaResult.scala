package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInventorySchemaResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Inventory schemas returned by the request.
    */
  var Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined
}

object GetInventorySchemaResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Schemas: InventoryItemSchemaResultList = null): GetInventorySchemaResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas)
    __obj.asInstanceOf[GetInventorySchemaResult]
  }
}

