package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceResponseElement extends StObject {
  
  /**
    *  The resource ARN that was associated to the custom line item. 
    */
  var Arn: js.UndefOr[CustomLineItemAssociationElement] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateResourceResponseElement] (val x: Self) extends AnyVal {
    
    inline def setArn(value: CustomLineItemAssociationElement): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setError(value: AssociateResourceError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
