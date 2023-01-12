package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostTypes extends StObject {
  
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
  
  inline def apply(): CostTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CostTypes] (val x: Self) extends AnyVal {
    
    inline def setIncludeCredit(value: NullableBoolean): Self = StObject.set(x, "IncludeCredit", value.asInstanceOf[js.Any])
    
    inline def setIncludeCreditUndefined: Self = StObject.set(x, "IncludeCredit", js.undefined)
    
    inline def setIncludeDiscount(value: NullableBoolean): Self = StObject.set(x, "IncludeDiscount", value.asInstanceOf[js.Any])
    
    inline def setIncludeDiscountUndefined: Self = StObject.set(x, "IncludeDiscount", js.undefined)
    
    inline def setIncludeOtherSubscription(value: NullableBoolean): Self = StObject.set(x, "IncludeOtherSubscription", value.asInstanceOf[js.Any])
    
    inline def setIncludeOtherSubscriptionUndefined: Self = StObject.set(x, "IncludeOtherSubscription", js.undefined)
    
    inline def setIncludeRecurring(value: NullableBoolean): Self = StObject.set(x, "IncludeRecurring", value.asInstanceOf[js.Any])
    
    inline def setIncludeRecurringUndefined: Self = StObject.set(x, "IncludeRecurring", js.undefined)
    
    inline def setIncludeRefund(value: NullableBoolean): Self = StObject.set(x, "IncludeRefund", value.asInstanceOf[js.Any])
    
    inline def setIncludeRefundUndefined: Self = StObject.set(x, "IncludeRefund", js.undefined)
    
    inline def setIncludeSubscription(value: NullableBoolean): Self = StObject.set(x, "IncludeSubscription", value.asInstanceOf[js.Any])
    
    inline def setIncludeSubscriptionUndefined: Self = StObject.set(x, "IncludeSubscription", js.undefined)
    
    inline def setIncludeSupport(value: NullableBoolean): Self = StObject.set(x, "IncludeSupport", value.asInstanceOf[js.Any])
    
    inline def setIncludeSupportUndefined: Self = StObject.set(x, "IncludeSupport", js.undefined)
    
    inline def setIncludeTax(value: NullableBoolean): Self = StObject.set(x, "IncludeTax", value.asInstanceOf[js.Any])
    
    inline def setIncludeTaxUndefined: Self = StObject.set(x, "IncludeTax", js.undefined)
    
    inline def setIncludeUpfront(value: NullableBoolean): Self = StObject.set(x, "IncludeUpfront", value.asInstanceOf[js.Any])
    
    inline def setIncludeUpfrontUndefined: Self = StObject.set(x, "IncludeUpfront", js.undefined)
    
    inline def setUseAmortized(value: NullableBoolean): Self = StObject.set(x, "UseAmortized", value.asInstanceOf[js.Any])
    
    inline def setUseAmortizedUndefined: Self = StObject.set(x, "UseAmortized", js.undefined)
    
    inline def setUseBlended(value: NullableBoolean): Self = StObject.set(x, "UseBlended", value.asInstanceOf[js.Any])
    
    inline def setUseBlendedUndefined: Self = StObject.set(x, "UseBlended", js.undefined)
  }
}
