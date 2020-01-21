package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutIntegrationRequest extends js.Object {
  /**
    * An API-specific tag group of related cached parameters.
    */
  var cacheKeyParameters: js.UndefOr[ListOfString] = js.native
  /**
    * A list of request parameters whose values are to be cached.
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
  def apply(
    httpMethod: String,
    resourceId: String,
    restApiId: String,
    `type`: IntegrationType,
    cacheKeyParameters: ListOfString = null,
    cacheNamespace: String = null,
    connectionId: String = null,
    connectionType: ConnectionType = null,
    contentHandling: ContentHandlingStrategy = null,
    credentials: String = null,
    integrationHttpMethod: String = null,
    passthroughBehavior: String = null,
    requestParameters: MapOfStringToString = null,
    requestTemplates: MapOfStringToString = null,
    timeoutInMillis: Int | scala.Double = null,
    uri: String = null
  ): PutIntegrationRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cacheKeyParameters != null) __obj.updateDynamic("cacheKeyParameters")(cacheKeyParameters.asInstanceOf[js.Any])
    if (cacheNamespace != null) __obj.updateDynamic("cacheNamespace")(cacheNamespace.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (contentHandling != null) __obj.updateDynamic("contentHandling")(contentHandling.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (integrationHttpMethod != null) __obj.updateDynamic("integrationHttpMethod")(integrationHttpMethod.asInstanceOf[js.Any])
    if (passthroughBehavior != null) __obj.updateDynamic("passthroughBehavior")(passthroughBehavior.asInstanceOf[js.Any])
    if (requestParameters != null) __obj.updateDynamic("requestParameters")(requestParameters.asInstanceOf[js.Any])
    if (requestTemplates != null) __obj.updateDynamic("requestTemplates")(requestTemplates.asInstanceOf[js.Any])
    if (timeoutInMillis != null) __obj.updateDynamic("timeoutInMillis")(timeoutInMillis.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntegrationRequest]
  }
}

