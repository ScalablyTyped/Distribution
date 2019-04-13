package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedInstancesListingsResult extends js.Object {
  /**
    * Information about the Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined
}

object DescribeReservedInstancesListingsResult {
  @scala.inline
  def apply(ReservedInstancesListings: ReservedInstancesListingList = null): DescribeReservedInstancesListingsResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesListings != null) __obj.updateDynamic("ReservedInstancesListings")(ReservedInstancesListings)
    __obj.asInstanceOf[DescribeReservedInstancesListingsResult]
  }
}

