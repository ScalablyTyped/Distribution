package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuthorizerRequest extends StObject {
  
  /**
    * The identifier of the Authorizer resource.
    */
  var authorizerId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object DeleteAuthorizerRequest {
  
  inline def apply(authorizerId: String, restApiId: String): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
  
  extension [Self <: DeleteAuthorizerRequest](x: Self) {
    
    inline def setAuthorizerId(value: String): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
