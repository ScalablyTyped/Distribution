package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseHostReservationRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see How to Ensure Idempotency in the Amazon Elastic Compute Cloud User Guide.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The currency in which the totalUpfrontPrice, LimitPrice, and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  /**
    * The IDs of the Dedicated Hosts with which the reservation will be associated.
    */
  var HostIdSet: RequestHostIdSet
  /**
    * The specified limit is checked against the total upfront cost of the reservation (calculated as the offering's upfront cost multiplied by the host count). If the total upfront cost is greater than the specified price limit, the request fails. This is used to ensure that the purchase does not exceed the expected upfront cost of the purchase. At this time, the only supported currency is USD. For example, to indicate a limit price of USD 100, specify 100.00.
    */
  var LimitPrice: js.UndefOr[String] = js.undefined
  /**
    * The ID of the offering.
    */
  var OfferingId: String
}

object PurchaseHostReservationRequest {
  @scala.inline
  def apply(
    HostIdSet: RequestHostIdSet,
    OfferingId: String,
    ClientToken: String = null,
    CurrencyCode: CurrencyCodeValues = null,
    LimitPrice: String = null
  ): PurchaseHostReservationRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet, OfferingId = OfferingId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (LimitPrice != null) __obj.updateDynamic("LimitPrice")(LimitPrice)
    __obj.asInstanceOf[PurchaseHostReservationRequest]
  }
}

