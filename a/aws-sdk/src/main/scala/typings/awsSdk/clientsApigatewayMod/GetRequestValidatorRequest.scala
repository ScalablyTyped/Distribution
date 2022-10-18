package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRequestValidatorRequest extends StObject {
  
  /**
    * The identifier of the RequestValidator to be retrieved.
    */
  var requestValidatorId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetRequestValidatorRequest {
  
  inline def apply(requestValidatorId: String, restApiId: String): GetRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(requestValidatorId = requestValidatorId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestValidatorRequest]
  }
  
  extension [Self <: GetRequestValidatorRequest](x: Self) {
    
    inline def setRequestValidatorId(value: String): Self = StObject.set(x, "requestValidatorId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
