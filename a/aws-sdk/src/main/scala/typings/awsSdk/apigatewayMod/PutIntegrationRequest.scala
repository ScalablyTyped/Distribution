package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutIntegrationRequest extends StObject {
  
  /**
    * A list of request parameters whose values API Gateway caches. To be valid values for cacheKeyParameters, these parameters must also be specified for Method requestParameters.
    */
  var cacheKeyParameters: js.UndefOr[ListOfString] = js.native
  
  /**
    * Specifies a group of related cached parameters. By default, API Gateway uses the resource ID as the cacheNamespace. You can specify the same cacheNamespace across resources to return the same cached data for requests to different resources.
    */
  var cacheNamespace: js.UndefOr[String] = js.native
  
  /**
    * The (id) of the VpcLink used for the integration when connectionType=VPC_LINK and undefined, otherwise.
    */
  var connectionId: js.UndefOr[String] = js.native
  
  /**
    * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.native
  
  /**
    * Specifies how to handle request payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a request payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a request payload from a binary blob to a Base64-encoded string.  If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehavior is configured to support payload pass-through.
    */
  var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.native
  
  /**
    * Specifies whether credentials are required for a put integration.
    */
  var credentials: js.UndefOr[String] = js.native
  
  /**
    * [Required] Specifies a put integration request's HTTP method.
    */
  var httpMethod: String = js.native
  
  /**
    * Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
    */
  var integrationHttpMethod: js.UndefOr[String] = js.native
  
  /**
    * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.   WHEN_NO_MATCH passes the request body for unmapped content types through to the integration back end without transformation. NEVER rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response. WHEN_NO_TEMPLATES allows pass-through when the integration has NO content types mapped to templates. However if there is at least one content type defined, unmapped content types will be rejected with the same 415 response. 
    */
  var passthroughBehavior: js.UndefOr[String] = js.native
  
  /**
    * A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name must be a valid and unique method request parameter name.
    */
  var requestParameters: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
    */
  var requestTemplates: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * [Required] Specifies a put integration request's resource ID.
    */
  var resourceId: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
    */
  var timeoutInMillis: js.UndefOr[NullableInteger] = js.native
  
  var tlsConfig: js.UndefOr[TlsConfig] = js.native
  
  /**
    * [Required] Specifies a put integration input's type.
    */
  var `type`: IntegrationType = js.native
  
  /**
    * Specifies Uniform Resource Identifier (URI) of the integration endpoint.   For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.    For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the uri can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key} 
    */
  var uri: js.UndefOr[String] = js.native
}
object PutIntegrationRequest {
  
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, `type`: IntegrationType): PutIntegrationRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntegrationRequest]
  }
  
  @scala.inline
  implicit class PutIntegrationRequestMutableBuilder[Self <: PutIntegrationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheKeyParameters(value: ListOfString): Self = StObject.set(x, "cacheKeyParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKeyParametersUndefined: Self = StObject.set(x, "cacheKeyParameters", js.undefined)
    
    @scala.inline
    def setCacheKeyParametersVarargs(value: String*): Self = StObject.set(x, "cacheKeyParameters", js.Array(value :_*))
    
    @scala.inline
    def setCacheNamespace(value: String): Self = StObject.set(x, "cacheNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNamespaceUndefined: Self = StObject.set(x, "cacheNamespace", js.undefined)
    
    @scala.inline
    def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    @scala.inline
    def setContentHandling(value: ContentHandlingStrategy): Self = StObject.set(x, "contentHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHandlingUndefined: Self = StObject.set(x, "contentHandling", js.undefined)
    
    @scala.inline
    def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationHttpMethod(value: String): Self = StObject.set(x, "integrationHttpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationHttpMethodUndefined: Self = StObject.set(x, "integrationHttpMethod", js.undefined)
    
    @scala.inline
    def setPassthroughBehavior(value: String): Self = StObject.set(x, "passthroughBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassthroughBehaviorUndefined: Self = StObject.set(x, "passthroughBehavior", js.undefined)
    
    @scala.inline
    def setRequestParameters(value: MapOfStringToString): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
    
    @scala.inline
    def setRequestTemplates(value: MapOfStringToString): Self = StObject.set(x, "requestTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTemplatesUndefined: Self = StObject.set(x, "requestTemplates", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMillis(value: NullableInteger): Self = StObject.set(x, "timeoutInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMillisUndefined: Self = StObject.set(x, "timeoutInMillis", js.undefined)
    
    @scala.inline
    def setTlsConfig(value: TlsConfig): Self = StObject.set(x, "tlsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsConfigUndefined: Self = StObject.set(x, "tlsConfig", js.undefined)
    
    @scala.inline
    def setType(value: IntegrationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
