package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostReservationPurchasePreviewRequest extends js.Object {
  /**
    * The IDs of the Dedicated Hosts with which the reservation is associated.
    */
  var HostIdSet: RequestHostIdSet
  /**
    * The offering ID of the reservation.
    */
  var OfferingId: String
}

object GetHostReservationPurchasePreviewRequest {
  @scala.inline
  def apply(HostIdSet: RequestHostIdSet, OfferingId: String): GetHostReservationPurchasePreviewRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet, OfferingId = OfferingId)
  
    __obj.asInstanceOf[GetHostReservationPurchasePreviewRequest]
  }
}

