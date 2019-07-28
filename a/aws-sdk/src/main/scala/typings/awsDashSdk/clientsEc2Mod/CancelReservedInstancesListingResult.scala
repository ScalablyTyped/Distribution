package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelReservedInstancesListingResult extends js.Object {
  /**
    * The Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined
}

object CancelReservedInstancesListingResult {
  @scala.inline
  def apply(ReservedInstancesListings: ReservedInstancesListingList = null): CancelReservedInstancesListingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesListings != null) __obj.updateDynamic("ReservedInstancesListings")(ReservedInstancesListings)
    __obj.asInstanceOf[CancelReservedInstancesListingResult]
  }
}

