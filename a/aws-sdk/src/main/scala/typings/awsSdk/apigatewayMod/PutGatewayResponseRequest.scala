package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutGatewayResponseRequest extends StObject {
  
  /**
    * Response parameters (paths, query strings and headers) of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseParameters: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The response type of the associated GatewayResponse
    */
  var responseType: GatewayResponseType
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * The HTTP status code of the GatewayResponse.
    */
  var statusCode: js.UndefOr[StatusCode] = js.undefined
}
object PutGatewayResponseRequest {
  
  inline def apply(responseType: GatewayResponseType, restApiId: String): PutGatewayResponseRequest = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutGatewayResponseRequest]
  }
  
  extension [Self <: PutGatewayResponseRequest](x: Self) {
    
    inline def setResponseParameters(value: MapOfStringToString): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
    
    inline def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
    
    inline def setResponseTemplates(value: MapOfStringToString): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
    
    inline def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
    
    inline def setResponseType(value: GatewayResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
