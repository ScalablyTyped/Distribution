package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelReservedInstancesListingRequest extends js.Object {
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: String
}

object CancelReservedInstancesListingRequest {
  @scala.inline
  def apply(ReservedInstancesListingId: String): CancelReservedInstancesListingRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesListingId = ReservedInstancesListingId)
  
    __obj.asInstanceOf[CancelReservedInstancesListingRequest]
  }
}

