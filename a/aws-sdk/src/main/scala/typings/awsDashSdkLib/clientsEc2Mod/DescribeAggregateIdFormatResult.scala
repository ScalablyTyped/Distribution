package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAggregateIdFormatResult extends js.Object {
  /**
    * Information about each resource's ID format.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.undefined
  /**
    * Indicates whether all resource types in the Region are configured to use longer IDs. This value is only true if all users are configured to use longer IDs for all resources types in the Region.
    */
  var UseLongIdsAggregated: js.UndefOr[Boolean] = js.undefined
}

object DescribeAggregateIdFormatResult {
  @scala.inline
  def apply(Statuses: IdFormatList = null, UseLongIdsAggregated: js.UndefOr[Boolean] = js.undefined): DescribeAggregateIdFormatResult = {
    val __obj = js.Dynamic.literal()
    if (Statuses != null) __obj.updateDynamic("Statuses")(Statuses)
    if (!js.isUndefined(UseLongIdsAggregated)) __obj.updateDynamic("UseLongIdsAggregated")(UseLongIdsAggregated)
    __obj.asInstanceOf[DescribeAggregateIdFormatResult]
  }
}

