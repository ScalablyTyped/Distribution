package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrationResponse extends StObject {
  
  /**
    * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string. If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
    */
  var ContentHandlingStrategy: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.ContentHandlingStrategy] = js.undefined
  
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: js.UndefOr[Id] = js.undefined
  
  /**
    * The integration response key.
    */
  var IntegrationResponseKey: SelectionKey
  
  /**
    * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
    */
  var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
  
  /**
    * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
    */
  var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
  
  /**
    * The template selection expressions for the integration response.
    */
  var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
}
object IntegrationResponse {
  
  inline def apply(IntegrationResponseKey: SelectionKey): IntegrationResponse = {
    val __obj = js.Dynamic.literal(IntegrationResponseKey = IntegrationResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationResponse]
  }
  
  extension [Self <: IntegrationResponse](x: Self) {
    
    inline def setContentHandlingStrategy(value: ContentHandlingStrategy): Self = StObject.set(x, "ContentHandlingStrategy", value.asInstanceOf[js.Any])
    
    inline def setContentHandlingStrategyUndefined: Self = StObject.set(x, "ContentHandlingStrategy", js.undefined)
    
    inline def setIntegrationResponseId(value: Id): Self = StObject.set(x, "IntegrationResponseId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationResponseIdUndefined: Self = StObject.set(x, "IntegrationResponseId", js.undefined)
    
    inline def setIntegrationResponseKey(value: SelectionKey): Self = StObject.set(x, "IntegrationResponseKey", value.asInstanceOf[js.Any])
    
    inline def setResponseParameters(value: IntegrationParameters): Self = StObject.set(x, "ResponseParameters", value.asInstanceOf[js.Any])
    
    inline def setResponseParametersUndefined: Self = StObject.set(x, "ResponseParameters", js.undefined)
    
    inline def setResponseTemplates(value: TemplateMap): Self = StObject.set(x, "ResponseTemplates", value.asInstanceOf[js.Any])
    
    inline def setResponseTemplatesUndefined: Self = StObject.set(x, "ResponseTemplates", js.undefined)
    
    inline def setTemplateSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "TemplateSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setTemplateSelectionExpressionUndefined: Self = StObject.set(x, "TemplateSelectionExpression", js.undefined)
  }
}
