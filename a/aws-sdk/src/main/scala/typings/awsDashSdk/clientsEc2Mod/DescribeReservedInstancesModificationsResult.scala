package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedInstancesModificationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The Reserved Instance modification information.
    */
  var ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList] = js.native
}

object DescribeReservedInstancesModificationsResult {
  @scala.inline
  def apply(NextToken: String = null, ReservedInstancesModifications: ReservedInstancesModificationList = null): DescribeReservedInstancesModificationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ReservedInstancesModifications != null) __obj.updateDynamic("ReservedInstancesModifications")(ReservedInstancesModifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedInstancesModificationsResult]
  }
}

