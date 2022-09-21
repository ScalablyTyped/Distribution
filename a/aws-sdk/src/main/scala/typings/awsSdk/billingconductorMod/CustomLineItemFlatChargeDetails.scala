package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLineItemFlatChargeDetails extends StObject {
  
  /**
    *  The custom line item's fixed charge value in USD. 
    */
  var ChargeValue: CustomLineItemChargeValue
}
object CustomLineItemFlatChargeDetails {
  
  inline def apply(ChargeValue: CustomLineItemChargeValue): CustomLineItemFlatChargeDetails = {
    val __obj = js.Dynamic.literal(ChargeValue = ChargeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLineItemFlatChargeDetails]
  }
  
  extension [Self <: CustomLineItemFlatChargeDetails](x: Self) {
    
    inline def setChargeValue(value: CustomLineItemChargeValue): Self = StObject.set(x, "ChargeValue", value.asInstanceOf[js.Any])
  }
}
