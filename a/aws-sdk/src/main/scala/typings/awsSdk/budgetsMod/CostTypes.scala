package typings.awsSdk.budgetsMod

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
  def apply(): CostTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostTypes]
  }
  @scala.inline
  implicit class CostTypesOps[Self <: CostTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIncludeCredit(value: NullableBoolean): Self = this.set("IncludeCredit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCredit: Self = this.set("IncludeCredit", js.undefined)
    @scala.inline
    def setIncludeDiscount(value: NullableBoolean): Self = this.set("IncludeDiscount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDiscount: Self = this.set("IncludeDiscount", js.undefined)
    @scala.inline
    def setIncludeOtherSubscription(value: NullableBoolean): Self = this.set("IncludeOtherSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeOtherSubscription: Self = this.set("IncludeOtherSubscription", js.undefined)
    @scala.inline
    def setIncludeRecurring(value: NullableBoolean): Self = this.set("IncludeRecurring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRecurring: Self = this.set("IncludeRecurring", js.undefined)
    @scala.inline
    def setIncludeRefund(value: NullableBoolean): Self = this.set("IncludeRefund", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRefund: Self = this.set("IncludeRefund", js.undefined)
    @scala.inline
    def setIncludeSubscription(value: NullableBoolean): Self = this.set("IncludeSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSubscription: Self = this.set("IncludeSubscription", js.undefined)
    @scala.inline
    def setIncludeSupport(value: NullableBoolean): Self = this.set("IncludeSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSupport: Self = this.set("IncludeSupport", js.undefined)
    @scala.inline
    def setIncludeTax(value: NullableBoolean): Self = this.set("IncludeTax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTax: Self = this.set("IncludeTax", js.undefined)
    @scala.inline
    def setIncludeUpfront(value: NullableBoolean): Self = this.set("IncludeUpfront", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUpfront: Self = this.set("IncludeUpfront", js.undefined)
    @scala.inline
    def setUseAmortized(value: NullableBoolean): Self = this.set("UseAmortized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAmortized: Self = this.set("UseAmortized", js.undefined)
    @scala.inline
    def setUseBlended(value: NullableBoolean): Self = this.set("UseBlended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBlended: Self = this.set("UseBlended", js.undefined)
  }
  
}

