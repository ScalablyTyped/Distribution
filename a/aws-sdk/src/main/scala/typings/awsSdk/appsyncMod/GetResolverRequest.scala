package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The resolver field name.
    */
  var fieldName: ResourceName
  
  /**
    * The resolver type name.
    */
  var typeName: ResourceName
}
object GetResolverRequest {
  
  inline def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): GetResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRequest]
  }
  
  extension [Self <: GetResolverRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setFieldName(value: ResourceName): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
