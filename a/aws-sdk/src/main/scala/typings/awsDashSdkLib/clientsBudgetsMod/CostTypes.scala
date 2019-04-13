package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CostTypes extends js.Object {
  /**
    * Specifies whether a budget includes credits. The default value is true.
    */
  var IncludeCredit: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes discounts. The default value is true.
    */
  var IncludeDiscount: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes non-RI subscription costs. The default value is true.
    */
  var IncludeOtherSubscription: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes recurring fees such as monthly RI fees. The default value is true.
    */
  var IncludeRecurring: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes refunds. The default value is true.
    */
  var IncludeRefund: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes subscriptions. The default value is true.
    */
  var IncludeSubscription: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes support subscription fees. The default value is true.
    */
  var IncludeSupport: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes taxes. The default value is true.
    */
  var IncludeTax: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget includes upfront RI costs. The default value is true.
    */
  var IncludeUpfront: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget uses the amortized rate. The default value is false.
    */
  var UseAmortized: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Specifies whether a budget uses a blended rate. The default value is false.
    */
  var UseBlended: js.UndefOr[NullableBoolean] = js.undefined
}

object CostTypes {
  @scala.inline
  def apply(
    IncludeCredit: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeDiscount: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeOtherSubscription: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeRecurring: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeRefund: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeSubscription: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeSupport: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeTax: js.UndefOr[NullableBoolean] = js.undefined,
    IncludeUpfront: js.UndefOr[NullableBoolean] = js.undefined,
    UseAmortized: js.UndefOr[NullableBoolean] = js.undefined,
    UseBlended: js.UndefOr[NullableBoolean] = js.undefined
  ): CostTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeCredit)) __obj.updateDynamic("IncludeCredit")(IncludeCredit)
    if (!js.isUndefined(IncludeDiscount)) __obj.updateDynamic("IncludeDiscount")(IncludeDiscount)
    if (!js.isUndefined(IncludeOtherSubscription)) __obj.updateDynamic("IncludeOtherSubscription")(IncludeOtherSubscription)
    if (!js.isUndefined(IncludeRecurring)) __obj.updateDynamic("IncludeRecurring")(IncludeRecurring)
    if (!js.isUndefined(IncludeRefund)) __obj.updateDynamic("IncludeRefund")(IncludeRefund)
    if (!js.isUndefined(IncludeSubscription)) __obj.updateDynamic("IncludeSubscription")(IncludeSubscription)
    if (!js.isUndefined(IncludeSupport)) __obj.updateDynamic("IncludeSupport")(IncludeSupport)
    if (!js.isUndefined(IncludeTax)) __obj.updateDynamic("IncludeTax")(IncludeTax)
    if (!js.isUndefined(IncludeUpfront)) __obj.updateDynamic("IncludeUpfront")(IncludeUpfront)
    if (!js.isUndefined(UseAmortized)) __obj.updateDynamic("UseAmortized")(UseAmortized)
    if (!js.isUndefined(UseBlended)) __obj.updateDynamic("UseBlended")(UseBlended)
    __obj.asInstanceOf[CostTypes]
  }
}

