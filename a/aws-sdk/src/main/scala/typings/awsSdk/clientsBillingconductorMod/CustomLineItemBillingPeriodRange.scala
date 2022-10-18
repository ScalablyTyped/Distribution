package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLineItemBillingPeriodRange extends StObject {
  
  /**
    *  The inclusive end billing period that defines a billing period range where a custom line is applied. 
    */
  var ExclusiveEndBillingPeriod: BillingPeriod
  
  /**
    *  The inclusive start billing period that defines a billing period range where a custom line is applied. 
    */
  var InclusiveStartBillingPeriod: BillingPeriod
}
object CustomLineItemBillingPeriodRange {
  
  inline def apply(ExclusiveEndBillingPeriod: BillingPeriod, InclusiveStartBillingPeriod: BillingPeriod): CustomLineItemBillingPeriodRange = {
    val __obj = js.Dynamic.literal(ExclusiveEndBillingPeriod = ExclusiveEndBillingPeriod.asInstanceOf[js.Any], InclusiveStartBillingPeriod = InclusiveStartBillingPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLineItemBillingPeriodRange]
  }
  
  extension [Self <: CustomLineItemBillingPeriodRange](x: Self) {
    
    inline def setExclusiveEndBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "ExclusiveEndBillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "InclusiveStartBillingPeriod", value.asInstanceOf[js.Any])
  }
}
