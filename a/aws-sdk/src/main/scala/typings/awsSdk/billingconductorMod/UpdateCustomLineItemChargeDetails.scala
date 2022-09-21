package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomLineItemChargeDetails extends StObject {
  
  /**
    *  An UpdateCustomLineItemFlatChargeDetails that describes the new charge details of a flat custom line item. 
    */
  var Flat: js.UndefOr[UpdateCustomLineItemFlatChargeDetails] = js.undefined
  
  /**
    *  An UpdateCustomLineItemPercentageChargeDetails that describes the new charge details of a percentage custom line item. 
    */
  var Percentage: js.UndefOr[UpdateCustomLineItemPercentageChargeDetails] = js.undefined
}
object UpdateCustomLineItemChargeDetails {
  
  inline def apply(): UpdateCustomLineItemChargeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomLineItemChargeDetails]
  }
  
  extension [Self <: UpdateCustomLineItemChargeDetails](x: Self) {
    
    inline def setFlat(value: UpdateCustomLineItemFlatChargeDetails): Self = StObject.set(x, "Flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "Flat", js.undefined)
    
    inline def setPercentage(value: UpdateCustomLineItemPercentageChargeDetails): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "Percentage", js.undefined)
  }
}
