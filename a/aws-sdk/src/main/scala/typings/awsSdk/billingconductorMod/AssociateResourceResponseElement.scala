package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceResponseElement extends StObject {
  
  /**
    *  The resource ARN that was associated to the custom line item. 
    */
  var Arn: js.UndefOr[CustomLineItemArn] = js.undefined
  
  /**
    *  An AssociateResourceError that will populate if the resource association fails. 
    */
  var Error: js.UndefOr[AssociateResourceError] = js.undefined
}
object AssociateResourceResponseElement {
  
  inline def apply(): AssociateResourceResponseElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResourceResponseElement]
  }
  
  extension [Self <: AssociateResourceResponseElement](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setError(value: AssociateResourceError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
