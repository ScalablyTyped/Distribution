package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInventoryResult extends js.Object {
  /**
    * Collection of inventory entities such as a collection of instance inventory. 
    */
  var Entities: js.UndefOr[InventoryResultEntityList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object GetInventoryResult {
  @scala.inline
  def apply(Entities: InventoryResultEntityList = null, NextToken: NextToken = null): GetInventoryResult = {
    val __obj = js.Dynamic.literal()
    if (Entities != null) __obj.updateDynamic("Entities")(Entities)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetInventoryResult]
  }
}

