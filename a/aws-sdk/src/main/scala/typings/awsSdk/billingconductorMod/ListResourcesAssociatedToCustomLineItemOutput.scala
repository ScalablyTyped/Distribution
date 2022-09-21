package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesAssociatedToCustomLineItemOutput extends StObject {
  
  /**
    *  The custom line item ARN for which the resource associations are listed. 
    */
  var Arn: js.UndefOr[CustomLineItemArn] = js.undefined
  
  /**
    *  A list of ListResourcesAssociatedToCustomLineItemResponseElement for each resource association retrieved. 
    */
  var AssociatedResources: js.UndefOr[ListResourcesAssociatedToCustomLineItemResponseList] = js.undefined
  
  /**
    *  The pagination token to be used in subsequent requests to retrieve additional results. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListResourcesAssociatedToCustomLineItemOutput {
  
  inline def apply(): ListResourcesAssociatedToCustomLineItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemOutput]
  }
  
  extension [Self <: ListResourcesAssociatedToCustomLineItemOutput](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssociatedResources(value: ListResourcesAssociatedToCustomLineItemResponseList): Self = StObject.set(x, "AssociatedResources", value.asInstanceOf[js.Any])
    
    inline def setAssociatedResourcesUndefined: Self = StObject.set(x, "AssociatedResources", js.undefined)
    
    inline def setAssociatedResourcesVarargs(value: ListResourcesAssociatedToCustomLineItemResponseElement*): Self = StObject.set(x, "AssociatedResources", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
