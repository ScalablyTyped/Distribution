package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMethodRequest extends StObject {
  
  /**
    * Specifies the method request's HTTP method type.
    */
  var httpMethod: String
  
  /**
    * The Resource identifier for the Method resource.
    */
  var resourceId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetMethodRequest {
  
  inline def apply(httpMethod: String, resourceId: String, restApiId: String): GetMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMethodRequest]
  }
  
  extension [Self <: GetMethodRequest](x: Self) {
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
