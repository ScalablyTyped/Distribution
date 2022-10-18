package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTypeRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The type name.
    */
  var typeName: ResourceName
}
object DeleteTypeRequest {
  
  inline def apply(apiId: String, typeName: ResourceName): DeleteTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTypeRequest]
  }
  
  extension [Self <: DeleteTypeRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
