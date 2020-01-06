package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostReservationPurchasePreviewRequest extends js.Object {
  /**
    * The IDs of the Dedicated Hosts with which the reservation is associated.
    */
  var HostIdSet: RequestHostIdSet = js.native
  /**
    * The offering ID of the reservation.
    */
  var OfferingId: typings.awsDashSdk.clientsEc2Mod.OfferingId = js.native
}

object GetHostReservationPurchasePreviewRequest {
  @scala.inline
  def apply(HostIdSet: RequestHostIdSet, OfferingId: OfferingId): GetHostReservationPurchasePreviewRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHostReservationPurchasePreviewRequest]
  }
}

