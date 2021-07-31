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
    * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
    */
  var responseType: GatewayResponseType
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * The HTTP status code of the GatewayResponse.
    */
  var statusCode: js.UndefOr[StatusCode] = js.undefined
}
object PutGatewayResponseRequest {
  
  @scala.inline
  def apply(responseType: GatewayResponseType, restApiId: String): PutGatewayResponseRequest = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutGatewayResponseRequest]
  }
  
  @scala.inline
  implicit class PutGatewayResponseRequestMutableBuilder[Self <: PutGatewayResponseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseParameters(value: MapOfStringToString): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: MapOfStringToString): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
    
    @scala.inline
    def setResponseType(value: GatewayResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
