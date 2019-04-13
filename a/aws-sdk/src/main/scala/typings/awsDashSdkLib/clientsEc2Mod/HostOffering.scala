package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostOffering extends js.Object {
  /**
    * The currency of the offering.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  /**
    * The duration of the offering (in seconds).
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The hourly price of the offering.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  /**
    * The instance family of the offering.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  /**
    * The ID of the offering.
    */
  var OfferingId: js.UndefOr[String] = js.undefined
  /**
    * The available payment option.
    */
  var PaymentOption: js.UndefOr[PaymentOption] = js.undefined
  /**
    * The upfront price of the offering. Does not apply to No Upfront offerings.
    */
  var UpfrontPrice: js.UndefOr[String] = js.undefined
}

object HostOffering {
  @scala.inline
  def apply(
    CurrencyCode: CurrencyCodeValues = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    HourlyPrice: String = null,
    InstanceFamily: String = null,
    OfferingId: String = null,
    PaymentOption: PaymentOption = null,
    UpfrontPrice: String = null
  ): HostOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice)
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily)
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId)
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (UpfrontPrice != null) __obj.updateDynamic("UpfrontPrice")(UpfrontPrice)
    __obj.asInstanceOf[HostOffering]
  }
}

