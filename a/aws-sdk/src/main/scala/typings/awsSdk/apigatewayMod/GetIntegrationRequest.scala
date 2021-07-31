package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationRequest extends StObject {
  
  /**
    * [Required] Specifies a get integration request's HTTP method.
    */
  var httpMethod: String
  
  /**
    * [Required] Specifies a get integration request's resource identifier
    */
  var resourceId: String
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetIntegrationRequest {
  
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): GetIntegrationRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationRequest]
  }
  
  @scala.inline
  implicit class GetIntegrationRequestMutableBuilder[Self <: GetIntegrationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
