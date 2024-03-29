package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomLineItemPercentageChargeDetails extends StObject {
  
  /**
    *  The custom line item's new percentage value. This will be multiplied against the combined value of its associated resources to determine its charge value. 
    */
  var PercentageValue: CustomLineItemPercentageChargeValue
}
object UpdateCustomLineItemPercentageChargeDetails {
  
  inline def apply(PercentageValue: CustomLineItemPercentageChargeValue): UpdateCustomLineItemPercentageChargeDetails = {
    val __obj = js.Dynamic.literal(PercentageValue = PercentageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomLineItemPercentageChargeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomLineItemPercentageChargeDetails] (val x: Self) extends AnyVal {
    
    inline def setPercentageValue(value: CustomLineItemPercentageChargeValue): Self = StObject.set(x, "PercentageValue", value.asInstanceOf[js.Any])
  }
}
