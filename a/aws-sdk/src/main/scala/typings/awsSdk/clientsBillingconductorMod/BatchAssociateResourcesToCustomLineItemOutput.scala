package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateResourcesToCustomLineItemOutput extends StObject {
  
  /**
    *  A list of AssociateResourceResponseElement for each resource that failed association to a percentage custom line item. 
    */
  var FailedAssociatedResources: js.UndefOr[AssociateResourcesResponseList] = js.undefined
  
  /**
    *  A list of AssociateResourceResponseElement for each resource that's been associated to a percentage custom line item successfully. 
    */
  var SuccessfullyAssociatedResources: js.UndefOr[AssociateResourcesResponseList] = js.undefined
}
object BatchAssociateResourcesToCustomLineItemOutput {
  
  inline def apply(): BatchAssociateResourcesToCustomLineItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateResourcesToCustomLineItemOutput]
  }
  
  extension [Self <: BatchAssociateResourcesToCustomLineItemOutput](x: Self) {
    
    inline def setFailedAssociatedResources(value: AssociateResourcesResponseList): Self = StObject.set(x, "FailedAssociatedResources", value.asInstanceOf[js.Any])
    
    inline def setFailedAssociatedResourcesUndefined: Self = StObject.set(x, "FailedAssociatedResources", js.undefined)
    
    inline def setFailedAssociatedResourcesVarargs(value: AssociateResourceResponseElement*): Self = StObject.set(x, "FailedAssociatedResources", js.Array(value*))
    
    inline def setSuccessfullyAssociatedResources(value: AssociateResourcesResponseList): Self = StObject.set(x, "SuccessfullyAssociatedResources", value.asInstanceOf[js.Any])
    
    inline def setSuccessfullyAssociatedResourcesUndefined: Self = StObject.set(x, "SuccessfullyAssociatedResources", js.undefined)
    
    inline def setSuccessfullyAssociatedResourcesVarargs(value: AssociateResourceResponseElement*): Self = StObject.set(x, "SuccessfullyAssociatedResources", js.Array(value*))
  }
}
