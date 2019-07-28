package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayProxyEvent extends js.Object {
  var body: String | Null
  var headers: StringDictionary[String]
  var httpMethod: String
  var isBase64Encoded: Boolean
  var multiValueHeaders: StringDictionary[js.Array[String]]
  var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null
  var path: String
  var pathParameters: StringDictionary[String] | Null
  var queryStringParameters: StringDictionary[String] | Null
  var requestContext: APIGatewayEventRequestContext
  var resource: String
  var stageVariables: StringDictionary[String] | Null
}

object APIGatewayProxyEvent {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpMethod: String,
    isBase64Encoded: Boolean,
    multiValueHeaders: StringDictionary[js.Array[String]],
    path: String,
    requestContext: APIGatewayEventRequestContext,
    resource: String,
    body: String = null,
    multiValueQueryStringParameters: StringDictionary[js.Array[String]] = null,
    pathParameters: StringDictionary[String] = null,
    queryStringParameters: StringDictionary[String] = null,
    stageVariables: StringDictionary[String] = null
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

