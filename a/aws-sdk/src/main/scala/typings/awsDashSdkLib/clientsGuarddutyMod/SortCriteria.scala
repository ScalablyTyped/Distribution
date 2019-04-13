package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCriteria extends js.Object {
  /**
    * Represents the finding attribute (for example, accountId) by which to sort findings.
    */
  var AttributeName: js.UndefOr[__string] = js.undefined
  /**
    * Order by which the sorted findings are to be displayed.
    */
  var OrderBy: js.UndefOr[OrderBy] = js.undefined
}

object SortCriteria {
  @scala.inline
  def apply(AttributeName: __string = null, OrderBy: OrderBy = null): SortCriteria = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (OrderBy != null) __obj.updateDynamic("OrderBy")(OrderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriteria]
  }
}

