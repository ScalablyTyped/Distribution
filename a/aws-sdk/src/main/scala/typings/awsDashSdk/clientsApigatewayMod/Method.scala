package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  /**
    * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
    */
  var apiKeyRequired: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * A list of authorization scopes configured on the method. The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation. The authorization works by matching the method scopes against the scopes parsed from the access token in the incoming request. The method invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide an access token instead of an identity token for authorization purposes.
    */
  var authorizationScopes: js.UndefOr[ListOfString] = js.undefined
  /**
    * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
    */
  var authorizationType: js.UndefOr[String] = js.undefined
  /**
    * The identifier of an Authorizer to use on this method. The authorizationType must be CUSTOM.
    */
  var authorizerId: js.UndefOr[String] = js.undefined
  /**
    * The method's HTTP verb.
    */
  var httpMethod: js.UndefOr[String] = js.undefined
  /**
    * Gets the method's integration responsible for passing the client-submitted request to the back end and performing necessary transformations to make the request compliant with the back end.   Example:  Request  GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} Response The successful response returns a 200 OK status code and a payload similar to the following: { "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }    AWS CLI 
    */
  var methodIntegration: js.UndefOr[Integration] = js.undefined
  /**
    * Gets a method response associated with a given HTTP status code.   The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP status code and the value is a MethodResponse resource that specifies the response returned to the caller from the back end through the integration response. Example: Get a 200 OK response of a GET method Request  GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} Response The successful response returns a 200 OK status code and a payload similar to the following: { "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }    AWS CLI 
    */
  var methodResponses: js.UndefOr[MapOfMethodResponse] = js.undefined
  /**
    * A human-friendly operation identifier for the method. For example, you can assign the operationName of ListPets for the GET /pets method in the PetStore example.
    */
  var operationName: js.UndefOr[String] = js.undefined
  /**
    * A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the request payloads of given content types (as the mapping key).
    */
  var requestModels: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A key is a method request parameter name matching the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name is a valid and unique parameter name. The value associated with the key is a Boolean flag indicating whether the parameter is required (true) or optional (false). The method request parameter names defined here are available in Integration to be mapped to integration request parameters or templates.
    */
  var requestParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
  /**
    * The identifier of a RequestValidator for request validation.
    */
  var requestValidatorId: js.UndefOr[String] = js.undefined
}

object Method {
  @scala.inline
  def apply(
    apiKeyRequired: js.UndefOr[NullableBoolean] = js.undefined,
    authorizationScopes: ListOfString = null,
    authorizationType: String = null,
    authorizerId: String = null,
    httpMethod: String = null,
    methodIntegration: Integration = null,
    methodResponses: MapOfMethodResponse = null,
    operationName: String = null,
    requestModels: MapOfStringToString = null,
    requestParameters: MapOfStringToBoolean = null,
    requestValidatorId: String = null
  ): Method = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiKeyRequired)) __obj.updateDynamic("apiKeyRequired")(apiKeyRequired)
    if (authorizationScopes != null) __obj.updateDynamic("authorizationScopes")(authorizationScopes)
    if (authorizationType != null) __obj.updateDynamic("authorizationType")(authorizationType)
    if (authorizerId != null) __obj.updateDynamic("authorizerId")(authorizerId)
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod)
    if (methodIntegration != null) __obj.updateDynamic("methodIntegration")(methodIntegration)
    if (methodResponses != null) __obj.updateDynamic("methodResponses")(methodResponses)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (requestModels != null) __obj.updateDynamic("requestModels")(requestModels)
    if (requestParameters != null) __obj.updateDynamic("requestParameters")(requestParameters)
    if (requestValidatorId != null) __obj.updateDynamic("requestValidatorId")(requestValidatorId)
    __obj.asInstanceOf[Method]
  }
}

