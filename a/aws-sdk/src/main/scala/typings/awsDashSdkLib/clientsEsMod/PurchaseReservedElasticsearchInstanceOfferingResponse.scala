package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
  /**
    * The customer-specified identifier used to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.undefined
  /**
    * Details of the reserved Elasticsearch instance which was purchased.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
}

object PurchaseReservedElasticsearchInstanceOfferingResponse {
  @scala.inline
  def apply(ReservationName: ReservationToken = null, ReservedElasticsearchInstanceId: GUID = null): PurchaseReservedElasticsearchInstanceOfferingResponse = {
    val __obj = js.Dynamic.literal()
    if (ReservationName != null) __obj.updateDynamic("ReservationName")(ReservationName)
    if (ReservedElasticsearchInstanceId != null) __obj.updateDynamic("ReservedElasticsearchInstanceId")(ReservedElasticsearchInstanceId)
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
  }
}

