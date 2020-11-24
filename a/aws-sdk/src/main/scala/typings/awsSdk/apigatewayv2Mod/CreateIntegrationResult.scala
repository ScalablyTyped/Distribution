package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIntegrationResult extends js.Object {
  
  /**
    * Specifies whether an integration is managed by API Gateway. If you created an API using using quick create, the resulting integration is managed by API Gateway. You can update a managed integration, but you can't delete it.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.native
  
  /**
    * The ID of the VPC link for a private integration. Supported only for HTTP APIs.
    */
  var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.native
  
  /**
    * The type of the network connection to the integration endpoint. Specify INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and resources in a VPC. The default value is INTERNET.
    */
  var ConnectionType: js.UndefOr[typings.awsSdk.apigatewayv2Mod.ConnectionType] = js.native
  
  /**
    * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string. If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
    */
  var ContentHandlingStrategy: js.UndefOr[typings.awsSdk.apigatewayv2Mod.ContentHandlingStrategy] = js.native
  
  /**
    * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
    */
  var CredentialsArn: js.UndefOr[Arn] = js.native
  
  /**
    * Represents the description of an integration.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * Represents the identifier of an integration.
    */
  var IntegrationId: js.UndefOr[Id] = js.native
  
  /**
    * Specifies the integration's HTTP method type.
    */
  var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.native
  
  /**
    * The integration response selection expression for the integration. Supported only for WebSocket APIs. See Integration Response Selection Expressions.
    */
  var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn more, see Integration subtype reference.
    */
  var IntegrationSubtype: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket APIs. AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action. This integration is also referred to as a Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as the HTTP custom integration. Supported only for WebSocket APIs. HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend. Supported only for WebSocket APIs.
    */
  var IntegrationType: js.UndefOr[typings.awsSdk.apigatewayv2Mod.IntegrationType] = js.native
  
  /**
    * For a Lambda integration, specify the URI of a Lambda function. For an HTTP integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API Gateway uses DiscoverInstances to identify resources. You can use query parameters to target specific resources. To learn more, see DiscoverInstances. For private integrations, all resources must be owned by the same AWS account.
    */
  var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  
  /**
    * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for WebSocket APIs. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
    */
  var PassthroughBehavior: js.UndefOr[typings.awsSdk.apigatewayv2Mod.PassthroughBehavior] = js.native
  
  /**
    * Specifies the format of the payload sent to an integration. Required for HTTP APIs.
    */
  var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.native
  
  /**
    * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name}
    , where  {location}  is querystring, path, or header; and {name} must be a valid and unique method request parameter name. For HTTP APIs, request parameters are a key-value map specifying parameters that are passed to AWS_PROXY integrations with a specified integrationSubtype. You can provide static values, or map request data, stage variables, or context variables that are evaluated at runtime. To learn more, see Working with AWS service integrations for HTTP APIs.
    */
  var RequestParameters: js.UndefOr[IntegrationParameters] = js.native
  
  /**
    * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value. Supported only for WebSocket APIs.
    */
  var RequestTemplates: js.UndefOr[TemplateMap] = js.native
  
  /**
    * The template selection expression for the integration. Supported only for WebSocket APIs.
    */
  var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
    */
  var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.native
  
  /**
    * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic uses the HTTPS protocol. Supported only for HTTP APIs.
    */
  var TlsConfig: js.UndefOr[typings.awsSdk.apigatewayv2Mod.TlsConfig] = js.native
}
object CreateIntegrationResult {
  
  @scala.inline
  def apply(): CreateIntegrationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntegrationResult]
  }
  
  @scala.inline
  implicit class CreateIntegrationResultOps[Self <: CreateIntegrationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiGatewayManaged(value: boolean): Self = this.set("ApiGatewayManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiGatewayManaged: Self = this.set("ApiGatewayManaged", js.undefined)
    
    @scala.inline
    def setConnectionId(value: StringWithLengthBetween1And1024): Self = this.set("ConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionId: Self = this.set("ConnectionId", js.undefined)
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = this.set("ConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionType: Self = this.set("ConnectionType", js.undefined)
    
    @scala.inline
    def setContentHandlingStrategy(value: ContentHandlingStrategy): Self = this.set("ContentHandlingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHandlingStrategy: Self = this.set("ContentHandlingStrategy", js.undefined)
    
    @scala.inline
    def setCredentialsArn(value: Arn): Self = this.set("CredentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialsArn: Self = this.set("CredentialsArn", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIntegrationId(value: Id): Self = this.set("IntegrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationId: Self = this.set("IntegrationId", js.undefined)
    
    @scala.inline
    def setIntegrationMethod(value: StringWithLengthBetween1And64): Self = this.set("IntegrationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationMethod: Self = this.set("IntegrationMethod", js.undefined)
    
    @scala.inline
    def setIntegrationResponseSelectionExpression(value: SelectionExpression): Self = this.set("IntegrationResponseSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationResponseSelectionExpression: Self = this.set("IntegrationResponseSelectionExpression", js.undefined)
    
    @scala.inline
    def setIntegrationSubtype(value: StringWithLengthBetween1And128): Self = this.set("IntegrationSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationSubtype: Self = this.set("IntegrationSubtype", js.undefined)
    
    @scala.inline
    def setIntegrationType(value: IntegrationType): Self = this.set("IntegrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationType: Self = this.set("IntegrationType", js.undefined)
    
    @scala.inline
    def setIntegrationUri(value: UriWithLengthBetween1And2048): Self = this.set("IntegrationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationUri: Self = this.set("IntegrationUri", js.undefined)
    
    @scala.inline
    def setPassthroughBehavior(value: PassthroughBehavior): Self = this.set("PassthroughBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassthroughBehavior: Self = this.set("PassthroughBehavior", js.undefined)
    
    @scala.inline
    def setPayloadFormatVersion(value: StringWithLengthBetween1And64): Self = this.set("PayloadFormatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadFormatVersion: Self = this.set("PayloadFormatVersion", js.undefined)
    
    @scala.inline
    def setRequestParameters(value: IntegrationParameters): Self = this.set("RequestParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestParameters: Self = this.set("RequestParameters", js.undefined)
    
    @scala.inline
    def setRequestTemplates(value: TemplateMap): Self = this.set("RequestTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTemplates: Self = this.set("RequestTemplates", js.undefined)
    
    @scala.inline
    def setTemplateSelectionExpression(value: SelectionExpression): Self = this.set("TemplateSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateSelectionExpression: Self = this.set("TemplateSelectionExpression", js.undefined)
    
    @scala.inline
    def setTimeoutInMillis(value: IntegerWithLengthBetween50And30000): Self = this.set("TimeoutInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInMillis: Self = this.set("TimeoutInMillis", js.undefined)
    
    @scala.inline
    def setTlsConfig(value: TlsConfig): Self = this.set("TlsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsConfig: Self = this.set("TlsConfig", js.undefined)
  }
}
