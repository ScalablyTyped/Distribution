package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomLineItemInput extends StObject {
  
  /**
    *  The ARN of the custom line item to be deleted. 
    */
  var Arn: CustomLineItemArn
  
  var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
}
object DeleteCustomLineItemInput {
  
  inline def apply(Arn: CustomLineItemArn): DeleteCustomLineItemInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomLineItemInput]
  }
  
  extension [Self <: DeleteCustomLineItemInput](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRange(value: CustomLineItemBillingPeriodRange): Self = StObject.set(x, "BillingPeriodRange", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRangeUndefined: Self = StObject.set(x, "BillingPeriodRange", js.undefined)
  }
}
