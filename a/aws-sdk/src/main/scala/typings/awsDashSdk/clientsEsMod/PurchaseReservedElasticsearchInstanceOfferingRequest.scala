package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
  /**
    * The number of Elasticsearch instances to reserve.
    */
  var InstanceCount: js.UndefOr[typings.awsDashSdk.clientsEsMod.InstanceCount] = js.native
  /**
    * A customer-specified identifier to track this reservation.
    */
  var ReservationName: ReservationToken = js.native
  /**
    * The ID of the reserved Elasticsearch instance offering to purchase.
    */
  var ReservedElasticsearchInstanceOfferingId: GUID = js.native
}

object PurchaseReservedElasticsearchInstanceOfferingRequest {
  @scala.inline
  def apply(
    ReservationName: ReservationToken,
    ReservedElasticsearchInstanceOfferingId: GUID,
    InstanceCount: Int | scala.Double = null
  ): PurchaseReservedElasticsearchInstanceOfferingRequest = {
    val __obj = js.Dynamic.literal(ReservationName = ReservationName.asInstanceOf[js.Any], ReservedElasticsearchInstanceOfferingId = ReservedElasticsearchInstanceOfferingId.asInstanceOf[js.Any])
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingRequest]
  }
}

