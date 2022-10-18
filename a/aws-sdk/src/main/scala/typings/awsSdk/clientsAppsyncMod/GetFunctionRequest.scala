package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionRequest extends StObject {
  
  /**
    * The GraphQL API ID.
    */
  var apiId: String
  
  /**
    * The Function ID.
    */
  var functionId: ResourceName
}
object GetFunctionRequest {
  
  inline def apply(apiId: String, functionId: ResourceName): GetFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionRequest]
  }
  
  extension [Self <: GetFunctionRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setFunctionId(value: ResourceName): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
  }
}
