package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostOffering extends js.Object {
  /**
    * The currency of the offering.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The duration of the offering (in seconds).
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The hourly price of the offering.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The instance family of the offering.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The ID of the offering.
    */
  var OfferingId: js.UndefOr[String] = js.native
  /**
    * The available payment option.
    */
  var PaymentOption: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.PaymentOption] = js.native
  /**
    * The upfront price of the offering. Does not apply to No Upfront offerings.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}

object HostOffering {
  @scala.inline
  def apply(
    CurrencyCode: CurrencyCodeValues = null,
    Duration: Int | scala.Double = null,
    HourlyPrice: String = null,
    InstanceFamily: String = null,
    OfferingId: String = null,
    PaymentOption: PaymentOption = null,
    UpfrontPrice: String = null
  ): HostOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (UpfrontPrice != null) __obj.updateDynamic("UpfrontPrice")(UpfrontPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostOffering]
  }
}

