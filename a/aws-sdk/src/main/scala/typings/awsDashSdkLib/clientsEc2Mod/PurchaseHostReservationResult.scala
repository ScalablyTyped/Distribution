package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseHostReservationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see How to Ensure Idempotency in the Amazon Elastic Compute Cloud User Guide.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  /**
    * Describes the details of the purchase.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.undefined
  /**
    * The total hourly price of the reservation calculated per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.undefined
  /**
    * The total amount charged to your account when you purchase the reservation.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.undefined
}

object PurchaseHostReservationResult {
  @scala.inline
  def apply(
    ClientToken: String = null,
    CurrencyCode: CurrencyCodeValues = null,
    Purchase: PurchaseSet = null,
    TotalHourlyPrice: String = null,
    TotalUpfrontPrice: String = null
  ): PurchaseHostReservationResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Purchase != null) __obj.updateDynamic("Purchase")(Purchase)
    if (TotalHourlyPrice != null) __obj.updateDynamic("TotalHourlyPrice")(TotalHourlyPrice)
    if (TotalUpfrontPrice != null) __obj.updateDynamic("TotalUpfrontPrice")(TotalUpfrontPrice)
    __obj.asInstanceOf[PurchaseHostReservationResult]
  }
}

