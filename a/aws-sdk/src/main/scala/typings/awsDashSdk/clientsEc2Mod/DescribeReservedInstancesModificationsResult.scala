package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedInstancesModificationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The Reserved Instance modification information.
    */
  var ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList] = js.undefined
}

object DescribeReservedInstancesModificationsResult {
  @scala.inline
  def apply(NextToken: String = null, ReservedInstancesModifications: ReservedInstancesModificationList = null): DescribeReservedInstancesModificationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ReservedInstancesModifications != null) __obj.updateDynamic("ReservedInstancesModifications")(ReservedInstancesModifications)
    __obj.asInstanceOf[DescribeReservedInstancesModificationsResult]
  }
}

