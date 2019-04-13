package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedInstancesOfferingsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of Reserved Instances offerings.
    */
  var ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList] = js.undefined
}

object DescribeReservedInstancesOfferingsResult {
  @scala.inline
  def apply(NextToken: String = null, ReservedInstancesOfferings: ReservedInstancesOfferingList = null): DescribeReservedInstancesOfferingsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ReservedInstancesOfferings != null) __obj.updateDynamic("ReservedInstancesOfferings")(ReservedInstancesOfferings)
    __obj.asInstanceOf[DescribeReservedInstancesOfferingsResult]
  }
}

