package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The resolver field name.
    */
  var fieldName: ResourceName
  
  /**
    * The name of the resolver type.
    */
  var typeName: ResourceName
}
object DeleteResolverRequest {
  
  inline def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): DeleteResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResolverRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setFieldName(value: ResourceName): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
