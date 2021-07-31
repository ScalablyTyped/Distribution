package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntegrationResponseRequest extends StObject {
  
  /**
    * [Required] Specifies a delete integration response request's HTTP method.
    */
  var httpMethod: String
  
  /**
    * [Required] Specifies a delete integration response request's resource identifier.
    */
  var resourceId: String
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * [Required] Specifies a delete integration response request's status code.
    */
  var statusCode: StatusCode
}
object DeleteIntegrationResponseRequest {
  
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): DeleteIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntegrationResponseRequest]
  }
  
  @scala.inline
  implicit class DeleteIntegrationResponseRequestMutableBuilder[Self <: DeleteIntegrationResponseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
