package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApiRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * A CORS configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.native
  
  /**
    * This property is part of quick create. It specifies the credentials required for the integration, if any. For a Lambda integration, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null. Currently, this property is not used for HTTP integrations. If provided, this value replaces the credentials associated with the quick create integration. Supported only for HTTP APIs.
    */
  var CredentialsArn: js.UndefOr[Arn] = js.native
  
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * Specifies whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint.
    */
  var DisableExecuteApiEndpoint: js.UndefOr[boolean] = js.native
  
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.native
  
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * This property is part of quick create. If not specified, the route created using quick create is kept. Otherwise, this value replaces the route key of the quick create route. Additional routes may still be added after the API is updated. Supported only for HTTP APIs.
    */
  var RouteKey: js.UndefOr[SelectionKey] = js.native
  
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * This property is part of quick create. For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN. The type of the integration will be HTTP_PROXY or AWS_PROXY, respectively. The value provided updates the integration URI and integration type. You can update a quick-created target, but you can't remove it from an API. Supported only for HTTP APIs.
    */
  var Target: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.native
}
object UpdateApiRequest {
  
  @scala.inline
  def apply(ApiId: string): UpdateApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiRequest]
  }
  
  @scala.inline
  implicit class UpdateApiRequestMutableBuilder[Self <: UpdateApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeySelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ApiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeySelectionExpressionUndefined: Self = StObject.set(x, "ApiKeySelectionExpression", js.undefined)
    
    @scala.inline
    def setCorsConfiguration(value: Cors): Self = StObject.set(x, "CorsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsConfigurationUndefined: Self = StObject.set(x, "CorsConfiguration", js.undefined)
    
    @scala.inline
    def setCredentialsArn(value: Arn): Self = StObject.set(x, "CredentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsArnUndefined: Self = StObject.set(x, "CredentialsArn", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisableExecuteApiEndpoint(value: boolean): Self = StObject.set(x, "DisableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExecuteApiEndpointUndefined: Self = StObject.set(x, "DisableExecuteApiEndpoint", js.undefined)
    
    @scala.inline
    def setDisableSchemaValidation(value: boolean): Self = StObject.set(x, "DisableSchemaValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSchemaValidationUndefined: Self = StObject.set(x, "DisableSchemaValidation", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRouteKey(value: SelectionKey): Self = StObject.set(x, "RouteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteKeyUndefined: Self = StObject.set(x, "RouteKey", js.undefined)
    
    @scala.inline
    def setRouteSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "RouteSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSelectionExpressionUndefined: Self = StObject.set(x, "RouteSelectionExpression", js.undefined)
    
    @scala.inline
    def setTarget(value: UriWithLengthBetween1And2048): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    @scala.inline
    def setVersion(value: StringWithLengthBetween1And64): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
