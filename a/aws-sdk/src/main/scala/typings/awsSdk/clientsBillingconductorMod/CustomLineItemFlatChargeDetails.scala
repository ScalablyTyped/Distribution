package typings.awsSdk.clientsBillingconductorMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomLineItemFlatChargeDetails] (val x: Self) extends AnyVal {
    
    inline def setChargeValue(value: CustomLineItemChargeValue): Self = StObject.set(x, "ChargeValue", value.asInstanceOf[js.Any])
  }
}
