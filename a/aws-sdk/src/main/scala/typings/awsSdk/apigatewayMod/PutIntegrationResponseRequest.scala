package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutIntegrationResponseRequest extends StObject {
  
  /**
    * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.  If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined
  
  /**
    * [Required] Specifies a put integration response request's HTTP method.
    */
  var httpMethod: String
  
  /**
    * [Required] Specifies a put integration response request's resource identifier.
    */
  var resourceId: String
  
  /**
    * A key-value map specifying response parameters that are passed to the method response from the back end. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name must be a valid and unique response header name and JSON-expression a valid JSON expression without the $ prefix.
    */
  var responseParameters: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * Specifies a put integration response's templates.
    */
  var responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * Specifies the selection pattern of a put integration response.
    */
  var selectionPattern: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] Specifies the status code that is used to map the integration response to an existing MethodResponse.
    */
  var statusCode: StatusCode
}
object PutIntegrationResponseRequest {
  
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): PutIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntegrationResponseRequest]
  }
  
  @scala.inline
  implicit class PutIntegrationResponseRequestMutableBuilder[Self <: PutIntegrationResponseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentHandling(value: ContentHandlingStrategy): Self = StObject.set(x, "contentHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHandlingUndefined: Self = StObject.set(x, "contentHandling", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParameters(value: MapOfStringToString): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: MapOfStringToString): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionPattern(value: String): Self = StObject.set(x, "selectionPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionPatternUndefined: Self = StObject.set(x, "selectionPattern", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
