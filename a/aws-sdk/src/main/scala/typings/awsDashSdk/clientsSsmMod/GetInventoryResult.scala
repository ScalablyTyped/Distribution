package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventoryResult extends js.Object {
  /**
    * Collection of inventory entities such as a collection of instance inventory. 
    */
  var Entities: js.UndefOr[InventoryResultEntityList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object GetInventoryResult {
  @scala.inline
  def apply(Entities: InventoryResultEntityList = null, NextToken: NextToken = null): GetInventoryResult = {
    val __obj = js.Dynamic.literal()
    if (Entities != null) __obj.updateDynamic("Entities")(Entities.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInventoryResult]
  }
}

