package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservedInstancesExchangeQuoteResult extends js.Object {
  /**
    * The currency of the transaction.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * If true, the exchange is valid. If false, the exchange cannot be completed.
    */
  var IsValidExchange: js.UndefOr[Boolean] = js.undefined
  /**
    * The new end date of the reservation term.
    */
  var OutputReservedInstancesWillExpireAt: js.UndefOr[DateTime] = js.undefined
  /**
    * The total true upfront charge for the exchange.
    */
  var PaymentDue: js.UndefOr[String] = js.undefined
  /**
    * The cost associated with the Reserved Instance.
    */
  var ReservedInstanceValueRollup: js.UndefOr[ReservationValue] = js.undefined
  /**
    * The configuration of your Convertible Reserved Instances.
    */
  var ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet] = js.undefined
  /**
    * The cost associated with the Reserved Instance.
    */
  var TargetConfigurationValueRollup: js.UndefOr[ReservationValue] = js.undefined
  /**
    * The values of the target Convertible Reserved Instances.
    */
  var TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet] = js.undefined
  /**
    * Describes the reason why the exchange cannot be completed.
    */
  var ValidationFailureReason: js.UndefOr[String] = js.undefined
}

object GetReservedInstancesExchangeQuoteResult {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    IsValidExchange: js.UndefOr[Boolean] = js.undefined,
    OutputReservedInstancesWillExpireAt: DateTime = null,
    PaymentDue: String = null,
    ReservedInstanceValueRollup: ReservationValue = null,
    ReservedInstanceValueSet: ReservedInstanceReservationValueSet = null,
    TargetConfigurationValueRollup: ReservationValue = null,
    TargetConfigurationValueSet: TargetReservationValueSet = null,
    ValidationFailureReason: String = null
  ): GetReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (!js.isUndefined(IsValidExchange)) __obj.updateDynamic("IsValidExchange")(IsValidExchange)
    if (OutputReservedInstancesWillExpireAt != null) __obj.updateDynamic("OutputReservedInstancesWillExpireAt")(OutputReservedInstancesWillExpireAt)
    if (PaymentDue != null) __obj.updateDynamic("PaymentDue")(PaymentDue)
    if (ReservedInstanceValueRollup != null) __obj.updateDynamic("ReservedInstanceValueRollup")(ReservedInstanceValueRollup)
    if (ReservedInstanceValueSet != null) __obj.updateDynamic("ReservedInstanceValueSet")(ReservedInstanceValueSet)
    if (TargetConfigurationValueRollup != null) __obj.updateDynamic("TargetConfigurationValueRollup")(TargetConfigurationValueRollup)
    if (TargetConfigurationValueSet != null) __obj.updateDynamic("TargetConfigurationValueSet")(TargetConfigurationValueSet)
    if (ValidationFailureReason != null) __obj.updateDynamic("ValidationFailureReason")(ValidationFailureReason)
    __obj.asInstanceOf[GetReservedInstancesExchangeQuoteResult]
  }
}

