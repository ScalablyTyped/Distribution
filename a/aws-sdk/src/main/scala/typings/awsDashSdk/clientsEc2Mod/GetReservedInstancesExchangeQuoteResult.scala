package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservedInstancesExchangeQuoteResult extends js.Object {
  /**
    * The currency of the transaction.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * If true, the exchange is valid. If false, the exchange cannot be completed.
    */
  var IsValidExchange: js.UndefOr[Boolean] = js.native
  /**
    * The new end date of the reservation term.
    */
  var OutputReservedInstancesWillExpireAt: js.UndefOr[DateTime] = js.native
  /**
    * The total true upfront charge for the exchange.
    */
  var PaymentDue: js.UndefOr[String] = js.native
  /**
    * The cost associated with the Reserved Instance.
    */
  var ReservedInstanceValueRollup: js.UndefOr[ReservationValue] = js.native
  /**
    * The configuration of your Convertible Reserved Instances.
    */
  var ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet] = js.native
  /**
    * The cost associated with the Reserved Instance.
    */
  var TargetConfigurationValueRollup: js.UndefOr[ReservationValue] = js.native
  /**
    * The values of the target Convertible Reserved Instances.
    */
  var TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet] = js.native
  /**
    * Describes the reason why the exchange cannot be completed.
    */
  var ValidationFailureReason: js.UndefOr[String] = js.native
}

object GetReservedInstancesExchangeQuoteResult {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    IsValidExchange: js.UndefOr[scala.Boolean] = js.undefined,
    OutputReservedInstancesWillExpireAt: DateTime = null,
    PaymentDue: String = null,
    ReservedInstanceValueRollup: ReservationValue = null,
    ReservedInstanceValueSet: ReservedInstanceReservationValueSet = null,
    TargetConfigurationValueRollup: ReservationValue = null,
    TargetConfigurationValueSet: TargetReservationValueSet = null,
    ValidationFailureReason: String = null
  ): GetReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(IsValidExchange)) __obj.updateDynamic("IsValidExchange")(IsValidExchange.asInstanceOf[js.Any])
    if (OutputReservedInstancesWillExpireAt != null) __obj.updateDynamic("OutputReservedInstancesWillExpireAt")(OutputReservedInstancesWillExpireAt.asInstanceOf[js.Any])
    if (PaymentDue != null) __obj.updateDynamic("PaymentDue")(PaymentDue.asInstanceOf[js.Any])
    if (ReservedInstanceValueRollup != null) __obj.updateDynamic("ReservedInstanceValueRollup")(ReservedInstanceValueRollup.asInstanceOf[js.Any])
    if (ReservedInstanceValueSet != null) __obj.updateDynamic("ReservedInstanceValueSet")(ReservedInstanceValueSet.asInstanceOf[js.Any])
    if (TargetConfigurationValueRollup != null) __obj.updateDynamic("TargetConfigurationValueRollup")(TargetConfigurationValueRollup.asInstanceOf[js.Any])
    if (TargetConfigurationValueSet != null) __obj.updateDynamic("TargetConfigurationValueSet")(TargetConfigurationValueSet.asInstanceOf[js.Any])
    if (ValidationFailureReason != null) __obj.updateDynamic("ValidationFailureReason")(ValidationFailureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedInstancesExchangeQuoteResult]
  }
}

