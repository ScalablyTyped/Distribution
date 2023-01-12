package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemFlatChargeDetails extends StObject {
  
  /**
    *  The custom line item's fixed charge value in USD. 
    */
  var ChargeValue: CustomLineItemChargeValue
}
object ListCustomLineItemFlatChargeDetails {
  
  inline def apply(ChargeValue: CustomLineItemChargeValue): ListCustomLineItemFlatChargeDetails = {
    val __obj = js.Dynamic.literal(ChargeValue = ChargeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomLineItemFlatChargeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomLineItemFlatChargeDetails] (val x: Self) extends AnyVal {
    
    inline def setChargeValue(value: CustomLineItemChargeValue): Self = StObject.set(x, "ChargeValue", value.asInstanceOf[js.Any])
  }
}
