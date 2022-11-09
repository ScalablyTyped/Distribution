package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemVersionsFilter extends StObject {
  
  /**
    * The billing period range in which the custom line item version is applied.
    */
  var BillingPeriodRange: js.UndefOr[ListCustomLineItemVersionsBillingPeriodRangeFilter] = js.undefined
}
object ListCustomLineItemVersionsFilter {
  
  inline def apply(): ListCustomLineItemVersionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomLineItemVersionsFilter]
  }
  
  extension [Self <: ListCustomLineItemVersionsFilter](x: Self) {
    
    inline def setBillingPeriodRange(value: ListCustomLineItemVersionsBillingPeriodRangeFilter): Self = StObject.set(x, "BillingPeriodRange", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRangeUndefined: Self = StObject.set(x, "BillingPeriodRange", js.undefined)
  }
}
