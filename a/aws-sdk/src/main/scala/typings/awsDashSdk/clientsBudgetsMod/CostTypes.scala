package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostTypes extends js.Object {
  /**
    * Specifies whether a budget includes credits. The default value is true.
    */
  var IncludeCredit: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes discounts. The default value is true.
    */
  var IncludeDiscount: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes non-RI subscription costs. The default value is true.
    */
  var IncludeOtherSubscription: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes recurring fees such as monthly RI fees. The default value is true.
    */
  var IncludeRecurring: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes refunds. The default value is true.
    */
  var IncludeRefund: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes subscriptions. The default value is true.
    */
  var IncludeSubscription: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes support subscription fees. The default value is true.
    */
  var IncludeSupport: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes taxes. The default value is true.
    */
  var IncludeTax: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes upfront RI costs. The default value is true.
    */
  var IncludeUpfront: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget uses the amortized rate. The default value is false.
    */
  var UseAmortized: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget uses a blended rate. The default value is false.
    */
  var UseBlended: js.UndefOr[NullableBoolean] = js.native
}

object CostTypes {
  @scala.inline
  def apply(
    IncludeCredit: js.UndefOr[Boolean] = js.undefined,
    IncludeDiscount: js.UndefOr[Boolean] = js.undefined,
    IncludeOtherSubscription: js.UndefOr[Boolean] = js.undefined,
    IncludeRecurring: js.UndefOr[Boolean] = js.undefined,
    IncludeRefund: js.UndefOr[Boolean] = js.undefined,
    IncludeSubscription: js.UndefOr[Boolean] = js.undefined,
    IncludeSupport: js.UndefOr[Boolean] = js.undefined,
    IncludeTax: js.UndefOr[Boolean] = js.undefined,
    IncludeUpfront: js.UndefOr[Boolean] = js.undefined,
    UseAmortized: js.UndefOr[Boolean] = js.undefined,
    UseBlended: js.UndefOr[Boolean] = js.undefined
  ): CostTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeCredit)) __obj.updateDynamic("IncludeCredit")(IncludeCredit.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeDiscount)) __obj.updateDynamic("IncludeDiscount")(IncludeDiscount.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeOtherSubscription)) __obj.updateDynamic("IncludeOtherSubscription")(IncludeOtherSubscription.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeRecurring)) __obj.updateDynamic("IncludeRecurring")(IncludeRecurring.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeRefund)) __obj.updateDynamic("IncludeRefund")(IncludeRefund.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeSubscription)) __obj.updateDynamic("IncludeSubscription")(IncludeSubscription.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeSupport)) __obj.updateDynamic("IncludeSupport")(IncludeSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeTax)) __obj.updateDynamic("IncludeTax")(IncludeTax.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeUpfront)) __obj.updateDynamic("IncludeUpfront")(IncludeUpfront.asInstanceOf[js.Any])
    if (!js.isUndefined(UseAmortized)) __obj.updateDynamic("UseAmortized")(UseAmortized.asInstanceOf[js.Any])
    if (!js.isUndefined(UseBlended)) __obj.updateDynamic("UseBlended")(UseBlended.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostTypes]
  }
}

