package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAttributeGroupResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the application that was augmented with attributes.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The Amazon resource name (ARN) of the attribute group that contains the application's new attributes.
    */
  var attributeGroupArn: js.UndefOr[AttributeGroupArn] = js.undefined
}
object AssociateAttributeGroupResponse {
  
  inline def apply(): AssociateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAttributeGroupResponse]
  }
  
  extension [Self <: AssociateAttributeGroupResponse](x: Self) {
    
    inline def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "applicationArn", js.undefined)
    
    inline def setAttributeGroupArn(value: AttributeGroupArn): Self = StObject.set(x, "attributeGroupArn", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupArnUndefined: Self = StObject.set(x, "attributeGroupArn", js.undefined)
  }
}
