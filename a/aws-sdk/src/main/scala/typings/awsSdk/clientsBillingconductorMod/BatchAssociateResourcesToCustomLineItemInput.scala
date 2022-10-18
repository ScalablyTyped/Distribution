package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateResourcesToCustomLineItemInput extends StObject {
  
  var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
  
  /**
    *  A list containing the ARNs of the resources to be associated. 
    */
  var ResourceArns: CustomLineItemBatchAssociationsList
  
  /**
    *  A percentage custom line item ARN to associate the resources to. 
    */
  var TargetArn: CustomLineItemArn
}
object BatchAssociateResourcesToCustomLineItemInput {
  
  inline def apply(ResourceArns: CustomLineItemBatchAssociationsList, TargetArn: CustomLineItemArn): BatchAssociateResourcesToCustomLineItemInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateResourcesToCustomLineItemInput]
  }
  
  extension [Self <: BatchAssociateResourcesToCustomLineItemInput](x: Self) {
    
    inline def setBillingPeriodRange(value: CustomLineItemBillingPeriodRange): Self = StObject.set(x, "BillingPeriodRange", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRangeUndefined: Self = StObject.set(x, "BillingPeriodRange", js.undefined)
    
    inline def setResourceArns(value: CustomLineItemBatchAssociationsList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: CustomLineItemAssociationElement*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
    
    inline def setTargetArn(value: CustomLineItemArn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
