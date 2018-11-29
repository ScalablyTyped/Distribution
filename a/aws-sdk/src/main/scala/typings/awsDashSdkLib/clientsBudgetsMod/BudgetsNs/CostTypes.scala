package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

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

