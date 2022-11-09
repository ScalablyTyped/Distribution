package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemVersionsBillingPeriodRangeFilter extends StObject {
  
  /**
    * The exclusive end billing period that defines a billing period range where a custom line item version is applied.
    */
  var EndBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined
  
  /**
    * The inclusive start billing period that defines a billing period range where a custom line item version is applied.
    */
  var StartBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined
}
object ListCustomLineItemVersionsBillingPeriodRangeFilter {
  
  inline def apply(): ListCustomLineItemVersionsBillingPeriodRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomLineItemVersionsBillingPeriodRangeFilter]
  }
  
  extension [Self <: ListCustomLineItemVersionsBillingPeriodRangeFilter](x: Self) {
    
    inline def setEndBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "EndBillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setEndBillingPeriodUndefined: Self = StObject.set(x, "EndBillingPeriod", js.undefined)
    
    inline def setStartBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "StartBillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setStartBillingPeriodUndefined: Self = StObject.set(x, "StartBillingPeriod", js.undefined)
  }
}
