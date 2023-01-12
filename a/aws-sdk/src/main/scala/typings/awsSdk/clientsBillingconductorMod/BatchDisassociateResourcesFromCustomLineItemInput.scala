package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateResourcesFromCustomLineItemInput extends StObject {
  
  var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
  
  /**
    *  A list containing the ARNs of resources to be disassociated. 
    */
  var ResourceArns: CustomLineItemBatchDisassociationsList
  
  /**
    *  A percentage custom line item ARN to disassociate the resources from. 
    */
  var TargetArn: CustomLineItemArn
}
object BatchDisassociateResourcesFromCustomLineItemInput {
  
  inline def apply(ResourceArns: CustomLineItemBatchDisassociationsList, TargetArn: CustomLineItemArn): BatchDisassociateResourcesFromCustomLineItemInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateResourcesFromCustomLineItemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDisassociateResourcesFromCustomLineItemInput] (val x: Self) extends AnyVal {
    
    inline def setBillingPeriodRange(value: CustomLineItemBillingPeriodRange): Self = StObject.set(x, "BillingPeriodRange", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRangeUndefined: Self = StObject.set(x, "BillingPeriodRange", js.undefined)
    
    inline def setResourceArns(value: CustomLineItemBatchDisassociationsList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: CustomLineItemAssociationElement*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
    
    inline def setTargetArn(value: CustomLineItemArn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
