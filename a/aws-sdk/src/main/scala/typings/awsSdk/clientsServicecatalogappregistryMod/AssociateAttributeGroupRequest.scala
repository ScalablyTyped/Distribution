package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAttributeGroupRequest extends StObject {
  
  /**
    *  The name, ID, or ARN of the application. 
    */
  var application: ApplicationSpecifier
  
  /**
    *  The name, ID, or ARN of the attribute group that holds the attributes to describe the application. 
    */
  var attributeGroup: AttributeGroupSpecifier
}
object AssociateAttributeGroupRequest {
  
  inline def apply(application: ApplicationSpecifier, attributeGroup: AttributeGroupSpecifier): AssociateAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], attributeGroup = attributeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAttributeGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateAttributeGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroup(value: AttributeGroupSpecifier): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
  }
}
