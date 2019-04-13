package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostReservation extends js.Object {
  /**
    * The number of Dedicated Hosts the reservation is associated with.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * The currency in which the upfrontPrice and hourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  /**
    * The length of the reservation's term, specified in seconds. Can be 31536000 (1 year) | 94608000 (3 years).
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The date and time that the reservation ends.
    */
  var End: js.UndefOr[DateTime] = js.undefined
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined
  /**
    * The ID of the reservation that specifies the associated Dedicated Hosts.
    */
  var HostReservationId: js.UndefOr[String] = js.undefined
  /**
    * The hourly price of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  /**
    * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same in order for it to benefit from the reservation.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  /**
    * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
    */
  var OfferingId: js.UndefOr[String] = js.undefined
  /**
    * The payment option selected for this reservation.
    */
  var PaymentOption: js.UndefOr[PaymentOption] = js.undefined
  /**
    * The date and time that the reservation started.
    */
  var Start: js.UndefOr[DateTime] = js.undefined
  /**
    * The state of the reservation.
    */
  var State: js.UndefOr[ReservationState] = js.undefined
  /**
    * Any tags assigned to the Dedicated Host Reservation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.undefined
}

object HostReservation {
  @scala.inline
  def apply(
    Count: js.UndefOr[Integer] = js.undefined,
    CurrencyCode: CurrencyCodeValues = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    End: DateTime = null,
    HostIdSet: ResponseHostIdSet = null,
    HostReservationId: String = null,
    HourlyPrice: String = null,
    InstanceFamily: String = null,
    OfferingId: String = null,
    PaymentOption: PaymentOption = null,
    Start: DateTime = null,
    State: ReservationState = null,
    Tags: TagList = null,
    UpfrontPrice: String = null
  ): HostReservation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (End != null) __obj.updateDynamic("End")(End)
    if (HostIdSet != null) __obj.updateDynamic("HostIdSet")(HostIdSet)
    if (HostReservationId != null) __obj.updateDynamic("HostReservationId")(HostReservationId)
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice)
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily)
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId)
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UpfrontPrice != null) __obj.updateDynamic("UpfrontPrice")(UpfrontPrice)
    __obj.asInstanceOf[HostReservation]
  }
}

