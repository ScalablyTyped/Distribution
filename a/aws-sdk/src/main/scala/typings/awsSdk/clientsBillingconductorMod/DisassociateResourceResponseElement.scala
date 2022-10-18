package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResourceResponseElement extends StObject {
  
  /**
    *  The resource ARN that was disassociated from the custom line item. 
    */
  var Arn: js.UndefOr[CustomLineItemArn] = js.undefined
  
  /**
    *  An AssociateResourceError shown if the resource disassociation fails. 
    */
  var Error: js.UndefOr[AssociateResourceError] = js.undefined
}
object DisassociateResourceResponseElement {
  
  inline def apply(): DisassociateResourceResponseElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResourceResponseElement]
  }
  
  extension [Self <: DisassociateResourceResponseElement](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setError(value: AssociateResourceError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
