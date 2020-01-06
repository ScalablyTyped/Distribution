package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCriteria extends js.Object {
  /**
    * Represents the finding attribute (for example, accountId) by which to sort findings.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * Order by which the sorted findings are to be displayed.
    */
  var OrderBy: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.OrderBy] = js.native
}

object SortCriteria {
  @scala.inline
  def apply(AttributeName: String = null, OrderBy: OrderBy = null): SortCriteria = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (OrderBy != null) __obj.updateDynamic("OrderBy")(OrderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriteria]
  }
}

