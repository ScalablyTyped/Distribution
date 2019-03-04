package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayProxyEvent extends js.Object {
  var body: java.lang.String | scala.Null
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var httpMethod: java.lang.String
  var isBase64Encoded: scala.Boolean
  var multiValueHeaders: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var multiValueQueryStringParameters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Null
  var path: java.lang.String
  var pathParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var queryStringParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var requestContext: APIGatewayEventRequestContext
  var resource: java.lang.String
  var stageVariables: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
}

object APIGatewayProxyEvent {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    httpMethod: java.lang.String,
    isBase64Encoded: scala.Boolean,
    multiValueHeaders: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    path: java.lang.String,
    requestContext: APIGatewayEventRequestContext,
    resource: java.lang.String,
    body: java.lang.String = null,
    multiValueQueryStringParameters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    pathParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    queryStringParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    stageVariables: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): APIGatewayProxyEvent = {
    val __obj = js.Dynamic.literal(headers = headers, httpMethod = httpMethod, isBase64Encoded = isBase64Encoded, multiValueHeaders = multiValueHeaders, path = path, requestContext = requestContext, resource = resource)
    if (body != null) __obj.updateDynamic("body")(body)
    if (multiValueQueryStringParameters != null) __obj.updateDynamic("multiValueQueryStringParameters")(multiValueQueryStringParameters)
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters)
    if (queryStringParameters != null) __obj.updateDynamic("queryStringParameters")(queryStringParameters)
    if (stageVariables != null) __obj.updateDynamic("stageVariables")(stageVariables)
    __obj.asInstanceOf[APIGatewayProxyEvent]
  }
}

