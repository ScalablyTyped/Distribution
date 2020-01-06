package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedInstancesOfferingsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of Reserved Instances offerings.
    */
  var ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList] = js.native
}

object DescribeReservedInstancesOfferingsResult {
  @scala.inline
  def apply(NextToken: String = null, ReservedInstancesOfferings: ReservedInstancesOfferingList = null): DescribeReservedInstancesOfferingsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ReservedInstancesOfferings != null) __obj.updateDynamic("ReservedInstancesOfferings")(ReservedInstancesOfferings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedInstancesOfferingsResult]
  }
}

