package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAuthorizerEvent extends js.Object {
  var apiId: js.UndefOr[java.lang.String] = js.undefined
  var authorizationToken: js.UndefOr[java.lang.String] = js.undefined
  var domainName: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var httpMethod: js.UndefOr[java.lang.String] = js.undefined
  var methodArn: java.lang.String
  var multiValueHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var multiValueQueryStringParameters: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Null
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pathParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
  var queryStringParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
  var requestContext: js.UndefOr[APIGatewayEventRequestContext] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var stageVariables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var `type`: java.lang.String
}

object CustomAuthorizerEvent {
  @scala.inline
  def apply(
    methodArn: java.lang.String,
    `type`: java.lang.String,
    apiId: java.lang.String = null,
    authorizationToken: java.lang.String = null,
    domainName: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    httpMethod: java.lang.String = null,
    multiValueHeaders: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    multiValueQueryStringParameters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    path: java.lang.String = null,
    pathParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    queryStringParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    requestContext: APIGatewayEventRequestContext = null,
    resource: java.lang.String = null,
    stageVariables: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): CustomAuthorizerEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("methodArn")(methodArn)
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

