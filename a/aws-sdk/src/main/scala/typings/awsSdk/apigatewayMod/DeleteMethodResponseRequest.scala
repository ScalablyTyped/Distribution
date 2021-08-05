package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMethodResponseRequest extends StObject {
  
  /**
    * [Required] The HTTP verb of the Method resource.
    */
  var httpMethod: String
  
  /**
    * [Required] The Resource identifier for the MethodResponse resource.
    */
  var resourceId: String
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * [Required] The status code identifier for the MethodResponse resource.
    */
  var statusCode: StatusCode
}
object DeleteMethodResponseRequest {
  
  inline def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): DeleteMethodResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMethodResponseRequest]
  }
  
  extension [Self <: DeleteMethodResponseRequest](x: Self) {
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
