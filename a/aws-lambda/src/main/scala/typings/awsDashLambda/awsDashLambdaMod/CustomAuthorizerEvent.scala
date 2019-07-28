package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAuthorizerEvent extends js.Object {
  var apiId: js.UndefOr[String] = js.undefined
  var authorizationToken: js.UndefOr[String] = js.undefined
  var domainName: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var httpMethod: js.UndefOr[String] = js.undefined
  var methodArn: String
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pathParameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  var queryStringParameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  var requestContext: js.UndefOr[APIGatewayEventRequestContext] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.undefined
  var `type`: String
}

object CustomAuthorizerEvent {
  @scala.inline
  def apply(
    methodArn: String,
    `type`: String,
    apiId: String = null,
    authorizationToken: String = null,
    domainName: String = null,
    headers: StringDictionary[String] = null,
    httpMethod: String = null,
    multiValueHeaders: StringDictionary[js.Array[String]] = null,
    multiValueQueryStringParameters: StringDictionary[js.Array[String]] = null,
    path: String = null,
    pathParameters: StringDictionary[String] = null,
    queryStringParameters: StringDictionary[String] = null,
    requestContext: APIGatewayEventRequestContext = null,
    resource: String = null,
    stageVariables: StringDictionary[String] = null
  ): CustomAuthorizerEvent = {
    val __obj = js.Dynamic.literal(methodArn = methodArn)
    __obj.updateDynamic("type")(`type`)
    if (apiId != null) __obj.updateDynamic("apiId")(apiId)
    if (authorizationToken != null) __obj.updateDynamic("authorizationToken")(authorizationToken)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    if (multiValueQueryStringParameters != null) __obj.updateDynamic("multiValueQueryStringParameters")(multiValueQueryStringParameters)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters)
    if (queryStringParameters != null) __obj.updateDynamic("queryStringParameters")(queryStringParameters)
    if (requestContext != null) __obj.updateDynamic("requestContext")(requestContext)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (stageVariables != null) __obj.updateDynamic("stageVariables")(stageVariables)
    __obj.asInstanceOf[CustomAuthorizerEvent]
  }
}

