package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttributeGroupRequest extends StObject {
  
  /**
    *  The name, ID, or ARN of the attribute group that holds the attributes to describe the application. 
    */
  var attributeGroup: AttributeGroupSpecifier
}
object DeleteAttributeGroupRequest {
  
  inline def apply(attributeGroup: AttributeGroupSpecifier): DeleteAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(attributeGroup = attributeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttributeGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAttributeGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributeGroup(value: AttributeGroupSpecifier): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
  }
}
