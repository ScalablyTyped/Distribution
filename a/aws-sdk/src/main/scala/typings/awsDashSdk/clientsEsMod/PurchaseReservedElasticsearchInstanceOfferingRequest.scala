package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
  /**
    * The number of Elasticsearch instances to reserve.
    */
  var InstanceCount: js.UndefOr[typings.awsDashSdk.clientsEsMod.InstanceCount] = js.undefined
  /**
    * A customer-specified identifier to track this reservation.
    */
  var ReservationName: ReservationToken
  /**
    * The ID of the reserved Elasticsearch instance offering to purchase.
    */
  var ReservedElasticsearchInstanceOfferingId: GUID
}

object PurchaseReservedElasticsearchInstanceOfferingRequest {
  @scala.inline
  def apply(
    ReservationName: ReservationToken,
    ReservedElasticsearchInstanceOfferingId: GUID,
    InstanceCount: js.UndefOr[InstanceCount] = js.undefined
  ): PurchaseReservedElasticsearchInstanceOfferingRequest = {
    val __obj = js.Dynamic.literal(ReservationName = ReservationName, ReservedElasticsearchInstanceOfferingId = ReservedElasticsearchInstanceOfferingId)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingRequest]
  }
}

