package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateResourcesFromCustomLineItemOutput extends StObject {
  
  /**
    *  A list of DisassociateResourceResponseElement for each resource that failed disassociation from a percentage custom line item. 
    */
  var FailedDisassociatedResources: js.UndefOr[DisassociateResourcesResponseList] = js.undefined
  
  /**
    *  A list of DisassociateResourceResponseElement for each resource that's been disassociated from a percentage custom line item successfully. 
    */
  var SuccessfullyDisassociatedResources: js.UndefOr[DisassociateResourcesResponseList] = js.undefined
}
object BatchDisassociateResourcesFromCustomLineItemOutput {
  
  inline def apply(): BatchDisassociateResourcesFromCustomLineItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateResourcesFromCustomLineItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDisassociateResourcesFromCustomLineItemOutput] (val x: Self) extends AnyVal {
    
    inline def setFailedDisassociatedResources(value: DisassociateResourcesResponseList): Self = StObject.set(x, "FailedDisassociatedResources", value.asInstanceOf[js.Any])
    
    inline def setFailedDisassociatedResourcesUndefined: Self = StObject.set(x, "FailedDisassociatedResources", js.undefined)
    
    inline def setFailedDisassociatedResourcesVarargs(value: DisassociateResourceResponseElement*): Self = StObject.set(x, "FailedDisassociatedResources", js.Array(value*))
    
    inline def setSuccessfullyDisassociatedResources(value: DisassociateResourcesResponseList): Self = StObject.set(x, "SuccessfullyDisassociatedResources", value.asInstanceOf[js.Any])
    
    inline def setSuccessfullyDisassociatedResourcesUndefined: Self = StObject.set(x, "SuccessfullyDisassociatedResources", js.undefined)
    
    inline def setSuccessfullyDisassociatedResourcesVarargs(value: DisassociateResourceResponseElement*): Self = StObject.set(x, "SuccessfullyDisassociatedResources", js.Array(value*))
  }
}
