package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integration extends StObject {
  
  /**
    * A list of request parameters whose values API Gateway caches. To be valid values for cacheKeyParameters, these parameters must also be specified for Method requestParameters.
    */
  var cacheKeyParameters: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * Specifies a group of related cached parameters. By default, API Gateway uses the resource ID as the cacheNamespace. You can specify the same cacheNamespace across resources to return the same cached data for requests to different resources.
    */
  var cacheNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VpcLink used for the integration when connectionType=VPC_LINK and undefined, otherwise.
    */
  var connectionId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.undefined
  
  /**
    * Specifies how to handle request payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehavior is configured to support payload pass-through.
    */
  var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined
  
  /**
    * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::\*:user/\*. To use resource-based permissions on supported AWS services, specify null.
    */
  var credentials: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the integration's HTTP method type.
    */
  var httpMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the integration's responses.
    */
  var integrationResponses: js.UndefOr[MapOfIntegrationResponse] = js.undefined
  
  /**
    * Specifies how the method request body of an unmapped content type will be passed through the integration request to the back end without transformation. A content type is unmapped if no mapping template is defined in the integration or the content type does not match any of the mapped content types, as specified in requestTemplates. The valid value is one of the following: WHEN_NO_MATCH: passes the method request body through the integration request to the back end without transformation when the method request content type does not match any content type associated with the mapping templates defined in the integration request. WHEN_NO_TEMPLATES: passes the method request body through the integration request to the back end without transformation when no mapping template is defined in the integration request. If a template is defined when this option is selected, the method request of an unmapped content-type will be rejected with an HTTP 415 Unsupported Media Type response. NEVER: rejects the method request with an HTTP 415 Unsupported Media Type response when either the method request content type does not match any content type associated with the mapping templates defined in the integration request or no mapping template is defined in the integration request.
    */
  var passthroughBehavior: js.UndefOr[String] = js.undefined
  
  /**
    * A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name must be a valid and unique method request parameter name.
    */
  var requestParameters: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
    */
  var requestTemplates: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
    */
  var timeoutInMillis: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the TLS configuration for an integration.
    */
  var tlsConfig: js.UndefOr[TlsConfig] = js.undefined
  
  /**
    * Specifies an API method integration type. The valid value is one of the following: For the HTTP and HTTP proxy integrations, each integration can specify a protocol (http/https), port and path. Standard 80 and 443 ports are supported as well as custom ports above 1024. An HTTP or HTTP proxy integration with a connectionType of VPC_LINK is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
    */
  var `type`: js.UndefOr[IntegrationType] = js.undefined
  
  /**
    * Specifies Uniform Resource Identifier (URI) of the integration endpoint. For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing. For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated Amazon Web Services service (e.g., s3); and {subdomain} is a designated subdomain supported by certain Amazon Web Services service for fast host-name lookup. action can be used for an Amazon Web Services service action-based API, using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an Amazon Web Services service resource, including the region of the integrated Amazon Web Services service, if applicable. For example, for integration with the S3 API of GetObject, the uri can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key} 
    */
  var uri: js.UndefOr[String] = js.undefined
}
object Integration {
  
  inline def apply(): Integration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integration]
  }
  
  extension [Self <: Integration](x: Self) {
    
    inline def setCacheKeyParameters(value: ListOfString): Self = StObject.set(x, "cacheKeyParameters", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyParametersUndefined: Self = StObject.set(x, "cacheKeyParameters", js.undefined)
    
    inline def setCacheKeyParametersVarargs(value: String*): Self = StObject.set(x, "cacheKeyParameters", js.Array(value*))
    
    inline def setCacheNamespace(value: String): Self = StObject.set(x, "cacheNamespace", value.asInstanceOf[js.Any])
    
    inline def setCacheNamespaceUndefined: Self = StObject.set(x, "cacheNamespace", js.undefined)
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setContentHandling(value: ContentHandlingStrategy): Self = StObject.set(x, "contentHandling", value.asInstanceOf[js.Any])
    
    inline def setContentHandlingUndefined: Self = StObject.set(x, "contentHandling", js.undefined)
    
    inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setIntegrationResponses(value: MapOfIntegrationResponse): Self = StObject.set(x, "integrationResponses", value.asInstanceOf[js.Any])
    
    inline def setIntegrationResponsesUndefined: Self = StObject.set(x, "integrationResponses", js.undefined)
    
    inline def setPassthroughBehavior(value: String): Self = StObject.set(x, "passthroughBehavior", value.asInstanceOf[js.Any])
    
    inline def setPassthroughBehaviorUndefined: Self = StObject.set(x, "passthroughBehavior", js.undefined)
    
    inline def setRequestParameters(value: MapOfStringToString): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
    
    inline def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
    
    inline def setRequestTemplates(value: MapOfStringToString): Self = StObject.set(x, "requestTemplates", value.asInstanceOf[js.Any])
    
    inline def setRequestTemplatesUndefined: Self = StObject.set(x, "requestTemplates", js.undefined)
    
    inline def setTimeoutInMillis(value: Integer): Self = StObject.set(x, "timeoutInMillis", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMillisUndefined: Self = StObject.set(x, "timeoutInMillis", js.undefined)
    
    inline def setTlsConfig(value: TlsConfig): Self = StObject.set(x, "tlsConfig", value.asInstanceOf[js.Any])
    
    inline def setTlsConfigUndefined: Self = StObject.set(x, "tlsConfig", js.undefined)
    
    inline def setType(value: IntegrationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
