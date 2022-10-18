package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemPercentageChargeDetails extends StObject {
  
  /**
    *  The custom line item's percentage value. This will be multiplied against the combined value of its associated resources to determine its charge value. 
    */
  var PercentageValue: CustomLineItemPercentageChargeValue
}
object ListCustomLineItemPercentageChargeDetails {
  
  inline def apply(PercentageValue: CustomLineItemPercentageChargeValue): ListCustomLineItemPercentageChargeDetails = {
    val __obj = js.Dynamic.literal(PercentageValue = PercentageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomLineItemPercentageChargeDetails]
  }
  
  extension [Self <: ListCustomLineItemPercentageChargeDetails](x: Self) {
    
    inline def setPercentageValue(value: CustomLineItemPercentageChargeValue): Self = StObject.set(x, "PercentageValue", value.asInstanceOf[js.Any])
  }
}
