package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInventoryDeletionsResult extends js.Object {
  /**
    * A list of status items for deleted inventory.
    */
  var InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.undefined
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeInventoryDeletionsResult {
  @scala.inline
  def apply(InventoryDeletions: InventoryDeletionsList = null, NextToken: NextToken = null): DescribeInventoryDeletionsResult = {
    val __obj = js.Dynamic.literal()
    if (InventoryDeletions != null) __obj.updateDynamic("InventoryDeletions")(InventoryDeletions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInventoryDeletionsResult]
  }
}

