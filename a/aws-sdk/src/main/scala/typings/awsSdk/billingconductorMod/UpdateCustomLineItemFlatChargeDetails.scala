package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomLineItemFlatChargeDetails extends StObject {
  
  /**
    *  The custom line item's new fixed charge value in USD. 
    */
  var ChargeValue: CustomLineItemChargeValue
}
object UpdateCustomLineItemFlatChargeDetails {
  
  inline def apply(ChargeValue: CustomLineItemChargeValue): UpdateCustomLineItemFlatChargeDetails = {
    val __obj = js.Dynamic.literal(ChargeValue = ChargeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomLineItemFlatChargeDetails]
  }
  
  extension [Self <: UpdateCustomLineItemFlatChargeDetails](x: Self) {
    
    inline def setChargeValue(value: CustomLineItemChargeValue): Self = StObject.set(x, "ChargeValue", value.asInstanceOf[js.Any])
  }
}
