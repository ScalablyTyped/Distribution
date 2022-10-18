package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationResponseRequest extends StObject {
  
  /**
    * Specifies a get integration response request's HTTP method.
    */
  var httpMethod: String
  
  /**
    * Specifies a get integration response request's resource identifier.
    */
  var resourceId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * Specifies a get integration response request's status code.
    */
  var statusCode: StatusCode
}
object GetIntegrationResponseRequest {
  
  inline def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): GetIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationResponseRequest]
  }
  
  extension [Self <: GetIntegrationResponseRequest](x: Self) {
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
