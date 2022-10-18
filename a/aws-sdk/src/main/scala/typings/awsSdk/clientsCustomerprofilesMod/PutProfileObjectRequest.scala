package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProfileObjectRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * A string that is serialized from a JSON object.
    */
  var Object: stringifiedJson
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: typeName
}
object PutProfileObjectRequest {
  
  inline def apply(DomainName: name, Object: stringifiedJson, ObjectTypeName: typeName): PutProfileObjectRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutProfileObjectRequest]
  }
  
  extension [Self <: PutProfileObjectRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setObject(value: stringifiedJson): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
  }
}
