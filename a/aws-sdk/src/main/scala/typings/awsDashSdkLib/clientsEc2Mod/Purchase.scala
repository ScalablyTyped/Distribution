package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Purchase extends js.Object {
  /**
    * The currency in which the UpfrontPrice and HourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  /**
    * The duration of the reservation's term in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined
  /**
    * The ID of the reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.undefined
  /**
    * The hourly price of the reservation per hour.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  /**
    * The instance family on the Dedicated Host that the reservation can be associated with.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  /**
    * The payment option for the reservation.
    */
  var PaymentOption: js.UndefOr[PaymentOption] = js.undefined
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.undefined
}

object Purchase {
  @scala.inline
  def apply(
    CurrencyCode: CurrencyCodeValues = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    HostIdSet: ResponseHostIdSet = null,
    HostReservationId: String = null,
    HourlyPrice: String = null,
    InstanceFamily: String = null,
    PaymentOption: PaymentOption = null,
    UpfrontPrice: String = null
  ): Purchase = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (HostIdSet != null) __obj.updateDynamic("HostIdSet")(HostIdSet)
    if (HostReservationId != null) __obj.updateDynamic("HostReservationId")(HostReservationId)
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice)
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily)
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (UpfrontPrice != null) __obj.updateDynamic("UpfrontPrice")(UpfrontPrice)
    __obj.asInstanceOf[Purchase]
  }
}

