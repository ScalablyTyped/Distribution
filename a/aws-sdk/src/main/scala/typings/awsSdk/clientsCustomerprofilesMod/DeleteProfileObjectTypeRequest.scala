package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileObjectTypeRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: typeName
}
object DeleteProfileObjectTypeRequest {
  
  inline def apply(DomainName: name, ObjectTypeName: typeName): DeleteProfileObjectTypeRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfileObjectTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProfileObjectTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
  }
}
