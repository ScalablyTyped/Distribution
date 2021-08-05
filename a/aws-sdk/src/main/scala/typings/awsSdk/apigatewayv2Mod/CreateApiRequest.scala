package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiRequest extends StObject {
  
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  
  /**
    * A CORS configuration. Supported only for HTTP APIs. See Configuring CORS for more information.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.undefined
  
  /**
    * This property is part of quick create. It specifies the credentials required for the integration, if any. For a Lambda integration, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null. Currently, this property is not used for HTTP integrations. Supported only for HTTP APIs.
    */
  var CredentialsArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * Specifies whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint.
    */
  var DisableExecuteApiEndpoint: js.UndefOr[boolean] = js.undefined
  
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.undefined
  
  /**
    * The name of the API.
    */
  var Name: StringWithLengthBetween1And128
  
  /**
    * The API protocol.
    */
  var ProtocolType: typings.awsSdk.apigatewayv2Mod.ProtocolType
  
  /**
    * This property is part of quick create. If you don't specify a routeKey, a default route of $default is created. The $default route acts as a catch-all for any request made to your API, for a particular stage. The $default route key can't be modified. You can add routes after creating the API, and you can update the route keys of additional routes. Supported only for HTTP APIs.
    */
  var RouteKey: js.UndefOr[SelectionKey] = js.undefined
  
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.undefined
  
  /**
    * This property is part of quick create. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes. For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN. The type of the integration will be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
    */
  var Target: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
  
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
}
object CreateApiRequest {
  
  inline def apply(Name: StringWithLengthBetween1And128, ProtocolType: ProtocolType): CreateApiRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ProtocolType = ProtocolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiRequest]
  }
  
  extension [Self <: CreateApiRequest](x: Self) {
    
    inline def setApiKeySelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ApiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setApiKeySelectionExpressionUndefined: Self = StObject.set(x, "ApiKeySelectionExpression", js.undefined)
    
    inline def setCorsConfiguration(value: Cors): Self = StObject.set(x, "CorsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCorsConfigurationUndefined: Self = StObject.set(x, "CorsConfiguration", js.undefined)
    
    inline def setCredentialsArn(value: Arn): Self = StObject.set(x, "CredentialsArn", value.asInstanceOf[js.Any])
    
    inline def setCredentialsArnUndefined: Self = StObject.set(x, "CredentialsArn", js.undefined)
    
    inline def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisableExecuteApiEndpoint(value: boolean): Self = StObject.set(x, "DisableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDisableExecuteApiEndpointUndefined: Self = StObject.set(x, "DisableExecuteApiEndpoint", js.undefined)
    
    inline def setDisableSchemaValidation(value: boolean): Self = StObject.set(x, "DisableSchemaValidation", value.asInstanceOf[js.Any])
    
    inline def setDisableSchemaValidationUndefined: Self = StObject.set(x, "DisableSchemaValidation", js.undefined)
    
    inline def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProtocolType(value: ProtocolType): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    inline def setRouteKey(value: SelectionKey): Self = StObject.set(x, "RouteKey", value.asInstanceOf[js.Any])
    
    inline def setRouteKeyUndefined: Self = StObject.set(x, "RouteKey", js.undefined)
    
    inline def setRouteSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "RouteSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setRouteSelectionExpressionUndefined: Self = StObject.set(x, "RouteSelectionExpression", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTarget(value: UriWithLengthBetween1And2048): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    inline def setVersion(value: StringWithLengthBetween1And64): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
